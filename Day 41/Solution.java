class Solution {
    public:
        int lengthOfLastWord(string s) {
            int n = s.length();
            if(n==1)return 1;
            int i= n-1;
            int count = 0;
            while(i>=0){
                if(s[i]==' '){
                    i--;
                }
                if(s[i]!=' '){
                    count++;
                    if(i==0){
                        break;
                    }else{
                    i--;}
                }
                if(s[i] == ' ' && count!=0){
                    break;
                }
            }
            return count;
        }
    };