class Solution {
    public int[] shuffle(int[] nums, int n) {      
//     int m=nums.length;
//     int i=0;
//     int j=n;
//     ArrayList<Integer> l=new ArrayList<Integer>(m);
//    while(i<n){
//        l.add(nums[i]);
//        if(j<m){
//            l.add(j);
//        }
//        i++;
//        j++;
//    }
//    Integer [] normalarray=new Integer[l.size()];
//    normalarray=l.toArray(normalarray);
//    int arr[]=new int[l.size()];
//      for(int k=0;k<arr.length;k++){
//          arr[k]=normalarray[k];
//      }
//      return arr;

   ArrayList<Integer> l=new ArrayList<Integer>(nums.length);
   for(int i=0;i<n;i++){
       l.add(nums[i]);
       l.add(nums[n+i]);
   }
   Integer [] normalarray=new Integer[l.size()];
    normalarray=l.toArray(normalarray);
    int arr[]=new int[l.size()];
      for(int k=0;k<arr.length;k++){
          arr[k]=normalarray[k];
      }
      return arr;
        
    }
}