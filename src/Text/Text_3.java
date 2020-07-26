package Text;
//一个整数，他加上100后是一个完全平方数，再加上168有时一个完全平方数，请问这个数是多少？

/**
 * 完全平方数：一个数乘以自己
 * x+100 = y开方
 * x+100+168 = z开方
 */
public class Text_3 {
    public static void main(String[] a){
//        int x = 1;
        int m = 0;
        int n = 0;

        for(int x =1 ;x<1000;x++){
            m =(int) Math.sqrt(100+x);
            n =(int) Math.sqrt(100+168+x);
            if(m*m==x+100&&n*n==x+268){
                System.out.println(x);
            }
            }
        }


    }

