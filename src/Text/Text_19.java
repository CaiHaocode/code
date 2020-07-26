package Text;

/**
 * 一个数如果恰好等于他的因子之和，这个数就被称为--完数
 * 如：6=1+2+3
 * 找出1000以内的所有完数
 *
 * 也就是说：这个数等于其所有质数之和
 *
 * 先求出这个数的所有质数
 * 在判断其质数之和是否与这个数相等
 *
 */
public class Text_19 {
    public static void main(String[] args) {
        getZhiSum();
    }

    public static void getZhiSum() {
        int sum=0;
        for(int i=1;i<=1000;i++){//循环遍历1--1000
            for(int j=1;j<i;j++){//每个数都除以从1到自己的所有数
                if(i%j==0){//如果这个数和一个数取余为0；则这个数是他的因数
                    sum+=j;//求出所有因数,并求和
                }
            }
            if(sum==i){//如果所有因数和等于这个数，则打印出来
                System.out.println(sum);
            }
            sum=0;

        }
    }
}
