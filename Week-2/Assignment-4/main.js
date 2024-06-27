let mainMessage = document.querySelector("main h1");
let actionButton = document.querySelector("#action-button");

mainMessage.addEventListener("click", () => {
  mainMessage.textContent= "Have a Good Time!";
});

actionButton.addEventListener("click", () => {
  const cardListItem = document.querySelectorAll(
    ".card-list > li:nth-child(n+5)"
  );

  /**
   * depending on the content of the actionButton to show reamining listitems
   * or not.
   */
  const isShowingMore = actionButton.textContent === "Show More";
  const displayStyle = isShowingMore ? "block" : "none";

  for (const item of cardListItem) {
    item.style.display = displayStyle;
  }

  actionButton.textContent= isShowingMore ? "Show Less" : "Show More";
});
