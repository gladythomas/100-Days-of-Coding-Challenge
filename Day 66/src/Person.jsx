import React from 'react'
import PersonDetail from './PersonDetail'

export default function Person({ person }) {
  return (
    <>

      {
        person.map((event) => {
          return (

            <PersonDetail key={event.id} name={event.name} />
          )
        })
      }

    </>
  )
}