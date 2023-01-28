<h1 align="center">Anonymous Function in javascript.</h1>


It is a function that does not have any name associated with it. Normally we use the function keyword before the function name to define a function in JavaScript, however, in anonymous functions in JavaScript, we use only the function keyword without the function name.

An anonymous function is not accessible after its initial creation, it can only be accessed by a variable it is stored in as a function as a value. An anonymous function can also have multiple arguments, but only one expression.

Example 1:
<h3 align="center">Function Before Anonymous.</h3>
                           function sayhello(){
                                console.log("Before Anonymous ");
                                }
                                sayhello();
Example 2:
<h3 align="center">Function After Anonymous.</h3>
                            (function (){
                                    console.log("After Anonymous ");
                                })();