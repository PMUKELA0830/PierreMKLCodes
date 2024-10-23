
import './App.css';
import React from 'react';
import { Link } from 'react-router-dom';
import logo from './Estimator_logo.png';



const Nav = () => {
    const navStyle = {
        color: 'white'

    }

  return (
    <nav style={{width: "100vw"}}>
        <h3>
            <a href="/" > <img style={{height: "90px", marginLeft: "-70px",  borderStyle: "none",  paddingTop: "10px"}} src={logo} alt="Logo" /></a>
        </h3>
        <ul className="nav-links" style={{marginLeft: "30px"}}>
            <Link style={navStyle} to="/about">
                <li>About</li>
            </Link>
            <Link style={navStyle} to="/estimate">
                <li>Estimate</li>
            </Link>
            <Link  style={{marginLeft:"100px", marginRight:"-100px"}} to="/Register">
                <li>Register</li>
            </Link>

        </ul>


         <ul>
            <Link style={navStyle} to="/SignIn">
                <p>Sign in</p>
            </Link>
        </ul>   
            


    </nav>



    // <nav>
    //     <div class="nav-wrapper">
    //     <a href="#" class="brand-logo">Logo</a>
    //         <ul id="nav-mobile" class="right hide-on-med-and-down">
    //                 <Link style={navStyle} to="/about">
    //                     <li>About</li>
    //                 </Link>
    //                 <Link style={navStyle} to="http://localhost:8080/flooring/getEstimateDetail">
    //                     <li>Estimate</li>
    //                 </Link>
    //                 <Link style={navStyle} to="/SignUp">
    //                     <li>SignUp</li>
    //                 </Link>
    //         </ul>
    //     </div>
    // </nav>


);
}

export default Nav;