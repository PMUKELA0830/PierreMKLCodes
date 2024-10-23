import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
// const mysql = require("mysql");
// const express = require("express");

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

// const app = express();

// app.use(express.json());

// const dataBase = mysql.createConnection({
//   user: "root",
//   host: "localhost",
//   password: "password",
//   database: "LoginSystem",
// });

// app.listen(3306, () => {
//   console.log("running server");
// });



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
