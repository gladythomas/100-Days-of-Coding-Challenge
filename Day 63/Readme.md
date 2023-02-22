<h1 align="center"> Smallest element in an array</h1>



HOW I IMPLEMENTED THIS ?
First read elements into array.
Then take first element as min.
Then run a loop from i=0 to array length.
Inside loop, check if arr[i]<min, If yes then take min as arr[i].
Else, then skip the condition and resume in loop.
After the loop termination, min contains the minimum element in array.

LOOP INVARIANT OF THIS ALGORITHM :
For every i'th iteration, min must hold the minimum value among the traversed elements.

TEST CASE 1 :
INPUT :
  Enter array size
  5
  Enter elements into array
  2 1 4 3 7
OUTPUT :
  Smallest element present in given array: 1
  
  
TEST CASE 2 :
INPUT :
  Enter array size
  3
  Enter elements into array
  23  15  27
OUTPUT :
  Smallest element present in given array: 15
  
  
TEST CASE 3 :
  INPUT :
    Enter array size
    3
    Enter elements into array
    0  0  0
  OUTPUT :
    Smallest element present in given array: 0
    
    
TEST CASE 4 :
  INPUT :
    Enter array size
    0
    Enter elements into array
  OUTPUT :
    //It will throw an exception
