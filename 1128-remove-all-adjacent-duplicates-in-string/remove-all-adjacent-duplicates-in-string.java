class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
       
        Stack<Character> stack = new Stack<>();
        
        for(char ch : arr){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
       
       StringBuilder sb = new StringBuilder();

       for(char c : stack){
        sb.append(c);
       }
        return sb.toString();
    }
}