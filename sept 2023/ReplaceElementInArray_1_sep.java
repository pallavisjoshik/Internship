//leetcode 2295 - replace element in array

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Step 1: Populate the HashMap with initial indices of values in the 'nums' array.
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        // Step 2: Iterate through the 'operations' array and perform replacements.
        for (int i = 0; i < operations.length; i++) {
            int oper1 = operations[i][0]; // Value to be replaced
            int oper2 = operations[i][1]; // Replacement value

            // Find the index of 'oper1' in the 'nums' array using the HashMap.
            int indexToReplace = hm.get(oper1);

            // Replace the value at 'indexToReplace' with 'oper2'.
            nums[indexToReplace] = oper2;

            // Update the HashMap to reflect the new index of 'oper2'.
            hm.put(oper2, indexToReplace);
        }

        // Return the modified 'nums' array after all operations.
        return nums;
    }
}