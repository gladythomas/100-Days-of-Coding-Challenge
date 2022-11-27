class Solution {
    public void duplicateZeros(int[] arr) {
         ArrayList<Integer> l=new ArrayList<Integer>(arr.length);
        // int i=0;
         for(int i=0;i<arr.length;i++){
             l.add(arr[i]);
             if(arr[i]==0){
                 l.add(arr[i]);
             }
         }
         Integer [] normalarray=new Integer[l.size()];
         normalarray=l.toArray(normalarray);
         for(int j=0;j<arr.length;j++){
         
             arr[j]=normalarray[j];
         }

       
    }
}