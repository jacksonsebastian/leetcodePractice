class Solution {

    public int minStartValue(int[] nums) {
        int n = nums.length;
        int m = 100;
        int left = 1;
        int right = m * n + 1;

        while (left < right) {
            int middle = (left + right) / 2;
            int total = middle;
            boolean isValid = true;

            for (int num : nums) {
                total += num;
                if (total < 1) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }
}
