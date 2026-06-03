const eventsData = [
  {
    id: 1,
    title: 'Sunset Market Walk',
    category: 'community',
    date: '2026-06-15',
    time: '5:00 PM',
    location: 'Riverfront Park',
    description: 'Taste local food, browse artisan markets, and enjoy live performances under the sky.',
    image: 'images/event1.jpg'
  },
  {
    id: 2,
    title: 'Green Space Cleanup',
    category: 'volunteer',
    date: '2026-06-18',
    time: '9:00 AM',
    location: 'Eastside Plaza',
    description: 'Help restore community gardens and park spaces with a fun volunteer team.',
    image: 'images/event2.jpg'
  },
  {
    id: 3,
    title: 'Live Music Night',
    category: 'music',
    date: '2026-06-22',
    time: '7:30 PM',
    location: 'Open Air Stage',
    description: 'Enjoy local bands, open mic acts, and community entertainment by the river.',
    image: 'images/event3.jpg'
  },
  {
    id: 4,
    title: 'Community Yoga',
    category: 'wellness',
    date: '2026-06-20',
    time: '8:00 AM',
    location: 'Lakeside Lawn',
    description: 'Start your day with a peaceful outdoor yoga class for all levels.',
    image: 'images/event1.jpg'
  },
  {
    id: 5,
    title: 'Creative Workshop',
    category: 'education',
    date: '2026-06-25',
    time: '4:00 PM',
    location: 'Community Hub',
    description: 'Learn new skills during our paint-and-craft workshop led by local artists.',
    image: 'images/event2.jpg'
  }
];

function renderEvents() {
  const cards = document.getElementById('eventCards');
  if (!cards) return;
  cards.innerHTML = '';

  const query = document.getElementById('searchInput')?.value.trim().toLowerCase() || '';
  const category = document.getElementById('categorySelect')?.value || 'all';

  const filtered = eventsData.filter(event => {
    const matchesCategory = category === 'all' || event.category === category;
    const matchesSearch = event.title.toLowerCase().includes(query) || event.location.toLowerCase().includes(query);
    return matchesCategory && matchesSearch;
  });

  if (!filtered.length) {
    cards.innerHTML = '<p>No matching events were found. Try a different search.</p>';
    return;
  }

  filtered.forEach(event => {
    const article = document.createElement('article');
    article.className = 'card fade-in';
    article.innerHTML = `
      <img src="${event.image}" alt="${event.title}" class="card__image">
      <div class="card__content">
        <h3>${event.title}</h3>
        <p>${event.description}</p>
        <ul>
          <li><strong>Date:</strong> ${event.date}</li>
          <li><strong>Time:</strong> ${event.time}</li>
          <li><strong>Location:</strong> ${event.location}</li>
        </ul>
        <a href="register.html" class="card__link">Register Today</a>
      </div>
    `;
    cards.appendChild(article);
  });
}

function initEventFilters() {
  const searchInput = document.getElementById('searchInput');
  const categorySelect = document.getElementById('categorySelect');
  searchInput?.addEventListener('input', renderEvents);
  categorySelect?.addEventListener('change', renderEvents);
}

renderEvents();
initEventFilters();
