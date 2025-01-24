
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] nums2;
        nums2 = buildArray(nums);
        System.out.println(Arrays.toString(nums2));
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            ans[i] = index;
        }
        return ans;
    }
}