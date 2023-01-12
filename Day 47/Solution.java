// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int maximum=0;
//         for(int i=0;i<accounts.length;i++){
//             for(int j=0;j<accounts.length;j++){
//                 int wealth=accounts[i][j]
//             }
//         }
//     }
// }
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            maxx=Math.max(maxx,sum);
        }
        return maxx;
    }
}