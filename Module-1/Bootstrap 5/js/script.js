// Main JavaScript for Bootstrap 5 Master Practice Project

document.addEventListener('DOMContentLoaded', function () {
  // Initialize Bootstrap tooltips
  const tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'));
  tooltipTriggerList.map(function (tooltipTriggerEl) {
    return new bootstrap.Tooltip(tooltipTriggerEl);
  });

  // Initialize Bootstrap toasts
  const toastElList = [].slice.call(document.querySelectorAll('.toast'));
  toastElList.map(function (toastEl) {
    return new bootstrap.Toast(toastEl);
  });

  // Smooth scroll for internal anchor links
  document.querySelectorAll('a[href^="#"]').forEach(function (anchor) {
    anchor.addEventListener('click', function (event) {
      const target = document.querySelector(this.getAttribute('href'));
      if (target) {
        event.preventDefault();
        target.scrollIntoView({ behavior: 'smooth', block: 'start' });
      }
    });
  });

  // Scroll to top button
  const topScroll = document.querySelector('#scrollTopButton');
  window.addEventListener('scroll', function () {
    if (window.scrollY > 350) {
      topScroll.classList.add('show');
    } else {
      topScroll.classList.remove('show');
    }
  });
  topScroll?.addEventListener('click', function () {
    window.scrollTo({ top: 0, behavior: 'smooth' });
  });

  // Dark / light mode toggle
  const themeToggle = document.querySelector('#themeToggle');
  const currentTheme = localStorage.getItem('site-theme');
  if (currentTheme === 'dark') {
    document.documentElement.classList.add('dark-mode');
    themeToggle.checked = true;
  }
  themeToggle?.addEventListener('change', function () {
    document.documentElement.classList.toggle('dark-mode');
    const theme = document.documentElement.classList.contains('dark-mode') ? 'dark' : 'light';
    localStorage.setItem('site-theme', theme);
  });

  // Bootstrap form validation and toast helper
  const forms = document.querySelectorAll('.needs-validation');
  forms.forEach(function (form) {
    form.addEventListener('submit', function (event) {
      if (!form.checkValidity()) {
        event.preventDefault();
        event.stopPropagation();
      } else {
        event.preventDefault();
        const successToast = document.querySelector('#successToast');
        const toast = new bootstrap.Toast(successToast);
        toast.show();
        form.reset();
      }
      form.classList.add('was-validated');
    }, false);
  });

  // Search filtering for cards and list items
  const filterInput = document.querySelector('#searchFilter');
  const filterCards = document.querySelectorAll('.filter-item');
  filterInput?.addEventListener('input', function () {
    const query = this.value.toLowerCase();
    filterCards.forEach(function (card) {
      const text = card.textContent.toLowerCase();
      card.style.display = text.includes(query) ? '' : 'none';
    });
  });

  // Toast trigger buttons
  document.querySelectorAll('[data-bs-target="#successToast"]').forEach(function (button) {
    button.addEventListener('click', function () {
      const toastElement = document.querySelector('#successToast');
      new bootstrap.Toast(toastElement).show();
    });
  });
});
