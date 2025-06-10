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

        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}



 