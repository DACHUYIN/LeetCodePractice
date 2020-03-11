package firstpage;

public class Practise1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j <= nums.length - 1; j++) {
                if(nums[i] + nums[j] == target) {
                    int[] arrays = new int[2];
                    arrays[0] = i;
                    arrays[1] = j;
                    return arrays;
                }
            }
        }
        return null;
    }
}
