import java.lang.reflect.Array;
import java.util.*;

public class lekouTest3 {
    //    输入：nums = [1,1,2]
//    输出：2, nums = [1,2]
//    解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int a = removeDuplicates(nums);
        System.out.println(a);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}

