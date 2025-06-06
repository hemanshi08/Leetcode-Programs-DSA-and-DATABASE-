import java.util.ArrayList;

class Solution {
    public List<String> fizzBuzz(int n) {

List<String> data = new ArrayList<>();

for (int i =1 ; i<=n ; i++){
    
     if ((i%3==0) && (i%5==0)){
        data.add ("FizzBuzz");
     }  
     else if (i%3==0) {
         data.add("Fizz");
     }
     else if (i%5==0){
        data.add("Buzz");
     }
     else {
        data.add(String.valueOf(i)) ;
     }
    }
    return data;
    }
}