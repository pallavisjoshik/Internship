import React, { Component } from "react";
import Slider from "react-slick";

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
      <div class="container">
      <div className="row">
         <div className="col-lg-12">
             <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="100" data-aos-once="true" className="section-title text-center">
                 <span className="subtitle">Visit my portfolio and keep your feedback</span>
                 <h2 className="title">My Portfolio</h2>
             </div>
         </div>
     </div>

     <div className="row mt--25 mt_md--5 mt_sm--5">
         <div className="col-lg-12">
             <div className="portfolio-wrapper portfolio-slick-activation slick-arrow-style-one rn-slick-dot-style">
             <div className="rn-portfolio-slick">
                 <div className="rn-portfolio">
                     <div className="inner">
                     <div className="thumbnail">
                                        <div>
                                          <h2> Single Item</h2>
                                          <Slider {...settings}>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                            <div>
                                            url: require('../images/portfolio-05.jpg'),
                                            </div>
                                          </Slider>
                                        </div>
      </div>
      </div>
      </div>
      </div>
      </div>
      </div>
      </div>
      </div>
    );
  }
}
