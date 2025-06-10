class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() <needle.length()) {
            return -1;
            }
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        for(int i =0;i<=h.length-n.length;i++){
          int j =0 ;
          while((j<n.length)&& (h[i+j]==n[j])){
            j++;
          } 
          if(j == n.length){
            return i ;
          } 
        }
       
        return -1 ; 
        
    }
}