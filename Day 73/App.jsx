function App() {
  const openLink = () => {
    window.open("https://timetoprogram.com", '_blank', 'noopener, noreferrer');
  };

  return (
    <div>
      <a href="https://google.com" target="_blank" rel="noopener noreferrer">
        Open Link
      </a>

      <button onClick={openLink}>Open Link</button>
    </div>
  );
}