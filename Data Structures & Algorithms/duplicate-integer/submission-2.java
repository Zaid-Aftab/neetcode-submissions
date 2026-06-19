class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> mapset = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (mapset.contains(nums[i])) {
                return true;
            }

            mapset.add(nums[i]);
        }

        return false;
    }
}