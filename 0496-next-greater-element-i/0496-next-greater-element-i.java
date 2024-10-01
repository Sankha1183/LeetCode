import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Step 1: Create a map to store the next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Step 2: Traverse nums2 from left to right and find the next greater element for each number
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num); // The top of the stack has a smaller element than num
            }
            stack.push(num); // Push the current number onto the stack
        }

        // Step 3: For any elements left in the stack, there is no next greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Step 4: Build the result array based on the next greater elements for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]); // Get the next greater element for nums1[i]
        }

        return result;
    }
}
