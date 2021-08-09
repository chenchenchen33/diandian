public class lekouTest5 {

    public static void main(String[] args) {
        String s1="heeeello";
        String s2="ll";
        int i = strStr(s1, s2);
        System.out.println(i);
    }



    public static  int strStr(String haystack, String needle) {
        char[] chars = haystack.toCharArray();
        char[] chars1 = needle.toCharArray();
        if(needle.equals("")) return 0;
        int n = chars.length, m = needle.length();

        for(int i=0; i<=n-m; ++i)  //从左至右遍历字符串
        {
            if(chars[i]==chars1[0]) //当needle第一个字符串相同时，进一步判断
            {
                int j = i+1;   //定位到下一个字符
                int k = 1;     //定位到下一个字符
                while(j<n && k<m && chars[j]==chars1[k]) //判断是否继续相等
                {
                    j++;
                    k++;
                }
                if(k==m)  //遍历完退出while后，当k=m，则匹配成功，返回位置i；
                {
                    return i;
                }
            }
        }
        return -1; //若字符串遍历完，没有匹配成功，则直接返回-1。
    }

    }

