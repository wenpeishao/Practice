class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length;i++){
            int expectNumber = target - nums[i];
            for (int j = i + 1; j<nums.length;j++){
                if (expectNumber == nums[j]){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }
}