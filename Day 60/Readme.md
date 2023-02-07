<h1 align="center">Promise in Javascript.</h1>

A Promise is a proxy for a value not necessarily known when the promise is created. It allows you to associate handlers with an asynchronous action's eventual success value or failure reason. This lets asynchronous methods return values like synchronous methods: instead of immediately returning the final value, the asynchronous method returns a promise to supply the value at some point in the future.

The eventual state of a pending promise can either be fulfilled with a value or rejected with a reason (error). When either of these options occur, the associated handlers queued up by a promise's then method are called. If the promise has already been fulfilled or rejected when a corresponding handler is attached, the handler will be called, so there is no race condition between an asynchronous operation completing and its handlers being attached.

A promise is said to be settled if it is either fulfilled or rejected, but not pending.

Example: 
   
                                                        async function glady(){
                                                            let delhiWeather=new Promise((resolve,reject)=>{
                                                        setTimeout(() => {
                                                            resolve("27 Degree")
                                                        }, 1000);
                                                            })

                                                            let bhopalWeather=new Promise((resolve,reject)=>{
                                                                resolve("12 Degree")
                                                            })
                                                            
                                                            bhopalWeather.then()
                                                            delhiWeather.then(alert)

                                                        }

                                                        glady();