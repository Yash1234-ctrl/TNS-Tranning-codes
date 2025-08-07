
const toggle = document.createElement('button');
toggle.innerText = '🌓 Toggle Dark Mode';
toggle.style.position = 'fixed';
toggle.style.top = '10px';
toggle.style.right = '10px';
document.body.appendChild(toggle);

toggle.addEventListener('click', () => {
  document.body.classList.toggle('dark-mode');
});

const form = document.getElementById('contactForm');
if (form) {
  form.addEventListener('submit', function (e) {
    e.preventDefault();
    alert('Thank you for your message!');
    form.reset();
  });
}
