/**
 * watercontainer
 * 11、圣最多水的容器
 */
public class watercontainer {

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        watercontainer wc=new watercontainer();
        System.out.println(wc.maxArea(height));
    }

    public int maxArea(int[] height) {
        int maxarea=0;
        for (int i=0;i<height.length;i++){
            for (int j=i+1;j<height.length;j++){
                int temp=(j-i)*Math.min(height[i], height[j]);
                if (temp>maxarea) maxarea=temp;
            }
        }
        return maxarea;
    }

    //优化
    public int maxArea1(int[] height) {
        int l = 0, r = height.length - 1;//两个指针
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }
}