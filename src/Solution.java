
public class Solution {
    /**
     * Builds a new array based on the given input array.
     *
     * @param nums The input array.
     * @return The new array built from the input array.
     */
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        
        return result;
    }
}
