class Solution {
    public int countNegatives(int[][] grid) {
        
        int n=grid.length;
        int n1=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n1;j++){
                if(grid[i][j]<0){
                    //count =count+1;
                    count++;
                }
            }
        }
        return count;
        
    }
}