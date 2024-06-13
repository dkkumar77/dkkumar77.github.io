document.addEventListener('DOMContentLoaded', () => {
    const typedOutput = document.getElementById('typed-output');
    const text = "Computer Science graduate with a keen interest in network security, database management, and cloud computing. Proficient in AWS for deploying applications and implementing security measures. Seeking career opportunities to leverage my skills in a dynamic work environment etc. etc. etc.";

    // Define keywords and types for syntax highlighting
    const keywords = ['Computer Science', 'keen interest', 'Proficient', 'Seeking career opportunities'];
    const types = ['network security', 'database management', 'cloud computing', 'AWS', 'deploying applications', 'implementing security measures', 'dynamic work environment'];

    // Function to wrap tokens with span elements and apply appropriate classes
    function highlightText(text) {
        const words = text.split(' ');
        const highlightedText = words.map(word => {
            if (keywords.includes(word)) {
                return `<span class="keyword">${word}</span>`;
            } else if (types.includes(word)) {
                return `<span class="type">${word}</span>`;
            } else {
                return word;
            }
        });
        return highlightedText.join(' ');
    }

    // Initialize currentIndex for typing animation
    let currentIndex = 0;

    // Interval function to type text with syntax highlighting
    const intervalId = setInterval(() => {
        const newText = text.slice(0, currentIndex);
        typedOutput.innerHTML = highlightText(newText);
        currentIndex++;
        if (currentIndex > text.length) clearInterval(intervalId);
    }, 50);
});