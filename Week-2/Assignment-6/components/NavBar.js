function NavBar() {
  const pathPrefix = "./images/";
  const images = [
    "social_icon.png",
    "bird_logo.png",
    "facebook_logo.png",
    "linkedin_logo.png",
  ];

  return (
    <nav>
      <ul className="main-nav">
        <li className="logo">
          <span>Website/Title</span>
        </li>
        <ul className="item-nav">
          {/**
           * using map to create list
           */}
          {images.map((image) => (
            <li>
              <img src={pathPrefix + image}></img>
            </li>
          ))}
        </ul>
      </ul>
    </nav>
  );
}
