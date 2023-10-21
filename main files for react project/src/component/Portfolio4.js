import React, { Component } from "react";
import Slider from "react-slick";
import './SimpleSlider.css'; // Create a CSS file for styling
// ... Your other imports ...

import CustomPrevArrow from './CustomPrevArrow'; // Adjust the path accordingly
import CustomNextArrow from './CustomNextArrow'; // Adjust the path accordingly

// ... Your component code ...


export default class SimpleSlider extends Component {
  render() {
    const settings = {
      dots: true,
      infinite: true,
      speed: 500,
      slidesToShow: 1,
      slidesToScroll: 1,
      prevArrow: <CustomPrevArrow />, // Add custom previous arrow component
      nextArrow: <CustomNextArrow />, // Add custom next arrow component
    };

    const slides = [
      {
        image: require('../images/portfolio-01.jpg'),
        title: 'Image 1',
      },
      {
        image: require('../images/portfolio-02.jpg'),
        title: 'Image 2',
      },
      {
        image: require('../images/portfolio-03.jpg'),
        title: 'Image 3',
      },
      {
        image: require('../images/portfolio-04.jpg'),
        title: 'Image 4',
      },
      {
        image: require('../images/portfolio-05.jpg'),
        title: 'Image 5',
      },
      {
        image: require('../images/portfolio-06.jpg'),
        title: 'Image 6',
      },
    ];

    return (
      <div className="container">
        {/* ... Your other HTML content ... */}
        <div className="thumbnail">
          <div className="slider-container">
            <h2>Single Item</h2>
            <Slider {...settings}>
              {slides.map((slide, index) => (
                <div key={index}>
                  <img src={slide.image} alt={slide.title} />
                  <h3>{slide.title}</h3>
                </div>
              ))}
            </Slider>
          </div>
        </div>
      </div>
    );
  }
}


