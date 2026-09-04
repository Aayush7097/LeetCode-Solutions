public class Solution {

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        // Move pointers toward each other
        while (left < right) {
            int width = right - left; // Distance between lines
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width; // Compute water contained
            maxArea = Math.max(maxArea, area); // Update max water

            // Move the pointer pointing to the shorter height
            if (height[left] < height[right]) {
                left++; // Move left pointer forward
            } else {
                right--; // Move right pointer backward
            }
        }

        return maxArea;
    }

    // // Optional: For testing
    // public static void main(String[] args) {
    //     int[] height = {1,8,6,2,5,4,8,3,7};
    //     System.out.println("Max Area: " + maxArea(height)); // Should print 49
    }

