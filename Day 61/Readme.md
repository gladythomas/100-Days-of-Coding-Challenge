<h1 align="center"> Priority of a Thread.</h1>

Each thread has a priority. Priorities are represented by a number between 1 and 10. In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling). 
But it is not guaranteed because it depends on JVM specification that which scheduling it chooses. 
Note that not only JVM a Java programmer can also assign the priorities of a thread explicitly in a Java program.

Setter & Getter Method of Thread Priority

==>public final int getPriority(): The java.lang.Thread.getPriority() method returns the priority of the given thread.

==>public final void setPriority(int newPriority): The java.lang.Thread.setPriority() method updates or assign the priority of the thread to newPriority. 
The method throws IllegalArgumentException if the value newPriority goes out of the range, which is 1 (minimum) to 10 (maximum).

3 constants defined in Thread class:
public static int MIN_PRIORITY
public static int NORM_PRIORITY
public static int MAX_PRIORITY
Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.

TEST CASE 1 :
                                     Three Threads are Created to print First 10 Numbers,  Square of First 10 Numbers and Cube Of First 10 Numbers
                                                        Number 0
                                                        Number 1
                                                        Number 2
                                                        Number 3
                                                        Number 4
                                                        Number 5
                                                        Number 6
                                                        Cube of 1 1
                                                        Cube of 2 8
                                                        Square of 0 0
                                                        Square of 1 1
                                                        Square of 2 4
                                                        Square of 3 9
                                                        Square of 4 16
                                                        First Thread is Number And it's Priority is 5
                                                        Cube of 3 27
                                                        Number 7
                                                        Number 8
                                                        Number 9
                                                        Cube of 4 64
                                                        Second Thread is Square And it's Priority is 10
                                                        Square of 5 25
                                                        Square of 6 36
                                                        Square of 7 49
                                                        Square of 8 64
                                                        Square of 9 81
                                                        Third Thread is Cube And it's Priority is 1
                                                        Cube of 5 125
                                                        Number 10
                                                        Cube of 6 216
                                                        Square of 10 100
                                                        Cube of 7 343
                                                        Cube of 8 512
                                                        Cube of 9 729
                                                        Cube of 10 1000

Let change the priority of the Threads, then the output will be :

TEST CASE 2 :
Three Threads are Created to print First 10 Numbers,  Square of First 10 Numbers and Cube Of First 10 Numbers
                                                        Number 0
                                                        Number 1
                                                        Number 2
                                                        Number 3
                                                        Number 4
                                                        Number 5
                                                        Number 6
                                                        Number 7
                                                        Number 8
                                                        Number 9
                                                        Cube of 1 1
                                                        Cube of 2 8
                                                        Cube of 3 27
                                                        Cube of 4 64
                                                        Cube of 5 125
                                                        Cube of 6 216
                                                        Cube of 7 343
                                                        Square of 0 0
                                                        Cube of 8 512
                                                        Cube of 9 729
                                                        Cube of 10 1000
                                                        First Thread is Number And it's Priority is 10
                                                        Number 10
                                                        Second Thread is Square And it's Priority is 1
                                                        Square of 1 1
                                                        Square of 2 4
                                                        Square of 3 9
                                                        Third Thread is Cube And it's Priority is 5
                                                        Square of 4 16
                                                        Square of 5 25
                                                        Square of 6 36
                                                        Square of 7 49
                                                        Square of 8 64
                                                        Square of 9 81
                                                        Square of 10 100

