import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void findDuplicatesTest1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output = new ArrayList<>(List.of(2, 3));
        Assert.assertEquals(output, new Solution().findDuplicates(nums));
    }

    @Test
    public void findDuplicatesTest2() {
        int[] nums = {1, 1, 2};
        List<Integer> output = new ArrayList<>(List.of(1));
        Assert.assertEquals(output, new Solution().findDuplicates(nums));
    }

    @Test
    public void findDuplicatesTest3() {
        int[] nums = {1};
        List<Integer> output = new ArrayList<>();
        Assert.assertEquals(output, new Solution().findDuplicates(nums));
    }

    @Test
    public void findDuplicatesTest4() {
        int[] nums = {10,2,5,10,9,1,1,4,3,7};
        List<Integer> output = new ArrayList<>(List.of(10, 1));
        Assert.assertEquals(output, new Solution().findDuplicates(nums));
    }
}
