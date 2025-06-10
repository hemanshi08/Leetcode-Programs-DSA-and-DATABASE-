/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// using linear search 

// public class Solution extends GuessGame {
//     public int guessNumber(int n) {
//       for (int i=1;i<=n;i++){
//         int pass = guess(i);
//         if(pass == 0){
//             return i ;
//         }
//       }
//       return -1;
//     }
// }

public class Solution extends GuessGame {
    public int guessNumber(int n) {
      int low = 1;
      int high = n ;

      while(low<=high){
        int mid = low+(high-low)/2;
        int pass = guess(mid);

        if (pass==0){
            return mid;
        }
        else if(pass == 1){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
      }
      return -1;
    }
}

