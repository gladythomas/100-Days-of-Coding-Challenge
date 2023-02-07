<h1 align="center">Spread in Javascript.</h1>


The spread (...) syntax allows an iterable, such as an array or string, to be expanded in places where zero or more arguments (for function calls) or elements (for array literals) are expected. In an object literal, the spread syntax enumerates the properties of an object and adds the key-value pairs to the object being created.

Spread syntax looks exactly like rest syntax. In a way, spread syntax is the opposite of rest syntax. Spread syntax "expands" an array into its elements, while rest syntax collects multiple elements and "condenses" them into a single element.

Example 1:

                                               function sum1(...args){
                                                    let sum=0;
                                                    for (const arg of args) {
                                                        sum+=arg;
                                                    }
                                                    return sum;
                                                }

                                                var sumofdigits=sum1(2,3,4,5,6,7,8,9);

                                                console.log(sumofdigits);
