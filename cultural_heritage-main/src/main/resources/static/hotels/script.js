const sliders = document.querySelectorAll('.image-slider');

sliders.forEach(slider => {
    let images = slider.querySelectorAll('img');
    let currentIndex = 0;

    setInterval(() => {
        images[currentIndex].style.display = 'none';
        currentIndex = (currentIndex + 1) % images.length;
        images[currentIndex].style.display = 'block';
    }, 3000); // Change image every 3 seconds
});