public class lekouTest4 {
    public static void main(String[] args) {
        int [] i1={1,2,3,0,0,0};
        int [] i2={2,4,5,};

    }



    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int t1 = m - 1, t2 = n - 1, t = m + n - 1;
        while (t1 != -1 && t2 != -1) nums1[t--] = nums1[t1] >= nums2[t2] ? nums1[t1--] : nums2[t2--];
        while (t2 != -1) nums1[t--] = nums2[t2--];

    }
}
