class Solution {
    public boolean isPalindrome(int x) {
        boolean b=false;
        int n;
        int digit=0;
        int rev=x;
        if(x<0)
        return false;
        while(x!=0){
            n=x%10;
            digit=digit*10+n;
            x=x/10;
        }
       // rev=digit;
        if(digit==rev){
            return true;
        }
        return b;
    }
}