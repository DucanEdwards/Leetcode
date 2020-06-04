/**
 * inttorome
 * 12、整数转罗马数字
 */
public class inttorome {

    public static void main(final String[] args) {
        inttorome itr=new inttorome();
        System.out.println(itr.intToRoman(3));
        System.out.println(itr.intToRoman(4));
        System.out.println(itr.intToRoman(9));
        System.out.println(itr.intToRoman(58));
        System.out.println(itr.intToRoman(1994));
    }
    //贪心法
    public String intToRoman(int num) {
        StringBuilder res=new StringBuilder();
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i=0;i<nums.length;i++){
            while(num>=nums[i]){
                res.append(strs[i]);
                num-=nums[i];
            }
        }
        return res.toString();
    }
}