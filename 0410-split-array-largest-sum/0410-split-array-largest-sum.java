class Solution {

    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        // Search space
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            int pieces = 1;
            int currentSum = 0;

            for (int num : nums) {

                if (currentSum + num > mid) {

                    pieces++;
                    currentSum = num;

                } else {

                    currentSum += num;
                }
            }

            if (pieces > k) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return left;
    }
}