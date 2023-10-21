import React from 'react'
import '../Navbar.css'

export default function Navbar() {
  return (
    <>
  

<nav className="navbar navbar-expand-lg navbar-light bg-light">
  <div className="container">
    {/* <!-- Logo on the left --> */}
    <a className="navbar-brand" href="/">
      <img src={require('../images/logo-dark.png')}alt="Your Logo" width="100"/>
    </a>
    
    {/* <!-- Navbar toggler button for small screens --> */}
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    
    <div className="collapse navbar-collapse" id="navbarNav">
      <ul className="navbar-nav mr-auto">
        {/* <!-- Add your navigation links here --> */}
        <li className="nav-item">
          <a className="nav-link" href="/">HOME</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">EXPERIENCE</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">EDUCATION</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">RESUME</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">PORTFOLIO</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">BLOG</a>
        </li>
        <li className="nav-item">
          <a className="nav-link" href="/">FOOTER</a>
        </li>
        
      </ul>
      
      {/* <!-- Buy Now button on the right --> */}
      <div className="my-2 my-lg-0">
        <a href="/" className="btn btn-primary">Buy Now</a>
      </div>
    </div>
  </div>
</nav>




    </>
  )
}

