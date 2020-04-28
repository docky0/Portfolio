import React, { Component } from "react";
import "./App.css";

import Aboutme from "./Components/About/Aboutme"
import Navbar from "./Components/Navbar";
import Section from "./Components/Section";
import Projects from "./Components/Projects/Projects"


import dummyText from "./DummyText";
import Contact from "./Components/Contact/Contact";
class App extends Component {
    render() {
        return (
            <div className="App">
                <Navbar />
                <Section
                    title=""
                    subtitle={<Aboutme/>}
                    dark={true}
                    id="section1"
                />
                <Section
                    title="Projects"
                    subtitle={<Projects/>}
                    dark={false}
                    id="section2"
                />
                <Section
                    title="Contact"
                    subtitle={<Contact/>}
                    dark={true}
                    id="section3"
                />
            </div>
        );
    }
}

export default App;
