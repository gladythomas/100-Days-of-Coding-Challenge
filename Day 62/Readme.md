<h1 align="center">THREAD SYNCHRONIZATION.</h1>


Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

Java Synchronization is better option where we want to allow only one thread to access the shared resource.

Why use Synchronization?
The synchronization is mainly used to

To prevent thread interference.
To prevent consistency problem.

TEST CASE 1 :
                                                            Enter a number
                                                            5
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 6
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 7
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 8
                                                            n value incremented by 1 and saved
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 9
                                                            Displaying n value is 10

TEST CASE 2 :
                                                            Enter a number
                                                            5
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 6
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 7
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 8
                                                            n value incremented by 1 and saved
                                                            n value incremented by 1 and saved
                                                            Displaying n value is 10
                                                            Displaying n value is 10
