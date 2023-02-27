import React, { useState } from 'react'

export default function Form() {
    const [input,setInput] = useState('')

    return (
        <>
            <div className="container my-5 ">
                <div className="mb-6">
                    <label htmlFor="formGroupExampleInput" className="form-label">Name</label>

                    <input
                        type="text"
                        className="form-control"
                        id="formGroupExampleInput"
                        placeholder="Example input placeholder"
                        value={input} 
                        onChange = {(e)=>setInput(e.target.value)}
                    />
                </div>


                <button className="btn btn-danger" >Submit</button>
            </div>
        </>
    )
}
