import * as React from 'react';
// import Box from '@mui/material/Box';
// import TextField from '@mui/material/TextField';
// import { Button } from '@mui/material';

import axios from 'axios';
//import { Checkbox } from '@mui/material';


export default function SignIn() {

    const label = { inputProps: { 'aria-label': 'Checkbox demo' } }

    
    const [toggleError, setToggleError] = React.useState(false)
    const [user, setUser] = React.useState({
        email: "",
        password: "",
    })

    const toggleIsAgent = (event) => {
        user.isAgent = event.target.checked
    }

    const toggleErrorFunc = () => {

        if(toggleError) {
            return <div>INVALID INVALID INVALID</div>
        }
        return null
    }

    const userChangeHandler = (event) => {
        console.log("HERE")
        const name = event.target.name;
        const value = event.target.value;
        const tempUser = { ...user };
        tempUser[name] = value;
        setUser(tempUser)
    }
    // const navToPage = () => {
    //     navigate("/")
    // }
    // const signUpSubmitHandler = () => {
        
    //     if(user.isAgent) {
    //         axios.post("http://localhost:8080/agent/signIn", user)
    //         .then((response) => {
    //             const loggedInUser = response.data

    //             localStorage.setItem("emailCookie", loggedInUser.email)
    //             // navigate('/Agent-Profile')
    //         }).catch((error) => {
    //             setToggleError(true)
    //             console.log("error: " + error)
    //         })
    //     } else {
    //         axios.post("http://localhost:8080/customer/signIn", user)
    //         .then((response) => {
    //             const loggedInUser = response.data

    //             localStorage.setItem("emailCookie", loggedInUser.email)
    //             // navigate('/Listings')
    //         }).catch((error) => {
    //             setToggleError(true)
    //             console.log("error: " + error)
    //         })
    //     }
    // }

    return (
        <div>
            <form>
                <h3>Enter your information to sign in</h3>
                <div>
                    <input type="email"
                    className="" style={{"width": "25%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder="Email"/>
                </div>
                <div>
                    <input type="password"
                    className="" style={{"width": "25%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder="Password"/>
                </div>            
                          

                <button >Sign in!</button>
            </form>
        </div>
        // <Box
        //     component="form"
        //     sx={{
        //         '& > :not(style)': { m: 1, width: '50em' },
        //     }}
        //     noValidate
        //     autoComplete="off"
        // >
        //     <div className='justify-center flex-col full-width'>
        //     <h2 className='text-align-center'>LOGIN TO BUY THE HOME OF YOUR DREAMS, DREAMS!</h2>
        //     <div className='flex-row justify-center'>
        //         <TextField id="outlined-basic" label="Email" variant="outlined" name="email" value={user.email} onChange={userChangeHandler} sx={{ m: 3 }} />
        //         <TextField id="outlined-basic" label="Password" variant="outlined" name="password" value={user.password} onChange={userChangeHandler} sx={{ m: 3 }} />
        //     </div>
        //     <Checkbox {...label} onClick={toggleIsAgent} />
        //     <Button onClick={signUpSubmitHandler}>Log in!</Button>
        //     {toggleErrorFunc()}
        //     </div>
        // </Box>
    );
}