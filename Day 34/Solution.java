class Solution {
    public int mySqrt(int n) {
        long start=0,end=n;
        long ans=0;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            if(mid*mid<n)
            {
                start=mid+1;
                ans=mid;
            }
            else if(mid*mid>n) {
                end=mid-1;
            }
            else{
            return (int)mid;
            } 
        }
        return (int)ans;
    }
}