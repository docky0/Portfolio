import React from "react";
import "./Aboutme.css"


const Aboutme = () => {
    return (
        <div className="About-main">
            <div className="About-left">
                <img alt={''} src={require('../../Images/avataaars.png')} className="avatar"/>
                <div className="myName">
                    Arkadiusz Niecikowski
                </div>
                <div className={'media'} >
                    <a href="https://github.com/docky0">
                        <img alt={''} src={require('../../Images/giticon.png')} />
                    </a>
                    <span> &nbsp; &nbsp;</span>
                    <a href="https://www.linkedin.com/in/arkadiusz-niecikowski-a1a85a18b/">
                        <img alt={''} src={require('../../Images/linkedin.png')} className="linkedinicon"/>
                    </a>
                </div>
            </div>
            <div className="About-Right" >
                <div className="about-me-title">
                    Aboute me
                </div>
                <div className="about-me-desc">
                    While working at the Lenin Shipyard (now Gdańsk Shipyard), Wałęsa, an electrician, became a trade-union activist,
                </div>
                <div className="education-title">
                    Education
                </div>
                <div className="education-desc">
                    Bialystok University of Technology, Programming, Bachelor Degree
                </div>

            </div>
        </div>
    );
};

export default Aboutme;