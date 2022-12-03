class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    l.add(i);
                    l.add(j);
                }
            }
        }
        Integer [] normalArray=new Integer[l.size()];
        normalArray=l.toArray(normalArray);
        int n=normalArray.length;
        int newa[]=new int[n];
        for(int k=0;k<newa.length;k++){
            newa[k]=normalArray[k];
        }
        return newa;
    }
}