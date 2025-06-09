class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char ch : arr){
            if(!st.isEmpty()){
                if((ch == ')') && (st.peek()=='(') || (ch == '}') && (st.peek()=='{') || (ch == ']') && (st.peek()=='[') ){
                st.pop();
            }
            
            else{
                st.push(ch);
            }
            
            }
            else{
                st.push(ch);
            }
        }
       return st.isEmpty(); 
    }
}