import java.util.Arrays;

public class SolutionRotate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(rotate(nums, k));
    }

    /**
     * 旋转数组
     * @param nums
     * @param k
     * @return
     */
    public static Object rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0;i < k;i++) {
            previous = nums[nums.length - 1];
            for (int j = 0;j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }

        }
        return Arrays.toString(nums);
    }


}
