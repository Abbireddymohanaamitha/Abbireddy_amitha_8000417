document.addEventListener('DOMContentLoaded', () => {
  initMenuToggle();
  initThemeToggle();
  applySavedTheme();
  initCountdown();
  renderSavedFeedback();
});

function initMenuToggle() {
  const toggles = document.querySelectorAll('.menu-toggle');
  toggles.forEach(button => {
    button.addEventListener('click', () => {
      const navId = button.getAttribute('aria-controls');
      const nav = document.getElementById(navId);
      if (nav) {
        const expanded = button.getAttribute('aria-expanded') === 'true';
        button.setAttribute('aria-expanded', String(!expanded));
        nav.classList.toggle('open');
      }
    });
  });
}

function initThemeToggle() {
  const themeButtons = document.querySelectorAll('.theme-toggle');
  themeButtons.forEach(button => {
    button.addEventListener('click', () => {
      document.body.classList.toggle('dark-mode');
      const isDark = document.body.classList.contains('dark-mode');
      localStorage.setItem('eventPortalTheme', isDark ? 'dark' : 'light');
      themeButtons.forEach(btn => btn.textContent = isDark ? 'Light Mode' : 'Dark Mode');
    });
  });
}

function applySavedTheme() {
  const savedTheme = localStorage.getItem('eventPortalTheme');
  if (savedTheme === 'dark') {
    document.body.classList.add('dark-mode');
    document.querySelectorAll('.theme-toggle').forEach(btn => btn.textContent = 'Light Mode');
  }
}

function initCountdown() {
  const countdownContainer = document.querySelector('.hero .countdown');
  if (!countdownContainer) return;

  const targetDate = new Date();
  targetDate.setDate(targetDate.getDate() + 12);
  const countdownInterval = setInterval(() => {
    const now = new Date();
    const diff = targetDate - now;
    if (diff <= 0) {
      countdownContainer.textContent = 'Event is happening now!';
      clearInterval(countdownInterval);
      return;
    }
    const days = Math.floor(diff / (1000 * 60 * 60 * 24));
    const hours = Math.floor((diff / (1000 * 60 * 60)) % 24);
    const minutes = Math.floor((diff / (1000 * 60)) % 60);
    countdownContainer.textContent = `${days}d ${hours}h ${minutes}m until the next neighborhood gathering`;
  }, 1000);
}

function renderSavedFeedback() {
  const commentsContainer = document.getElementById('commentsList');
  if (!commentsContainer) return;
  const savedFeedback = JSON.parse(localStorage.getItem('communityFeedback') || '[]');
  commentsContainer.innerHTML = '';
  if (!savedFeedback.length) {
    commentsContainer.innerHTML = '<p>No feedback submitted yet. Be the first to share your thoughts!</p>';
    return;
  }
  savedFeedback.forEach(entry => {
    const card = document.createElement('article');
    card.className = 'comment-card';
    card.innerHTML = `<h3>${entry.name || 'Anonymous'}</h3>
                      <p><strong>Rating:</strong> ${entry.rating} stars</p>
                      <p>${entry.comment}</p>`;
    commentsContainer.appendChild(card);
  });
}
