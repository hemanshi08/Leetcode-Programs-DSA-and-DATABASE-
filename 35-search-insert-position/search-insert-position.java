class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1 ;
        // boolean flag = false ;
    while(low<= high){
        int mid = low + (high - low) /2;
        if(nums[mid]==target){
            // flag = true;
            return mid ;
        }
        else if (nums[mid]<target){
            low = mid+1;
        }
        else{
            high=mid-1;
        }

    }
    // if (flag == false){
        for(int i = 0 ;i<nums.length ; i++){
            if(nums[i]>target){
                return i ;
            }
        }
    // }
    return nums.length;

    }
}