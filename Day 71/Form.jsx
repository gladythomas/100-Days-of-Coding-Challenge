import React from 'react'

export default function Form() {
  return (
    <div>
<form>
 <input type="text" name="username" />
 <input type="password" name="password" />
 <button type="submit" onClick={(event) => event.preventDefault()}>
   Submit
 </button>
</form>
      
    </div>
  )
}
