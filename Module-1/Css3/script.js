/* =====================================================
   LOCAL COMMUNITY EVENT PORTAL - JAVASCRIPT
   All interactive features and enhancements
   ===================================================== */

// =====================================================
// DOM ELEMENTS SELECTION
// =====================================================

const mobileMenuToggle = document.getElementById('mobileMenuToggle');
const navbar = document.getElementById('navbar');
const navLinks = document.querySelectorAll('.nav-link');
const registrationForm = document.querySelector('.registration-form');

// =====================================================
// MOBILE NAVIGATION TOGGLE
// =====================================================

/**
 * Toggle mobile navigation menu
 * Shows/hides the navigation bar on mobile devices
 */
if (mobileMenuToggle) {
    mobileMenuToggle.addEventListener('click', function() {
        // Toggle active class on button
        mobileMenuToggle.classList.toggle('active');
        
        // Toggle active class on navbar
        navbar.classList.toggle('active');
    });
}

// =====================================================
// SMOOTH SCROLLING FOR NAVIGATION LINKS
// =====================================================

/**
 * Smooth scroll to section when navigation link is clicked
 * Closes mobile menu after clicking a link
 */
navLinks.forEach(link => {
    link.addEventListener('click', function(e) {
        e.preventDefault();
        
        // Get the target section ID
        const targetId = this.getAttribute('href').substring(1);
        const targetSection = document.getElementById(targetId);
        
        // Perform smooth scroll
        if (targetSection) {
            // For browsers that support scroll-behavior: smooth
            targetSection.scrollIntoView({
                behavior: 'smooth',
                block: 'start'
            });
            
            // Close mobile menu after clicking a link
            mobileMenuToggle.classList.remove('active');
            navbar.classList.remove('active');
        }
    });
});

// =====================================================
// SCROLL TO SECTION FUNCTION (Called from HTML)
// =====================================================

/**
 * Scroll to a specific section smoothly
 * This function is called from HTML onclick handlers
 * @param {string} selector - CSS selector of the target element
 */
function scrollToSection(selector) {
    const element = document.querySelector(selector);
    if (element) {
        element.scrollIntoView({
            behavior: 'smooth',
            block: 'start'
        });
    }
}

// =====================================================
// FORM SUBMISSION HANDLER
// =====================================================

/**
 * Handle registration form submission
 * Displays validation message and resets form
 * @param {Event} event - The form submission event
 */
function handleFormSubmit(event) {
    event.preventDefault();
    
    // Get form values
    const fullName = document.getElementById('fullName').value;
    const email = document.getElementById('email').value;
    const eventSelect = document.getElementById('eventSelect').value;
    
    // Validate that required fields are filled
    if (!fullName || !email || !eventSelect) {
        alert('❌ Please fill in all required fields!');
        return;
    }
    
    // Email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
        alert('❌ Please enter a valid email address!');
        return;
    }
    
    // Success message
    alert(`✅ Thank you, ${fullName}!\n\nYour registration for "${eventSelect.replace(/-/g, ' ').toUpperCase()}" has been submitted.\n\nWe'll send confirmation details to: ${email}`);
    
    // Reset the form
    registrationForm.reset();
    
    // Optional: Show additional confirmation in console
    console.log('Registration submitted:', {
        name: fullName,
        email: email,
        event: eventSelect,
        timestamp: new Date().toLocaleString()
    });
}

// =====================================================
// EVENT REGISTRATION ALERTS
// =====================================================

/**
 * These functions are called directly from HTML onclick handlers
 * They show alerts when event registration buttons are clicked
 * Examples are embedded in the HTML for each event card
 */

// Note: Alerts for event registration are handled directly 
// in the HTML using onclick="alert(...)"
// This keeps the code simple and beginner-friendly

// =====================================================
// PAGE LOAD EVENT LISTENER
// =====================================================

/**
 * Initialize functionality when page loads
 * Logs initialization message to console
 */
