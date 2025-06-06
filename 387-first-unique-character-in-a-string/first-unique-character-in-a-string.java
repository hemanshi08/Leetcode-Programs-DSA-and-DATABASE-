class Solution {
    public int firstUniqChar(String s) {
       char[] arr =  s.toCharArray();
    
        int[] count =new int[26];

        for(char ch : arr){
            count[ch - 'a']++;
        }

        for (int i = 0 ; i< arr.length ; i++){
            if(count[arr[i] - 'a'] == 1){
                 
                return i ;
                
            }
            
        }
     return -1 ;
}
   
}