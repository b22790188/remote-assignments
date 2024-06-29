function MainContentBox() {
  const [clicked, setClicked] = React.useState("Show More");
  const items = [
    "Item1",
    "Item2",
    "Item3",
    "Item4",
    "Item5",
    "Item6",
    "Item7",
    "Item8",
  ];
  /**
   * depending on the content of the actionButton to show reamining listitems
   * or not, using slice to show only 4 items in the beginning.
   */
  const visibleItems = clicked === "Show More" ? items.slice(0, 4) : items;
  const handleClick = () => {
    setClicked(clicked === "Show More" ? "Show Less" : "Show More");
  };

  return (
    <main>
      <Header></Header>
      <section>
        <h2>Section title</h2>
        <ul className="card-list">
          {visibleItems.map((item, index) => (
            <li key={index} className="card-list-item">
              {item}
            </li>
          ))}
        </ul>

        <button onClick={handleClick} id="action-button">
          {clicked}
        </button>
      </section>
    </main>
  );
}
