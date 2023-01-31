<h1 align="center">async function in javascript.</h1>


The async function declaration declares an async function where the await keyword is permitted within the function body. The async and await keywords enable asynchronous, promise-based behavior to be written in a cleaner style, avoiding the need to explicitly configure promise chains.

Example 1:

                                         async function glady(){
                                             let p=fetch("https://api.chucknorris.io/jokes/random")
                                            p.then((value1)=>{
                                                return value1.json()
                                            }).then((val2)=>{
                                                let p=val2.value;
                                                return console.log(p);
                                            })

                                            }

                                            glady();