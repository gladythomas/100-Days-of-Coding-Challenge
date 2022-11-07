class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<Boolean>(candies.length);
        List<Integer> list=new ArrayList<>();
         for(int i=0;i<candies.length;i++)
        {
            list.add(candies[i]);
        }

        int first=Collections.max(list);
        for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies>=first){
                    l.add(true);
                }else{
                    l.add(false);
                }
        }
        return l;
    }
}