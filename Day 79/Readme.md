<h1 align="center">Transpose of Matrix</h1>

Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Example 1:
                                       
                                       Input: N=4
                                              mat[][] = {{1, 1, 1, 1},
                                                        {2, 2, 2, 2}
                                                        {3, 3, 3, 3}
                                                        {4, 4, 4, 4}}

                                       Output: 
                                             
                                                        {{1, 2, 3, 4},  
                                                        {1, 2, 3, 4}  
                                                        {1, 2, 3, 4}
                                                        {1, 2, 3, 4}} 



Constraints:
                                                        -1 <= N <= 100
                                                        -103 <= mat[i][j] <= 1031 <= numRows <= 30

Solution:

                                               
                                                                class Solution
                                                                {
                                                                    //Function to find transpose of a matrix.
                                                                    static void transpose(int matrix[][], int n)
                                                                    {
                                                                    
                                                                        for(int i=0;i<n;i++){
                                                                            for(int j=0;j<=i;j++){
                                                                            int temp=matrix[i][j];
                                                                            matrix[i][j]=matrix[j][i];
                                                                            matrix[j][i]=temp;
                                                                            }
                                                                        }
                                                                    }
                                                                }