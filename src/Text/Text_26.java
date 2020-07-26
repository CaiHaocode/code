package Text;
//利用递归方法求5！

/**
 *
 */
public class Text_26 {
    public static void main(String[] args) {
        int sum=getNum(5);
        System.out.println(sum);
    }

    public static int getNum(int x) {
       if(x==0||x==1){//如果x 为1或0；则返回一
           return 1;
       }else {
           return x*getNum(x-1);//否则返回 x*（x-1）,继续判断x-1是否为1或0 ；若不是则继续返回；直至x=1
       }
    }
}
