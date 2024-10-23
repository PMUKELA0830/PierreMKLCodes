
//import './SignUp.css
import React from 'react';
import { useEffect, useState } from 'react';
import Select from 'react-select';
import { Link } from 'react-router-dom';
import axios from 'axios';


function Estimate() {

  const [items, setItems] = useState({
  // floorSideA: 0,
  // floorSideB: 0,
  // floorPieceArea: 0,
  // floorSurfaceShape: ""
});

const [estimate, setEstimate] = useState(null);
//const [shape, setShape] = useState(null);



  // Link using parameters

  // `http://localhost:8080/flooring/getEstimateDetail?floorSideA=${items.floorSideA}
  // &floorSideB=${items.floorSideB}&floorPieceArea=${items.floorPieceArea}&floorSurfaceShape=${items.floorSurfaceShape}`
  


  const estimateChangeHandler = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    const temp = { ...items };
    temp[name] = value;
    setItems(temp);
  }

  const estimateSubmitHandler = () => {
    axios.post(`http://localhost:8080/flooring/getEstimateDetail?floorSideA=${items.floorSideA}&floorSideB=${items.floorSideB}&floorPieceArea=${items.floorPieceArea}&floorSurfaceShape=${items.floorSurfaceShape}`, items).then(function(response) {
      console.log(response.data);
      setEstimate(response.data)
    }).catch(function (error) {
      console.log(error)
    })
  
  }
  /* convertedArea: 0
floorPieceArea: 2.56
floorSideA: 87
floorSideB: 64
floorSurfaceArea: 5568
floorSurfaceShape: "Rectangle"
id: 34
quantity: 2175*/

  const displayEstimate = () => {
    if(estimate!==null){
      return(

        <div className="Estimate">
          <div>ESTIMATE REPORT</div>
          <div> ******************* </div>
          <div>First side of floor:  {estimate.floorSideA}</div>
          <div>Second side of floor:  {estimate.floorSideB}</div>
          <div>Area of floor product:  {estimate.floorPieceArea}</div>
          <div>Shape of room floor:  {estimate.floorSurfaceShape}</div>
          <div>Estimate ID:  {estimate.id}</div>
          <div>Quantity of flooring product:  {estimate.quantity}</div>
        </div>
      )
    }

  }

  const selectItem = [
    {label: "Rectangle", value: 1},
    {label: "Square", value: 1},
    {label: "Triangle", value: 1}
  ];
//Use the <div></div> tags around items you want to be stacked 
//one on top of the other
  return (
    <>
    <form className="estimate-form">
      <h3 style = {{fontWeight: "bold", fontSize:"45px", marginBottom: "8vh"}}>Flooring Service</h3>
      <h4 style = {{marginLeft: "-42vh", marginBottom: "4vh",  fontSize:"25px"}}>Enter Estimate Information Below</h4>
      
      <div>
        <h6 style = {{font:"10px"}}></h6>
      </div>
      <div>
        <label>Floor side one : </label>
        <input name="floorSideA" value={items.floorSideA} onChange={estimateChangeHandler} 
        type="text" className="" style={{marginLeft: "16vh", marginBottom:"-1.6vh", "width": "25%", "height":"4vh", "border" : "2px solid", "borderRadius" : "9px"}} 
        placeholderTextColor="#000" placeholder='Enter value in inch' />
      </div>
      <div>
        <h6 style = {{font:"10px"}}></h6>
      </div>
      <div>
        <label>Floor side two : </label>
        <input name="floorSideB" value={items.floorSideB} onChange={estimateChangeHandler} 
        type="text" className="" style={{marginLeft: "16vh", marginBottom:"-1.6vh", "width": "25%", "height":"4vh", "border" : "2px solid", "borderRadius" : "9px"}} 
        placeholder='Enter value in inch' />
      </div>
      <div>
        <h6 style = {{font:"10px"}}></h6>
      </div>
      <div>
        <label style={{marginLeft: "-32vh"}}>Product area : </label>
        <input name="floorPieceArea" value={items.floorPieceArea} onChange={estimateChangeHandler} 
        type="text" className="" style={{marginLeft: "17.2vh", marginBottom:".2vh", "width": "25%", "height":"4vh", "border" : "2px solid", "borderRadius" : "9px"}} 
        placeholder='Enter value in square inch' />
      </div>
      <div>
                
        {/* 
        <Select name="floorSurfaceShape" options={ selectItem } value={items.floorSurfaceShape} onChange={estimateChangeHandler} style={{marginTop: ".2vh", width:"25%"}}/>

        <input name="floorSurfaceShape"  
        type="text"  style={{"width": "35%", "border" : "2px solid", "borderRadius" : "9px"}} placeholder='Shape of Room (Floor)'/> */}
      </div>
      <div>
        <label style={{marginLeft: "-32.3vh"}}>Shape of the room (floor): </label>
        <input name="floorSurfaceShape" value={items.floorSurfaceShape} onChange={estimateChangeHandler} 
          type="text" style={{marginLeft: "6.8vh" ,marginTop: ".2vh", width:"25%", "height":"4vh", "border" : "2px solid", "borderRadius" : "9px"}} 
          placeholder='Enter value in square inch' />
          
      </div>


      <div>
        <button onClick={estimateSubmitHandler} type="button">Submit</button>
      </div>
    </form>

    {displayEstimate()} </>

    // const startEstimate = async () => {
  //   const data = await fetch(
  //     'http://localhost:8080/getEstimateDetail'
  //   );

  //   const items = await data.json();
  //   console.log(items);
  //   setItems(items);
  // }
  )
}

export default Estimate;