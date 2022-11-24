class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int[] ans=new int[nums1.length];
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             ans[i]=nums1[i];
        //             break;
        //         }
        //     }
        // }
       HashSet<Integer> set = new HashSet();  

       for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                   set.add(nums1[i]);
                   break;
               }
           }
       }
       int[] arr = new int[set.size()];        
    int j = 0;
    for (int i : set)  
        arr[j++] = i; 
    
    return arr;
        
    }
}