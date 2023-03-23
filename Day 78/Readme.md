<h1 align="center">Sum of upper and lower triangles</h1>

Given a square matrix of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

Example 1:

Input:
                                                                N = 3 
                                                                mat[][] = {{6, 5, 4},
                                                                        {1, 2, 5}
                                                                        {7, 9, 7}}
Output:                                                         29 32

Explanation:
                                                                The given matrix is
                                                                6 5 4
                                                                1 2 5
                                                                7 9 7
                                                                The elements of upper triangle are
                                                                6 5 4
                                                                2 5
                                                                    7
                                                                Sum of these elements is 6+5+4+2+5+7=29
                                                                The elements of lower triangle are
                                                                6
                                                                1 2
                                                                7 9 7
                                                                Sum of these elements is 6+1+2+7+9+7= 32.


Constraints:

                                        -1 <= N <= 100
                                        -1 <= matrix[i][j] <= 100

Solution:

                                                  
                                                  class Solution
                                                 {
                                                    //Function to return sum of upper and lower triangles of a matrix.
                                                    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
                                                    {
                                                    ArrayList<Integer> ans= new ArrayList();
                                                    
                                                        int sum_upper=0;
                                                    for(int i=0;i<n;i++){
                                                        for(int j=n-1;j>=i;j--){
                                                            sum_upper=sum_upper+matrix[i][j];
                                                        }
                                                    }
                                                    ans.add(sum_upper);
                                                    
                                                    int sum_lower=0;
                                                    for(int i=0;i<n;i++){
                                                        for(int j=0;j<=i;j++){
                                                            sum_lower=sum_lower+matrix[i][j];
                                                        }
                                                    }
                                                    ans.add(sum_lower);
                                                    
                                                    
                                                    return ans;
                                                    }
                                                }
                                                                                                
                                                                                                            