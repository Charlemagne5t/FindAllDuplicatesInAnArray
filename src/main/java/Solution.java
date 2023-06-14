import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                list.add((Math.abs(nums[i])));
            } else nums[Math.abs(nums[i]) - 1] *= -1;
        }
        return list;
    }
}
