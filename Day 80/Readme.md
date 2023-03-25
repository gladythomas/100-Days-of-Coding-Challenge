<h1 align="center">Rotate by 90 degree</h1>

Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Example 1:
                                       
                                       Input: N=3
                                              mat[][] =  [[1 2 3],
                                                         [4 5 6],
                                                         [7 8 9]]
                                       Output: 
                                             
                                                        [[3 6 9], 
                                                        [2 5 8], 
                                                        [1 4 7]]



Constraints:
                                                        -1 <= N <= 50
                                                        -1 <= matrix[][] <= 100
Solution:

                                               
                                                                class GFG
                                                                {
                                                                    static void rotate(int matrix[][]) 
                                                                    {
                                                                        // Transpose of matrix
                                                                        int n=matrix.length;
                                                                    for(int i=0;i<n;i++){
                                                                        for(int j=0;j<i;j++){
                                                                            int temp=matrix[i][j];
                                                                            matrix[i][j]=matrix[j][i];
                                                                            matrix[j][i]=temp;
                                                                        }
                                                                    }
                                                                    
                                                                    for(int i=0;i<n/2;i++){
                                                                        for(int j=0;j<n;j++){
                                                                            int temp=matrix[i][j];
                                                                            matrix[i][j]=matrix[n-1-i][j];
                                                                            matrix[n-1-i][j]=temp;
                                                                        }
                                                                    }
                                                                    }
                                                                }