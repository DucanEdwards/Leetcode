/**
 * Integerflip
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Integerflip {

    public static void main(String[] args) {
        Integerflip k=new Integerflip();
        System.out.println(k.reverse(123));
        System.out.println(k.reverse(-123));
        System.out.println(k.reverse(45095));
        System.out.println(k.reverse(1534236469));
        System.out.println(k.reverse(900000));
    }
    public int reverse(int x) {
        long res=0;
        while (x%10!=0 || x/10!=0){
            res=res*10+x%10;
            x=x/10;
            if (res<Integer.MIN_VALUE || res>Integer.MAX_VALUE ) return 0;
        }
        return (int)res;
    }
    
}