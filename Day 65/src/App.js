import React from "react";
import { useState } from 'react';
// import "./style.css";
import Person from "./Person";
import InputForm from "./Input_Form";

export default function App() {
  
  const [person, setPerson] = useState([
    // { name: 'suman', id:1 },
    // { name: 'ram', id:2 },
    // { name: 'shyam', id:3 },
    // { name: 'mohan', id:4 },
    // { name: 'ramesh' , id:5}
  ])

  const addPerson = () => {
    
      const obj={
        name:'glady',
        id:Math.random()
      }

      setPerson([...person,obj])
  }


  return (
   
    <>
      <InputForm />
      {/* <button onClick={addPerson}>Add</button> */}
      <Person person={person} />

    </>


  );
}