document.addEventListener('DOMContentLoaded', function() {
    console.log('🎉 Local Community Event Portal loaded successfully!');
    console.log('All interactive features are ready to use.');
    
    // Optional: Add animation on page load
    addPageLoadAnimation();
    
    // Optional: Log browser information
    console.log('Browser:', navigator.userAgent);
});

// =====================================================
// PAGE LOAD ANIMATION
// =====================================================

/**
 * Add fade-in animation to event cards when page loads
 * Creates a smooth visual effect as elements appear
 */
function addPageLoadAnimation() {
    const eventCards = document.querySelectorAll('.eventCard');
    
    eventCards.forEach((card, index) => {
        // Set initial state
        card.style.opacity = '0';
        card.style.transform = 'translateY(20px)';
        
        // Add animation delay based on card index
        setTimeout(() => {
            card.style.transition = 'all 0.6s ease';
            card.style.opacity = '1';
            card.style.transform = 'translateY(0)';
        }, index * 100); // Stagger animations
    });
}

// =====================================================
// SMOOTH SCROLL POLYFILL
// =====================================================

/**
 * Fallback for browsers that don't support scroll-behavior: smooth
 * Uses JavaScript to animate scroll for better compatibility
 */
function smoothScroll(element) {
    const targetPosition = element.offsetTop;
    const startPosition = window.pageYOffset;
    const distance = targetPosition - startPosition;
    const duration = 1000; // 1 second
    let start = null;
    
    window.requestAnimationFrame(function step(timestamp) {
        if (!start) start = timestamp;
        const progress = timestamp - start;
        
        // Easing function for smooth motion
        const ease = progress < duration 
            ? progress / duration 
            : 1;
        
        window.scrollTo(0, startPosition + distance * ease);
        
        if (progress < duration) {
            window.requestAnimationFrame(step);
        }
    });
}

// =====================================================
// TABLE INTERACTIVITY (Optional Enhancement)
// =====================================================

/**
 * Add hover effects to admin table rows
 * Shows row details on hover
 */
function initializeTableInteractivity() {
    const tableRows = document.querySelectorAll('.admin-table tbody tr');
    
    tableRows.forEach(row => {
        row.addEventListener('mouseenter', function() {
            // Could add more detailed info display here
            console.log('Hovered row:', this.textContent);
        });
    });
}

// Initialize table interactivity when DOM is loaded
document.addEventListener('DOMContentLoaded', initializeTableInteractivity);

// =====================================================
// FORM INPUT VALIDATION (Real-time)
// =====================================================

/**
 * Real-time validation for form inputs
 * Provides immediate feedback to users
 */
function initializeFormValidation() {
    const nameInput = document.getElementById('fullName');
    const emailInput = document.getElementById('email');
    const phoneInput = document.getElementById('phone');
    
    // Validate name (letters and spaces only)
    if (nameInput) {
        nameInput.addEventListener('blur', function() {
            const nameRegex = /^[a-zA-Z\s]+$/;
            if (this.value && !nameRegex.test(this.value)) {
                console.warn('⚠️  Name should contain only letters and spaces');
                this.style.borderColor = '#e74c3c';
            } else {
                this.style.borderColor = '#e0e0e0';
            }
        });
    }
    
    // Validate email in real-time
    if (emailInput) {
        emailInput.addEventListener('blur', function() {
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (this.value && !emailRegex.test(this.value)) {
                console.warn('⚠️  Please enter a valid email address');
                this.style.borderColor = '#e74c3c';
            } else {
                this.style.borderColor = '#e0e0e0';
            }
        });
    }
    
    // Validate phone (10-14 digits)
    if (phoneInput) {
        phoneInput.addEventListener('blur', function() {
            const phoneRegex = /^\d{10,14}$/;
            if (this.value && !phoneRegex.test(this.value)) {
                console.warn('⚠️  Please enter a valid phone number');
                this.style.borderColor = '#e74c3c';
            } else {
                this.style.borderColor = '#e0e0e0';
            }
        });
    }
}

