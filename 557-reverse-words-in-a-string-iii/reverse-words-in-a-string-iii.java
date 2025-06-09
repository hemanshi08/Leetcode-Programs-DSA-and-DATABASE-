class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb2 = new StringBuilder();
        for(String w : word){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            sb2.append(sb).append(" ");
        }
        return sb2.toString().trim() ;
    }
}