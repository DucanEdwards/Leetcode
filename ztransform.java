import java.util.ArrayList;
import java.util.List;

/**
 * z transform
 */
public class ztransform {
    public static void main(String[] args) {
        ztransform z=new ztransform();
        System.out.println(z.convert("LEETCODEISHIRING", 3));
        System.out.println(z.convert("LEETCODEISHIRING", 4));

    }
    
    public String convert(String s,int numRows){
        if(numRows==1) return s;

        List<StringBuilder> rows=new ArrayList<>();
        //得到行数
        for (int i=0;i<Math.min(numRows, s.length());i++){
            rows.add(new StringBuilder());
        }
        int currentrow=0;//当前行
        boolean godown=false;//往上或往下走
        for (char k:s.toCharArray()){
            rows.get(currentrow).append(k);
            if (currentrow==0 || currentrow==numRows-1) godown=!godown;
            currentrow+=godown ? 1:-1;//变换行
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder k:rows) res.append(k);
        return res.toString();
    }
}