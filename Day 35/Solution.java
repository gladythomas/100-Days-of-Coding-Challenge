class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i=0;i<arr1.length-1;i++){
//             for(int j=0;j<arr2.length-1;j++){
//                 if( arr1[i]-arr2[j]==-d || arr1[i]-arr2[j]==d){
//                     count++;
               
//             }
//         }
        
//     }return count;
// }
 int len1 = arr1.length;
 int len2 = arr2.length;
        
        for(int i = 0; i < len1; i++){
            int j = 0;
            for(; j < len2; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d)
                    break;
            }
            if(j == len2)
                count++;
        }
        return count;
}
}