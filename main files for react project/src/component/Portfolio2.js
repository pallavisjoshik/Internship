import React, { Component } from "react";
import Slider from "react-slick";
import './SimpleSlider.css'; // Create a CSS file for styling

export default class SimpleSlider extends Component {
  render() {
    const settings = {
      dots: true,
      infinite: true,
      speed: 500,
      slidesToShow: 1,
      slidesToScroll: 1
    };

    return (
        
      <div className="container">
         <div className="row">
         <div className="col-lg-12">
             <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="100" data-aos-once="true" className="section-title text-center">
                 <span className="subtitle">Visit my portfolio and keep your feedback</span>
                 <h2 className="title">My Portfolio</h2>
             </div>
         </div>
        {/* ... Your other HTML content ... */}
        <div className="thumbnail">
          <div className="slider-container">
            <h2>Single Item</h2>
            <Slider {...settings}>
              <div>
                <img src={require('../images/portfolio-01.jpg')} alt="Image 1" />
              </div>
              <div>
                <img src={require('../images/portfolio-02.jpg')} alt="Image 2" />
              </div>
              <div>
                <img src={require('../images/portfolio-03.jpg')} alt="Image 3" />
              </div>
              <div>
                <img src={require('../images/portfolio-04.jpg')} alt="Image 4" />
              </div>
              <div>
                <img src={require('../images/portfolio-05.jpg')} alt="Image 5" />
              </div>
              <div>
                <img src={require('../images/portfolio-06.jpg')} alt="Image 6" />
              </div>
            </Slider>
          </div>
        </div>
      </div>
      </div>
    );
  }
}
