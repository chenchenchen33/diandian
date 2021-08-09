import java.nio.charset.MalformedInputException;

public class lekouTest2 {
//    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
//    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
//    假设环境不允许存储 64 位整数（有符号或无符号）。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/reverse-integer
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public static void main(String[] args) {
        int reserve = lekouTest2.reserve(1534236469);
        System.out.println(reserve);
    }
    public static int reserve(int i) {
        int y=0;
        while (i!=0){
            if (y > 214748364 || y < -214748364) return 0;
            y=y*10+i%10;
            i=i/10;
   }
return y;
    }
}
