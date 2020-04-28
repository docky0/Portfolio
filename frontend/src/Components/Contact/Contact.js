import React from "react";
import './Contact.css'


const Contact = () => {
    return (
        <div className="contact-main">
            <div className="contact-email">
                Email:
                <span className="email-tel">
                    arekniecikowski02@gmail.com
                </span>
            </div>
            <div className="contact-tel">
                Phone number:
                <span className="email-tel">
                    +48 667966600
                </span>
            </div>
        </div>
    )
};

export default Contact