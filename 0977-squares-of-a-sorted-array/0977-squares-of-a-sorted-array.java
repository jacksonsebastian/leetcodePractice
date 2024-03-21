class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(nums[j]) > Math.abs(nums[j + 1])) {
                    // Swap nums[j] and nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        
        // Square the sorted values
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        return nums;
    }

}
