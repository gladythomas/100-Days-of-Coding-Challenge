<h1 align="center">Maps in Javascript.</h1>


The Map object holds key-value pairs and remembers the original insertion order of the keys. Any value (both objects and primitive values) may be used as either a key or a value.

Example 1:

                                                var myMap=new Map();
                                                myMap.set(0,"zero");
                                                myMap.set(1,"One");
                                                myMap.set(2,"Two");
                                                myMap.set(3,"Three");


                                                console.log(myMap);

                                                for (var key of myMap.values()) {
                                                    console.log(key);
                                                }

                                                for (const [key,value] of myMap) {
                                                    console.log(key,value);
                                                }


                                                let arr=[1,2,3,4,5]

                                                const a=arr.map(arr=>arr*2)

                                                console.log(a);