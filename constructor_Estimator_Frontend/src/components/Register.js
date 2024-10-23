import React from "react";
import { useState } from "react";
import axios from 'axios';


const Register = () => {
    const [credentials, setCredentials] = useState({

    });

    const registerChangeHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        const temp = { ...credentials };
        temp[name] = value;
        console.log("hit")
        setCredentials(temp);
    }
    
    const registerSubmitHandler = () => {
        axios.post("http://localhost:8080/signUp", credentials).then(response => console.log(response.data)) 
        // setCredentials(response.data) 
          .catch(function (error) {
          console.log("FAILED: " + error)
        })  
      }

    return(<div>
            <form>    
            <h1 style={{fontWeight: "bold", textAlign: "center", fontSize:"48px", marginBottom:"6vh"}}>Register here</h1>
            <h5 style={{fontWeight: "bold", textAlign: "center", fontSize:"26px", marginBottom:"6vh"}}>Enter your information below</h5>
                <div>
                    <input name="name" value={credentials.name} onChange={registerChangeHandler} 
                    type="text" className="" style={{"width": "25%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder="User Name"/>
                </div>

                <div>
                    <input name="email" value={credentials.email} onChange={registerChangeHandler} 
                    type="text" className="" style={{"width": "25%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder="User Email"/>
                </div>
                
                <div>
                    <input name="password" value={credentials.password} onChange={registerChangeHandler} 
                    type="text" className="" style={{"width": "25%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder="User Password"/>
                </div>
                <div>
                    <button onClick={registerSubmitHandler}>Submit</button>
                </div>
        
            </form>
        </div>
    )
}

export default Register