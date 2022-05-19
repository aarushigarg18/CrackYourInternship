class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int first = 0;
        int second = 0;
        while(first < n){
            if(nums[first] == 0){
                first++;
            }
            else {
                int temp = nums[second];
                nums[second] = nums[first];
                nums[first] = temp;
                first++;
                second++;
            }
        }
    }
}