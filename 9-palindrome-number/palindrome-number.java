class Solution {
    public boolean isPalindrome(int x) {
    if(x < 0 ){
        return false;
       } 

    int temp = x ;
    int rev = 0;

    while(temp!=0){
        int digit = temp%10;
        rev = rev*10+digit;
        temp = temp/10;
    }
    if(x != rev) {return false;}
        return true;
    }
}