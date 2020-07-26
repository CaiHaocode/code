package Text;
//求s=a+aa+aaa+aaaa....的值，其中a是一个数字，
//如2+22+222...{几个数相加由键盘控制}

/**
 * 有两个变量    a,和，n有几个数相加
 * s为求和
 * 2
 * 2*10+2=22
 * 22*10+2=222
 */
public class Text_18 {
    public static void main(String[] args) {
        Sum(2,2);
    }

    public static void Sum(int x, int y) {//x为a;y为几个数相加
        int sum=0;
        int a=0;
        for(int i=0;i<y;i++){
            a=a*10+x;//第一次循环为一个数的a;
            sum+=a;//讲这个数加到一个变量中
        }
        System.out.println(sum);
    }
}
