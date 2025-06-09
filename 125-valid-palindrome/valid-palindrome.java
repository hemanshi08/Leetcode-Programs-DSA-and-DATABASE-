class Solution {
    public boolean isPalindrome(String s) {
        String l =s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder();
        for(char c :l.toCharArray()){
            sb.append(c);
        }
         StringBuilder r = new StringBuilder(sb);
         r.reverse();
         return (sb.toString()).equals((r.toString())); 
    }
}


//replaceAll("[^a-z0-9]","") means replace all character with "" ; rather than a-z and 0-9 , ^ means not  