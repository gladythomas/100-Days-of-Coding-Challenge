import React, { useState } from 'react'

export default function ChildComponent(props) {

    
// const onChange=(e)=>{
//     const newText=e.target.value;
//     setText(newText);
// }
  return (
    <div className="container my-5">
  <div className="glady1">
  
  <div className="text-center">

    <div className="row">
      <div className="col">
     <strong>Child Component</strong>  <br></br>
      
      <input 
      type="text"
      placeholder="enter a message"
      value={props.messageString}
    //   onChange={props.messageString}
      
       />
  </div>
        <div className="container my-3">


      <button className="btn btn-success">Submit</button>
        </div>
      </div>
      
    </div>
  </div>

  </div>
  )
}
