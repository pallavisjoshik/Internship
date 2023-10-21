import React from "react";
import SimpleImageSlider from "react-simple-image-slider";
export default function App() {
//    const Portfolio = [
//       {
//          url: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOi0mWLRO2c4favdUBtcHm8KiB9pAtWnkihu4-e8nY0g&s",
//       },
//       {
//          url: "https://media.istockphoto.com/id/1402577565/photo/colour-swatches-book.webp?b=1&s=170667a&w=0&k=20&c=5oYyljXxGN1aolUSuyLLAii11_bcDb-tiVq0iGV7N5I=",
//       },
//       {
//          url: "https://media.istockphoto.com/id/1402577565/photo/colour-swatches-book.webp?b=1&s=170667a&w=0&k=20&c=5oYyljXxGN1aolUSuyLLAii11_bcDb-tiVq0iGV7N5I=",
//       },
//       {
//          url: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOi0mWLRO2c4favdUBtcHm8KiB9pAtWnkihu4-e8nY0g&s",
//       },
//       {
//          url: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOi0mWLRO2c4favdUBtcHm8KiB9pAtWnkihu4-e8nY0g&s",
//       },
//       {
//          url: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOi0mWLRO2c4favdUBtcHm8KiB9pAtWnkihu4-e8nY0g&s",
//       },
//    ];

    const Portfolio = [
        {
        url: require('../images/portfolio-05.jpg'),
        },
        {
            url: require("../images/portfolio-05.jpg"),
        },
        {
            url: require("../images/portfolio-04.jpg"),
        },
        {
            url: require("../images/portfolio-03.jpg"),
        }
    ];

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
                            <SimpleImageSlider
                                width={500}
                                height={250}
                                images={Portfolio}
                                showNavs={true}
                            />
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