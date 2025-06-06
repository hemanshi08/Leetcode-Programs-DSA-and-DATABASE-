class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lw = arr[arr.length-1];
        return lw.length();

    }
}