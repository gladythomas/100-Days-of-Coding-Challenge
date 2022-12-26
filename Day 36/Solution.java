// class Solution {
//     public int pivotIndex(int[] nums) {
//        int mid=(nums.length-1)/2;
//        int leftSum=0;
//        int rightSum=0;
//        for(int i=0;i<mid-1;i++){
//         leftSum=leftSum+nums[i];
//        } 
//        int j=1;
//        for(j=mid+j;j<nums.length;j++){
//            rightSum=rightSum+nums[j];
//        }
//        if(leftSum==rightSum){
//             return mid;
//        }else{
//              return -1;  
//        }      
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
    if(nums == null || nums.length == 0) return -1;
    int len = nums.length;
    int sum[] = new int[len + 1];
    sum[0] = 0;
    for(int i = 1; i <= len; i++){
    sum[i] = sum[i - 1] + nums[i-1];
    }
    int res = -1;
    for(int i = 0; i < len; i++){
    if(sum[i] == sum[len] - sum[i+1]){
    res = i;
    break;
    }
    }
    return res;
    }
    }