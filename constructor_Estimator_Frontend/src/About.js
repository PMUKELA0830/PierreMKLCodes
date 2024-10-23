
import './App.css';
import React from 'react';




const About = () => {

  return (
		<div className="about">
            <h1 style={{fontWeight: "bold", textAlign: "center", fontSize:"48px", marginBottom:"6vh"}}>About this estimator</h1>
                <div style= {{marginLeft: "12vh", marginBottom: "-1vh", marginRight: "10vh"}}>
                    This App was designed to help engineers (in construction field), 
                    constructors, and contractors save time on estimating the
                    quantity of material needed to complete a given job, whether
                    it is construction of brand new buildings or remodelling of 
                    existing buildings or even repair of specific part of an 
                    existing building.
                </div>
        </div>
    );
}

export default About;