// Initialize form validation when DOM is loaded
document.addEventListener('DOMContentLoaded', initializeFormValidation);

// =====================================================
// KEYBOARD NAVIGATION ENHANCEMENT
// =====================================================

/**
 * Handle keyboard shortcuts for accessibility
 * Press 'H' to scroll to hero banner
 * Press 'E' to scroll to events section
 */
document.addEventListener('keydown', function(event) {
    // Only trigger if not typing in an input field
    if (event.target.tagName === 'INPUT' || event.target.tagName === 'TEXTAREA') {
        return;
    }
    
    // Keyboard shortcuts
    if (event.key.toLowerCase() === 'h') {
        scrollToSection('#home');
    } else if (event.key.toLowerCase() === 'e') {
        scrollToSection('#events');
    }
});

// =====================================================
// SCROLL SPY (Highlight active navigation link)
// =====================================================

/**
 * Highlight the current section in the navigation menu
 * Updates as user scrolls through the page
 */
function initializeScrollSpy() {
    const sections = document.querySelectorAll('section[id]');
    
    window.addEventListener('scroll', () => {
        let current = '';
        
        sections.forEach(section => {
            const sectionTop = section.offsetTop;
            const sectionHeight = section.clientHeight;
            
            if (pageYOffset >= sectionTop - 200) {
                current = section.getAttribute('id');
            }
        });
        
        navLinks.forEach(link => {
            link.classList.remove('active');
            if (link.getAttribute('href') === `#${current}`) {
                link.classList.add('active');
            }
        });
    });
}

// Initialize scroll spy when DOM is loaded
document.addEventListener('DOMContentLoaded', initializeScrollSpy);

// =====================================================
// PERFORMANCE MONITORING
// =====================================================

/**
 * Log performance metrics to console
 * Helps identify slow loading times
 */
window.addEventListener('load', function() {
    const perfData = window.performance.timing;
    const pageLoadTime = perfData.loadEventEnd - perfData.navigationStart;
    
    console.log('📊 Page Performance Metrics:');
    console.log(`Total load time: ${pageLoadTime}ms`);
    console.log(`DOM content loaded: ${perfData.domContentLoadedEventEnd - perfData.navigationStart}ms`);
});

// =====================================================
// ERROR HANDLING
// =====================================================

/**
 * Global error handler for better debugging
 */
window.addEventListener('error', function(event) {
    console.error('❌ Error detected:', {
        message: event.message,
        filename: event.filename,
        lineno: event.lineno,
        colno: event.colno
    });
});

// =====================================================
// UTILITY FUNCTIONS
// =====================================================

/**
 * Log a message with a nice format
 * @param {string} message - The message to log
 * @param {string} type - Type of message: 'info', 'success', 'warning', 'error'
 */
function logMessage(message, type = 'info') {
    const styles = {
        info: 'color: #005AA7; font-weight: bold;',
        success: 'color: #27ae60; font-weight: bold;',
        warning: 'color: #e74c3c; font-weight: bold;',
        error: 'color: #c0392b; font-weight: bold;'
    };
    
    console.log(`%c${message}`, styles[type] || styles.info);
}

// =====================================================
// INITIALIZE ALL FEATURES ON PAGE LOAD
// =====================================================

/**
 * Master initialization function
 * Calls all setup functions when the page is ready
 */
function initializeAllFeatures() {
    console.log('🚀 Initializing Local Community Event Portal...');
    
    // All initialization happens through DOMContentLoaded listeners above
    logMessage('✅ All features initialized successfully!', 'success');
}

// Call initialization when page is fully loaded
window.addEventListener('load', initializeAllFeatures);

// ===================================================== 
// END OF SCRIPT.JS
// ===================================================== 
