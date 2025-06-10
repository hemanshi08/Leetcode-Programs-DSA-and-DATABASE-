class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
       
        for(String element : operations){
            switch (element) {
                case "C":
                    st.pop();
                    break;

                case "D":
                    st.push(2*st.peek());
                    break;

                case "+":
                    int pre = st.pop();
                    int add = pre + st.peek();
                    st.push(pre);
                    st.push(add);
                    break;

                default:
                    int digit = Integer.valueOf(element);
                    st.push(digit);
                    break;

            }
        }
        int sum = 0 ;
        for(int i : st){
            sum += i ;
        }
        return sum ;
    }
}