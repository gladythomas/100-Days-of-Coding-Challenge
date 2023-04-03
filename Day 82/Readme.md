<h1 align="center">Spirally traversing a matrix</h1>

Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:
                                       
                                       Input: r = 4, c = 4
                                              mat[][] =  [[1 2 3 4],
                                                         [5 6 7 8],
                                                         [9 10 11 12]]
                                       Output: 
                                             
                                                        1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


Constraints:
                                                        -1 <= r, c <= 100
                                                        -0 <= matrixi <= 100
Solution:

                                               
                                                      class Solution
                                                        {
                                                            //Function to return a list of integers denoting spiral traversal of matrix.
                                                            static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
                                                            {
                                                            ArrayList<Integer> ans=new ArrayList<Integer>();
                                                                
                                                                // Took 4 pointers 
                                                                
                                                            int top=0,bottom=r-1,left=0,right=c-1;
                                                            
                                                            while(top<=bottom && left<=right){
                                                                for(int i=left;i<=right;i++){
                                                                    ans.add(matrix[top][i]);
                                                                }
                                                                top++;
                                                                
                                                                for(int i=top;i<=bottom;i++){
                                                                    ans.add(matrix[i][right]);
                                                                }
                                                                    right--;
                                                                    
                                                                    if(top<=bottom){
                                                                    for(int i=right;i>=left;i--){
                                                                        ans.add(matrix[bottom][i]);
                                                                    }
                                                                    bottom--;
                                                                    }
                                                                    if(left<=right){
                                                                    for(int i=bottom;i>=top;i--){
                                                                        ans.add(matrix[i][left]);
                                                                    }
                                                                    left++;
                                                                    }
                                                            }
                                                            return ans;
                                                            }
                                                        }
