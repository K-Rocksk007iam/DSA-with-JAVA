import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementNBY2 {

    public static void main(String[] args) {
        int[] nums = {3,3,1,3,2,3,2};
        System.out.println(Arrays.toString(majorityElement(nums)));
    }

    public static int[] majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        Integer ele = null;

        for (int num : nums) {
            if (count == 0) {
                count = 1;
                ele = num;
            } else if (ele == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        ele = null;

        for (int num : nums) {
            if (count == 0) {
                count = 1;
                ele = num;
            } else if (ele == num) {
                count++;
            } else {
                count--;
            }
        }

        if (count > 0) {
            list.add(ele);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
