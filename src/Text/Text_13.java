package Text;

/**
 * 需求：打印所有的“水仙花数”，“”水仙花数：指一个三位数，期各位数组立方和等于该数本身
 * 如：：153=1*1*1+5*5*5+3*3*3
 *
 * 思路：循环遍历100--1000
 * 分别取出这个数的个十百位数
 * 趣百味：x/100
 * 去市委：(x%100)/10
 * 去各位：x%10
 *
 */
public class Text_13 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int index=0;
        for(int i=100;i<1000;i++){
            a=i/100;//百位
            b=(i%100)/10;//198%100=98 98/10=9; 十位
            c=i%10;//各位
            if(i==(LF(a)+LF(b)+LF(c))){
                System.out.print(i+",");
                index++;
                if(index%10==0){
                    System.out.println();
                }
            }
        }
    }

    public static int LF(int a) {
        return a*a*a;
    }
}
