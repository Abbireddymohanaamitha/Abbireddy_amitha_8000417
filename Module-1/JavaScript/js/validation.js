function validateRegistration() {
  const fullName = document.getElementById('fullName');
  const email = document.getElementById('email');
  const password = document.getElementById('password');
  const phone = document.getElementById('phone');
  const message = document.getElementById('registrationMessage');

  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const phonePattern = /^[0-9]{10}$/;

  if (!fullName.value.trim()) {
    message.textContent = 'Please enter your full name.';
    fullName.focus();
    return false;
  }

  if (!emailPattern.test(email.value)) {
    message.textContent = 'Please enter a valid email address.';
    email.focus();
    return false;
  }

  if (password.value.length < 8) {
    message.textContent = 'Password must be at least 8 characters long.';
    password.focus();
    return false;
  }

  if (!phonePattern.test(phone.value)) {
    message.textContent = 'Phone number should be a 10-digit number.';
    phone.focus();
    return false;
  }

  const registrationData = {
    name: fullName.value.trim(),
    email: email.value.trim(),
    date: document.getElementById('eventDate').value,
    type: document.querySelector('input[name="eventType"]:checked')?.value || '',
    tickets: document.getElementById('tickets').value,
    location: document.getElementById('locationSelect').value,
    comments: document.getElementById('comments').value.trim()
  };

  const savedRegistrations = JSON.parse(localStorage.getItem('eventRegistrations') || '[]');
  savedRegistrations.push(registrationData);
  localStorage.setItem('eventRegistrations', JSON.stringify(savedRegistrations));

  message.textContent = 'Registration saved successfully! Thank you.';
  message.style.color = '#67d5b5';
  document.getElementById('registrationForm').reset();
  return false;
}

function validateFeedback() {
  const ratingInputs = document.querySelectorAll('input[name="rating"]');
  const comment = document.getElementById('feedbackComments');
  const nameInput = document.getElementById('feedbackName');
  const emailInput = document.getElementById('feedbackEmail');
  const message = document.getElementById('feedbackMessage');

  const selectedRating = Array.from(ratingInputs).find(input => input.checked);
  if (!selectedRating) {
    message.textContent = 'Please choose a rating for the event.';
    return false;
  }

  if (comment.value.trim().length < 10) {
    message.textContent = 'Please provide a comment with at least 10 characters.';
    comment.focus();
    return false;
  }

  const feedbackEntry = {
    name: nameInput.value.trim(),
    email: emailInput.value.trim(),
    rating: selectedRating.value,
    comment: comment.value.trim(),
    date: new Date().toISOString()
  };

  const existingFeedback = JSON.parse(localStorage.getItem('communityFeedback') || '[]');
  existingFeedback.unshift(feedbackEntry);
  localStorage.setItem('communityFeedback', JSON.stringify(existingFeedback));

  message.textContent = 'Thank you for your feedback!';
  message.style.color = '#67d5b5';
  document.getElementById('feedbackForm').reset();
  if (typeof renderSavedFeedback === 'function') {
    renderSavedFeedback();
  }
  return false;
}
