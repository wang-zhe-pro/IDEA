package 日常学习测试;

public class Wtest {

    public static int MaxChildArrayOrder(int a[]) {
        int n = a.length;
        int max = a[0];
        int sum = a[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(sum + a[i], a[i]);
            if (sum >= max) {
                max = sum;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int a[]={6,-1,3,-4,-6,9,2,-2,5};
        int max=MaxChildArrayOrder(a);
        System.out.println(max);
    }
}