// Time Complexity :O(log N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


class Solution {
    public int findMin(int[] nums) {
        if(nums ==null || nums.length ==0) return -1;
        int low =0,high = nums.length-1;
        if(nums[low] <= nums[high]) return nums[low];
        while(low<=high){
            int mid  = low+(high - low)/2;
            if(nums[low] <=nums[high]){
                return nums[low];
            }
            if((mid ==0 || nums[mid] <nums[mid -1] )&& (mid ==nums.length -1 || nums[mid] < nums[mid+1])){
                return nums[mid];
            }
            else if (nums[low] <=nums[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

}