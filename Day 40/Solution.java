class Solution {

    public boolean isValid(String expression) {
          //if opening bracket, stack push
    // if close bracket, stacktop check and pop
      Stack <Character> st = new Stack<>(); 
        
        for(int i=0; i<expression.length(); i++){
             char ch = expression.charAt(i);
        if(ch=='[' || ch=='{' || ch=='('){
            st.push(ch);
        }else{
           // for closing bracket
            if(st.size()!=0){
                char peek = st.peek();
                if((ch==')' && peek == '(') ||
                   (ch==']' && peek == '[') ||
                   (ch=='}' && peek=='{'))
                {
                    st.pop();
                }
                else{
                    return false;
                }   
            }else{
               return false;
            } } }
      
        if(st.size()==0){
            return true;
        }
        return false;
    
 
    }
    
}