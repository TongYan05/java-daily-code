package ANU7710;

public class leetcode {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 26;
        int[] index = twoSum(nums, target);
        System.out.println("["+index[0]+","+index[1]+"]");

    }

        public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (target == nums[i] + nums[j]) {
                        int[] index = {i, j};
                        return index;
                    }
                }
            }
            return  null;
    }
}
