<h1 align="center">Spiral Matrix</h1>

Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
                                       
                                       Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
                                       Output: 
                                                        [1,2,3,6,9,8,7,4,5]



Constraints:
                                                        -m == matrix.length
                                                        -n == matrix[i].length
                                                        -1 <= m, n <= 10
                                                        -100 <= matrix[i][j] <= 100
Solution:

                                               
                                                                class Solution {
                                                                        public List<Integer> spiralOrder(int[][] matrix) {
                                                                            
                                                                            List<Integer> ans=new ArrayList<Integer>();

                                                                            int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;

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