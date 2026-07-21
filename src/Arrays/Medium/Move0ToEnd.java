package Arrays.Medium;

import java.util.Arrays;

public class Move0ToEnd {
    public static void main(String[] args) {
        int[] nums={1,2,0,3,0,4,5};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }


        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}