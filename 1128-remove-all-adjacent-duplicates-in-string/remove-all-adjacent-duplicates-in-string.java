class Solution {
    public String removeDuplicates(String s) {
       char[] arr = s.toCharArray();
       Stack <Character> st = new Stack<>();
       for(char ch: arr){
        if(!st.isEmpty() && (st.peek()==ch)){
            st.pop();
        }
        else{
            st.push(ch);
        }
        
       }
       StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
    }
}