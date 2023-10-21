import React from 'react';
import { Carousel } from 'react-responsive-carousel';

export default function Portfolio() {
  return (
    <>
         {/* <!-- Start Portfolio Area --> */}
        <div id="portfolio" className="rn-portfolio-area portfolio-style-three rn-section-gap section-separator">
            <div className="container">
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
                        <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="200" data-aos-once="true" className="portfolio-wrapper portfolio-slick-activation slick-arrow-style-one rn-slick-dot-style">

                            {/* <!-- Start Single Portfolio  --> */}
                            <div className="rn-portfolio-slick">
                                <div className="rn-portfolio" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                                    <div className="inner">
                                        <div className="thumbnail">
                                            <a href="javascript:void(0)">
                                                <img src={require('../images/portfolio-06.jpg')} alt="Personal Portfolio Images"/>
                                            </a>
                                        </div>
                                        <div className="content">
                                            <div className="category-info">
                                                <div className="category-list">
                                                    <a href="javascript:void(0)">PHOTOSHOP</a>
                                                </div>
                                                <div className="meta">
                                                    <span><a href="javascript:void(0)"><i className="feather-heart"></i></a>
                                                        650</span>
                                                </div>
                                            </div>
                                            <h4 className="title"><a href="javascript:void(0)">The services provide for design<i
                                                        className="feather-arrow-up-right"></i></a></h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            {/* <!-- End Single Portfolio  -->

                            <!-- Start Single Portfolio  --> */}
                            <div className="rn-portfolio-slick">
                                <div className="rn-portfolio" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                                    <div className="inner">
                                        <div className="thumbnail">
                                            <a href="javascript:void(0)">
                                                <img src={require('../images/portfolio-05.jpg')} alt="Personal Portfolio Images"/>
                                            </a>
                                        </div>
                                        <div className="content">
                                            <div className="category-info">
                                                <div className="category-list">
                                                    <a href="javascript:void(0)">Figma</a>
                                                </div>
                                                <div className="meta">
                                                    <span><a href="javascript:void(0)"><i className="feather-heart"></i></a>
                                                        650</span>
                                                </div>
                                            </div>
                                            <h4 className="title"><a href="javascript:void(0)">Mobile app landing design & Services<i
                                                        className="feather-arrow-up-right"></i></a></h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            {/* <!-- End Single Portfolio  -->

                            <!-- Start Single Portfolio  --> */}
                            <div className="rn-portfolio-slick">
                                <div className="rn-portfolio" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                                    <div className="inner">
                                        <div className="thumbnail">
                                            <a href="javascript:void(0)">
                                                <img src={require('../images/portfolio-04.jpg')} alt="Personal Portfolio Images"/>
                                            </a>
                                        </div>
                                        <div className="content">
                                            <div className="category-info">
                                                <div className="category-list">
                                                    <a href="javascript:void(0)">Laravel</a>
                                                </div>
                                                <div className="meta">
                                                    <span><a href="javascript:void(0)"><i className="feather-heart"></i></a>
                                                        650</span>
                                                </div>
                                            </div>
                                            <h4 className="title"><a href="javascript:void(0)">Web app Responsive design & Services<i
                                                        className="feather-arrow-up-right"></i></a></h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            {/* <!-- End Single Portfolio  -->

                            <!-- Start Single Portfolio  --> */}
                            <div className="rn-portfolio-slick">
                                <div className="rn-portfolio" data-bs-toggle="modal" data-bs-target="#exampleModalCenter">
                                    <div className="inner">
                                        <div className="thumbnail">
                                            <a href="javascript:void(0)">
                                                <img src={require('../images/portfolio-03.jpg')} alt="Personal Portfolio Images"/>
                                            </a>
                                        </div>
                                        <div className="content">
                                            <div className="category-info">
                                                <div className="category-list">
                                                    <a href="javascript:void(0)">Figma</a>
                                                </div>
                                                <div className="meta">
                                                    <span><a href="javascript:void(0)"><i className="feather-heart"></i></a>
                                                        650</span>
                                                </div>
                                            </div>
                                            <h4 className="title"><a href="javascript:void(0)">PHP with app landing design & Services<i
                                                        className="feather-arrow-up-right"></i></a></h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            {/* <!-- End Single Portfolio  --> */}

                        </div>
                    </div>
                </div>
            </div>
        </div>
        {/* <!-- End portfolio Area -->

        <!-- Start News Area --> */}
        <div className="rn-blog-area rn-section-gap section-separator" id="blog">
            <div className="container">
                <div className="row">
                    <div className="col-lg-12">
                        <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="100" data-aos-once="true" className="section-title text-center">
                            <span className="subtitle">Visit my blog and keep your feedback</span>
                            <h2 className="title">My Blog</h2>
                        </div>
                    </div>
                </div>
                <div className="row row--25 mt--30 mt_md--10 mt_sm--10">

                    {/* <!-- Start Single blog --> */}
                    <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="100" data-aos-once="true" className="col-lg-6 col-xl-4 mt--30 col-md-6 col-sm-12 col-12 mt--30">
                        <div className="rn-blog" data-bs-toggle="modal" data-bs-target="#exampleModalCenters">
                            <div className="inner">
                                <div className="thumbnail">
                                    <a href="javascript:void(0)">
                                        <img src={require('../images/blog-01.jpg')} alt="Personal Portfolio Images"/>
                                    </a>
                                </div>
                                <div className="content">
                                    <div className="category-info">
                                        <div className="category-list">
                                            <a href="javascript:void(0)">Canada</a>
                                        </div>
                                        <div className="meta">
                                            <span><i className="feather-clock"></i> 2 min read</span>
                                        </div>
                                    </div>
                                    <h4 className="title"><a href="javascript:void(0)">T-shirt design is the part of design
                                            <i className="feather-arrow-up-right"></i></a></h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* <!-- End Single blog -->

                    <!-- Start Single blog --> */}
                    <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="150" data-aos-once="true" className="col-lg-6 col-xl-4 mt--30 col-md-6 col-sm-12 col-12 mt--30">
                        <div className="rn-blog" data-bs-toggle="modal" data-bs-target="#exampleModalCenters">
                            <div className="inner">
                                <div className="thumbnail">
                                    <a href="javascript:void(0)">
                                        <img src={require('../images/blog-02.jpg')}  alt="Personal Portfolio Images"/>
                                    </a>
                                </div>
                                <div className="content">
                                    <div className="category-info">
                                        <div className="category-list">
                                            <a href="javascript:void(0)">Development</a>
                                        </div>
                                        <div className="meta">
                                            <span><i className="feather-clock"></i> 2 hour read</span>
                                        </div>
                                    </div>
                                    <h4 className="title"><a href="javascript:void(0)">The services provide for design <i
                                        className="feather-arrow-up-right"></i></a></h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* <!-- End Single blog -->

                    <!-- Start Single blog --> */}
                    <div data-aos="fade-up" data-aos-duration="500" data-aos-delay="200" data-aos-once="true" className="col-lg-6 col-xl-4 mt--30 col-md-6 col-sm-12 col-12 mt--30">
                        <div className="rn-blog" data-bs-toggle="modal" data-bs-target="#exampleModalCenters">
                            <div className="inner">
                                <div className="thumbnail">
                                    <a href="javascript:void(0)">
                                        <img src={require('../images/blog-03.jpg')}  alt="Personal Portfolio Images"/>
                                    </a>
                                </div>
                                <div className="content">
                                    <div className="category-info">
                                        <div className="category-list">
                                            <a href="javascript:void(0)">Application</a>
                                        </div>
                                        <div className="meta">
                                            <span><i className="feather-clock"></i> 5 min read</span>
                                        </div>
                                    </div>
                                    <h4 className="title"><a href="javascript:void(0)">Mobile app landing design & app
                                            maintain<i className="feather-arrow-up-right"></i></a></h4>
                                </div>
                            </div>
                        </div>
                    </div>
                    {/* <!-- End Single blog --> */}

                </div>
            </div>
        </div>
        {/* <!-- ENd Mews Area -->
        <!-- Modal Portfolio Body area Start --> */}
    <div className="modal fade" id="exampleModalCenter" tabIndex={"-1"} role="dialog" aria-hidden="true">
            <div className="modal-dialog modal-dialog-centered" role="document">
                <div className="modal-content">
                    <div className="modal-header">
                        <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true"><i data-feather="x"></i></span>
                        </button>
                    </div>
                    <div className="modal-body">
                        <div className="row align-items-center">

                            <div className="col-lg-6">
                                <div className="portfolio-popup-thumbnail">
                                    <div className="image">
                                        <img className="w-100" src={require('../images/portfolio-04.jpg')} alt="slide"/>
                                    </div>
                                </div>
                            </div>

                            <div className="col-lg-6">
                                <div className="text-content">
                                    <h3>
                                        <span>Featured - Design</span> App Design Development.
                                    </h3>
                                    <p className="mb--30">Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate distinctio assumenda explicabo veniam temporibus eligendi.</p>
                                    <p>Consectetur adipisicing elit. Cupiditate distinctio assumenda. dolorum alias suscipit rerum maiores aliquam earum odit, nihil culpa quas iusto hic minus!</p>
                                    <div className="button-group mt--20">
                                        <a href="/" className="rn-btn thumbs-icon">
                                            <span>LIKE THIS</span>
                                            <i data-feather="thumbs-up"></i>
                                        </a>
                                        <a href="/" className="rn-btn">
                                            <span>VIEW PROJECT</span>
                                            <i data-feather="chevron-right"></i>
                                        </a>
                                    </div>

                                </div>
                                {/* <!-- End of .text-content --> */}
                            </div>
                        </div>
                        {/* <!-- End of .row Body--> */}
                    </div>
                </div>
            </div>
        </div>
        {/* <!-- End Modal Portfolio area -->
        <!-- Modal Blog Body area Start --> */}
        <div className="modal fade" id="exampleModalCenters" tabIndex={"-1"} role="dialog" aria-hidden="true">
            <div className="modal-dialog modal-dialog-centered modal-news" role="document">
                <div className="modal-content">

                    <div className="modal-header">
                        <button type="button" className="close" data-bs-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true"><i data-feather="x"></i></span>
                        </button>
                    </div>

                    {/* <!-- End of .modal-header --> */}

                    <div className="modal-body">
                        <img src={require('../images/blog-big-01.jpg')} alt="news modal" className="img-fluid modal-feat-img"/>
                        <div className="news-details">
                            <span className="date">2 May, 2021</span>
                            <h2 className="title">Digital Marketo to Their New Office.</h2>
                            <p>Nobis eleifend option congue nihil imperdiet doming id quod mazim placerat
                                facer
                                possim assum.
                                Typi non
                                habent claritatem insitam; est usus legentis in iis qui facit eorum
                                claritatem.
                                Investigationes
                                demonstraverunt
                                lectores legere me lius quod ii legunt saepius. Claritas est etiam processus
                                dynamicus, qui
                                sequitur
                                mutationem consuetudium lectorum.</p>
                            <h4>Nobis eleifend option conguenes.</h4>
                            <p>Mauris tempor, orci id pellentesque convallis, massa mi congue eros, sed
                                posuere
                                massa nunc quis
                                dui.
                                Integer ornare varius mi, in vehicula orci scelerisque sed. Fusce a massa
                                nisi.
                                Curabitur sit
                                amet
                                suscipit nisl. Sed eget nisl laoreet, suscipit enim nec, viverra eros. Nunc
                                imperdiet risus
                                leo,
                                in rutrum erat dignissim id.</p>
                            <p>Ut rhoncus vestibulum facilisis. Duis et lorem vitae ligula cursus venenatis.
                                className aptent
                                taciti sociosqu
                                ad litora torquent per conubia nostra, per inceptos himenaeos. Nunc vitae
                                nisi
                                tortor. Morbi
                                leo
                                nulla, posuere vel lectus a, egestas posuere lacus. Fusce eleifend hendrerit
                                bibendum. Morbi
                                nec
                                efficitur ex.</p>
                            <h4>Mauris tempor, orci id pellentesque.</h4>
                            <p>Nulla non ligula vel nisi blandit egestas vel eget leo. Praesent fringilla
                                dapibus dignissim.
                                Pellentesque
                                quis quam enim. Vestibulum ultrices, leo id suscipit efficitur, odio lorem
                                rhoncus dolor, a
                                facilisis
                                neque mi ut ex. Quisque tempor urna a nisi pretium, a pretium massa
                                tristique.
                                Nullam in
                                aliquam
                                diam. Maecenas at nibh gravida, ornare eros non, commodo ligula. Sed
                                efficitur
                                sollicitudin
                                auctor.
                                Quisque nec imperdiet purus, in ornare odio. Quisque odio felis, vestibulum
                                et.</p>
                        </div>

                        {/* <!-- Comment Section Area Start --> */}
                        <div className="comment-inner">
                            <h3 className="title mb--40 mt--50">Leave a Reply</h3>
                            <form action="#">
                                <div className="row">
                                    <div className="col-lg-6 col-md-12 col-12">
                                        <div className="rnform-group"><input type="text" placeholder="Name"/>
                                        </div>
                                        <div className="rnform-group"><input type="email" placeholder="Email"/>
                                        </div>
                                        <div className="rnform-group"><input type="text" placeholder="Website"/>
                                        </div>
                                    </div>
                                    <div className="col-lg-6 col-md-12 col-12">
                                        <div className="rnform-group">
                                            <textarea placeholder="Comment"></textarea>
                                        </div>
                                    </div>
                                    <div className="col-lg-12">
                                        <a className="rn-btn" href="/"><span>SUBMIT NOW</span></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                        {/* <!-- Comment Section End --> */}
                    </div>
                    {/* <!-- End of .modal-body --> */}
                </div>
            </div>
        </div>
        {/* <!-- End Modal Blog area -->
        <!-- Back to  top Start --> */}
        <div className="backto-top">
            <div>
                <i data-feather="arrow-up"></i>
            </div>
        </div>
        {/* <!-- Back to top end -->
        <!-- Start Right Demo  --> */}
        <div className="rn-right-demo">
            <button className="demo-button">
                <span className="text">Demos</span>
            </button>
        </div>
        {/* <!-- End Right Demo  -->

        <!-- Start Modal Area  --> */}
        <div className="demo-modal-area">
            <div className="wrapper">
                <div className="close-icon">
                    <button className="demo-close-btn"><span className="feather-x"></span></button>
                </div>
                <div className="rn-modal-inner">
                    <div className="demo-top text-center">
                        <h4 className="title">InBio</h4>
                        <p className="subtitle">Its a personal portfolio template. You can built any personal website easily.</p>
                    </div>
                    <ul className="popuptab-area nav nav-tabs" id="popuptab" role="tablist">
                        <li className="nav-item">
                            <a className="nav-link active demo-dark" id="demodark-tab" data-bs-toggle="tab" href="#demodark" role="tab" aria-controls="demodark" aria-selected="true">Dark Demo</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link demo-light" id="demolight-tab" data-bs-toggle="tab" href="#demolight" role="tab" aria-controls="demolight" aria-selected="false">Light Demo</a>
                        </li>
                    </ul>
                    <div className="tab-content" id="popuptabContent">
                        <div className="tab-pane show active" id="demodark" role="tabpanel" aria-labelledby="demodark-tab">
                            <div className="content">
                                <div className="row">

                                    {/* <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index.html">
                                                        <img className="w-100" src={require('../images/main-demo.png')}  alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index.html">Main Demo</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-2">
                                                <div className="thumbnail">
                                                    <a href="index-technician.html">
                                                        <img className="w-100" src={require('../images/index-technician.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-technician.html">Technician</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-2">
                                                <div className="thumbnail">
                                                    <a href="index-model.html">
                                                        <img className="w-100" src={require('../images/home-model-v2.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-model.html">Model</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="home-consulting.html">
                                                        <img className="w-100" src={require('../images/home-consulting.png')}  alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-consulting.html">Consulting</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="fashion-designer.html">
                                                        <img className="w-100" src={require('../images/fashion-designer.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="fashion-designer.html">Fashion Designer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index-developer.html">
                                                        <img className="w-100" src={require('../images/developer.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-developer.html">Developer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="instructor-fitness.html">
                                                        <img className="w-100" src={require('../images/instructor-fitness.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="instructor-fitness.html">Fitness Instructor</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->
                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="home-web-Developer.html">
                                                        <img className="w-100" src={require('../images/home-model.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-web-Developer.html">Web Developer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-designer.html">
                                                        <img className="w-100" src={require('../images/home-video.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-designer.html">Designer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-content-writer.html">
                                                        <img className="w-100" src={require('../images/text-rotet.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-content-writer.html">Content Writter</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-instructor.html">
                                                        <img className="w-100" src={require('../images/index-boxed.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-instructor.html">Instructor</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-freelancer.html">
                                                        <img className="w-100" src={require('../images/home-sticky.png')}  alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-freelancer.html">Freelancer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-photographer.html">
                                                        <img className="w-100" src={require('../images/index-bg-image.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-photographer.html">Photographer</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index-politician.html">
                                                        <img className="w-100" src={require('../images/front-end.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-politician.html">Politician</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo coming-soon">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="/">
                                                        <img className="w-100" src={require('../images/coming-soon.png')} alt="Personal Portfolio"/>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="/">Accountant</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  --> */}

                                </div>
                            </div>
                        </div>


                        <div className="tab-pane" id="demolight" role="tabpanel" aria-labelledby="demolight-tab">
                            <div className="content">
                                <div className="row">

                                    {/* <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index-white-version.html">
                                                        <img className="w-100" src={require('../images/main-demo-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-white-version.html">Main Demo</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-2">
                                                <div className="thumbnail">
                                                    <a href="index-technician-white-version.html">
                                                        <img className="w-100" src= {require('../images/index-technician-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-technician-white-version.html">Technician</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-2">
                                                <div className="thumbnail">
                                                    <a href="index-model-white-version.html">
                                                        <img className="w-100" src= {require('../images/home-model-v2-white.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-model-white-version.html">Model</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="home-consulting-white-version.html">
                                                        <img className="w-100" src={require('../images/home-consulting-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-consulting-white-version.html">Consulting</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="fashion-designer-white-version.html">
                                                        <img className="w-100" src= {require('../images/fashion-designer-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="fashion-designer-white-version.html">Fashion Designer</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index-developer-white-version.html">
                                                        <img className="w-100" src={require('../images/developer-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-developer-white-version.html">Developer</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->
                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="instructor-fitness-white-version.html">
                                                        <img className="w-100" src= {require('../images/instructor-fitness-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="instructor-fitness-white-version.html">Fitness Instructor</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->
                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner badge-1">
                                                <div className="thumbnail">
                                                    <a href="home-web-developer-white-version.html">
                                                        <img className="w-100" src= {require('../images/home-model-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-web-developer-white-version.html">Web Developer</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-designer-white-version.html">
                                                        <img className="w-100" src={require('../images/home-model-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-designer-white-version.html">Designer</a>
                                                    </h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-content-writer-white-version.html">
                                                        <img className="w-100" src= {require('../images/text-rotet-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-content-writer-white-version.html">Content
                                                            Writter</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-instructor-white-version.html">
                                                        <img className="w-100" src={require('../images/index-boxed-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-instructor-white-version.html">Instructor</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-freelancer-white-version.html">
                                                        <img className="w-100" src={require('../images/home-sticky-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-freelancer-white-version.html">Freelancer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="home-photographer-white-version.html">
                                                        <img className="w-100" src= {require('../images/index-bg-image-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="home-photographer-white-version.html">Photographer</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="index-politician-white-version.html">
                                                        <img className="w-100" src= {require('../images/front-end-white-version.png')} alt="Personal Portfolio"/>
                                                        <span className="overlay-content">
                                                    <span className="overlay-text">View Demo <i
                                                            className="feather-external-link"></i></span>
                                                        </span>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="index-politician-white-version.html">Politician</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  -->

                                    <!-- Start Single Content  --> */}
                                    <div className="col-lg-4 col-md-6 col-12">
                                        <div className="single-demo coming-soon">
                                            <div className="inner">
                                                <div className="thumbnail">
                                                    <a href="/">
                                                        <img className="w-100" src= {require('../images/coming-soon.png')}  alt="Personal Portfolio"/>
                                                    </a>
                                                </div>
                                                <div className="inner">
                                                    <h3 className="title"><a href="/">Accountant</a></h3>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    {/* <!-- End Single Content  --> */}

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        {/* <!-- End Modal Area  --> */}

    </>
  )
}
