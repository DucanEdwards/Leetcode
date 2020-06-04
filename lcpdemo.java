/**
 * lcp 14、最长公共前缀
 * 说明:编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 所有输入只包含小写字母 a-z 。
 * 解析:
 * 当字符串数组长度为 0 时则公共前缀为空，直接返回
 * 令最长公共前缀 ans 的值为第一个字符串，进行初始化
 * 遍历后面的字符串，依次将其与 ans 进行比较，两两找出公共前缀，最终结果即为最长公共前缀
 * 如果查找过程中出现了 ans 为空的情况，则公共前缀不存在直接返回
 * 时间复杂度：O(s)O(s)，s 为所有字符串的长度之和
 */
public class lcpdemo {
    public static void main(String[] args) {
        lcpdemo l=new lcpdemo();
        String[] test={"flower","flow","flight"};
        String[] test1={"dog","racecar","car"};
        System.out.println(l.longestCommonPrefix(test));
        System.out.println(l.longestCommonPrefix(test1));
    }
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String ans=strs[0];
        for (int i=1;i<strs.length;i++){
            int j=0;
            for (;j<ans.length() && j<strs[i].length();j++){
                if (ans.charAt(j)!=strs[i].charAt(j)) 
                    break;
            }
            ans=ans.substring(0,j);
            if (ans.equals("")) return "null";
        }
        return ans;
    }
}