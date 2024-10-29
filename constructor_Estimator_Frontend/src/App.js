
import './App.css';
//import './SignUp.css';
import React from 'react';
import Nav from './Nav';
import Estimate from './components/GetEstimateDetail';
import About from './About';
import Home from './Home';
import SignUp from './SignUp';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import Register from "./components/Register"
import SignIn from "./components/SignIn"

function App() {
  return (
    <Router> 
      <div className='Estimator'>
        <Nav />
        <Routes>
          <Route path="/" exact component={Home}/>
          <Route path="/about" component={About}/>
          <Route path="/signin" component={SignIn}/>
          <Route path="/estimate" component={Estimate}/>
          <Route path="/register" component={Register}/>
        </Routes>
      </div>

    </Router>
  )
}

export default App;
