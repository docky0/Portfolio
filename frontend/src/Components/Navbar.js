import React, { Component } from "react";
import { Link, animateScroll as scroll } from "react-scroll";

export default class Navbar extends Component {
    scrollToTop = () => {
        scroll.scrollToTop();
    };

    render() {
        return (
            <nav className="nav" id="navbar">
                <div className="nav-content">
                    {/*<img*/}
                    {/*src={logo}*/}
                    {/*className="nav-logo"*/}
                    {/*alt="Logo"*/}
                    {/*onClick={this.scrollToTop}*/}
                    {/*/>*/}
                    <ul className="nav-items">
                        <li className="nav-item">
                            <Link
                                activeClass="active"
                                to="section1"
                                spy={true}
                                smooth={true}
                                offset={-70}
                                duration={500}
                            >
                                About me
                            </Link>
                        </li>
                        <li className="nav-item">
                            <Link
                                activeClass="active"
                                to="section2"
                                spy={true}
                                smooth={true}
                                offset={-70}
                                duration={500}
                            >
                                Projects
                            </Link>
                        </li>
                        <li className="nav-item">
                            <Link
                                activeClass="active"
                                to="section3"
                                spy={true}
                                smooth={true}
                                offset={-70}
                                duration={500}
                            >
                                Contacts
                            </Link>
                        </li>
                    </ul>
                </div>
            </nav>
        );
    }
}
