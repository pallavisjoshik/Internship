import React from 'react'

export default function Footer() {
  return (
    <>
      {/* <!-- social sharea area --> */}
                <div class="social-share-style-1 mt--40">
                    <span class="title">find with me</span>
                    <ul class="social-share d-flex liststyle">
                        <li class="facebook"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-facebook">
                                    <path d="M18 2h-3a5 5 0 0 0-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 0 1 1-1h3z"></path>
                                </svg></a>
                        </li>
                        <li class="instagram"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-instagram">
                                    <rect x="2" y="2" width="20" height="20" rx="5" ry="5"></rect>
                                    <path d="M16 11.37A4 4 0 1 1 12.63 8 4 4 0 0 1 16 11.37z"></path>
                                    <line x1="17.5" y1="6.5" x2="17.51" y2="6.5"></line>
                                </svg></a>
                        </li>
                        <li class="linkedin"><a href="#"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-linkedin">
                                    <path d="M16 8a6 6 0 0 1 6 6v7h-4v-7a2 2 0 0 0-2-2 2 2 0 0 0-2 2v7h-4v-7a6 6 0 0 1 6-6z"></path>
                                    <rect x="2" y="9" width="4" height="12"></rect>
                                    <circle cx="4" cy="4" r="2"></circle>
                                </svg></a>
                        </li>
                    </ul>
                </div>
                {/* <!-- end --> */}
       {/* <!-- Rn footer area Start --> */}
    <div id="footer" className="rn-footer-area footer-style-2 rn-section-gapTop section-separator">
        <div className="container pb--80 pb_sm--40 plr_sm--20">
            <div className="row">
                <div className="col-xl-3 col-12 col-lg-3 col-md-6 col-sm-6 col-12">
                    <div className="logo-thumbnail">
                        <a href="/"><img src={require('../images/logo-dark.png')} alt="logo-image"/></a>
                    </div>
                    <div className="social-icone-wrapper">
                        <ul className="social-share d-flex liststyle">
                            <li className="facebook"><a href="/"><i data-feather="linkedin"></i></a>
                            </li>
                            <li className="instagram"><a href="/"><i data-feather="instagram"></i></a>
                            </li>
                            <li className="linkedin"><a href="/"><i data-feather="twitter"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div className="col-sl-3 col-12 mt_sm--20 col-lg-3 col-md-6 col-sm-6 col-12">
                    <div className="menu-wrapper">
                        <div className="menu-title">
                            <h6>product</h6>
                        </div>
                        <ul className="menu-footer">
                            <li><a href="/">Database</a></li>
                            <li><a href="/">Authentication</a></li>
                            <li><a href="/">Storage</a></li>
                            <li><a href="/">Support</a></li>
                            <li><a href="/">Pricing</a></li>
                        </ul>
                    </div>
                </div>
                <div className="col-sl-3 col-12 mt_sm--20 col-lg-3 col-md-6 col-sm-6 col-12">
                    <div className="menu-wrapper">
                        <div className="menu-title">
                            <h6>Resources</h6>
                        </div>
                        <ul className="menu-footer">
                            <li><a href="/">Authentication</a></li>
                            <li><a href="/">System Status</a></li>
                            <li><a href="/">Terms of service</a></li>
                            <li><a href="/">Pricing</a></li>
                            <li><a href="/">over right</a></li>
                        </ul>
                    </div>
                </div>
                <div className="col-sl-3 col-12 mt_sm--20 col-lg-3 col-md-6 col-sm-6 col-12">
                    <div className="menu-wrapper">
                        <div className="menu-title">
                            <h6>Developers</h6>
                        </div>
                        <ul className="menu-footer">
                            <li><a href="/">Documentation</a></li>
                            <li><a href="/">Authentication</a></li>
                            <li><a href="/">API Reference</a></li>
                            <li><a href="/">Support</a></li>
                            <li><a href="/">Open Source</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div className="copyright text-center ptb--40 section-separator">
            <p className="description">© 2022. All rights reserved by <a target="_blank" href="https://themeforest.net/user/rainbow-themes/portfolio">Rainbow-Themes.</a></p>
        </div>
    </div>
    {/* <!-- Rn footer area end --> */}
    </>
  )
}
