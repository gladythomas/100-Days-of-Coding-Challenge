<h1 align="center">Closure in javascript.</h1>


A closure is the combination of a function bundled together (enclosed) with references to its surrounding state (the lexical environment). In other words, a closure gives you access to an outer function's scope from an inner function. In JavaScript, closures are created every time a function is created, at function creation time.

Example 1:

<h3 align="center">Closures.</h3>
                           function init(){ <br>
                            var firstName="Glady";  <br>
                            console.log("I am in init");  <br>
                            function sayHello(){  <br>
                                return console.log(`The first name is:${firstName}`);  <br>
                            }  <br>
                         return sayHello;  <br>
                        }  <br>

                        var g= init();

                        g();


                        
