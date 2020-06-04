/**
 * Palindrome
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Palindrome {
    public static void main(final String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));
        System.out.println(p.isPalindrome1(121));
        System.out.println(p.isPalindrome1(-121));
        System.out.println(p.isPalindrome1(10));
    }

    // 转化为字符串
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        for (int i=0;i<str.length()/2+1;i++){
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
            else continue;
        }
        return true;
    }
    //不转化为字符串
    public boolean isPalindrome1(int x){
        //负数全为false，最后一位为0但第一位不为0也为false
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;//翻转一半的数
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        //若数字长度为奇数，通过/10来去除中间的数
        return x == revertedNumber || x == revertedNumber/10;
    }

}