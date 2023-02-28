import React, { useState } from "react";
import "./App.css";
import ChildComponent from "./ChildComponent";


export default function App() {
  const [message, setMessage] = useState('');

  const onChange = (e) => {
    setMessage(e.target.value);
  }
  return (

    <>

      <div className="container my-5">
        <div className="glady">
          <div className="text-center">

            <div className="row">
              <div className="col">
                <strong>Parent Component</strong>  <br></br>

                <input
                  type="text"
                  value={message}
                  onChange={onChange}

                />
              </div>
            </div>

          </div>
        </div>

        <ChildComponent messageString={message} />
      </div>
    </>


  );
}


