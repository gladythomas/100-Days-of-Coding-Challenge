import "./App.css";
 
function App() {
  return (
    <div>
      <form onSubmit={(event) => event.preventDefault()}>
        <input type="text" name="username"  />
        <input type="password" name="password"  />
        <input type="submit" value="Submit" />
      </form>
    </div>
  );
}
 
export default App;