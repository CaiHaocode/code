package Text;
//求1！+2!+...+20!的和

/**
 * 1!=1
 * 2!=2*1!
 * 3!=3*2!
 * 依次类推
 */
public class Text_25 {
    public static void main(String[] args) {
        int sum=0;
        int x=1;
        for(int i=1;i<=20;i++){
            x*=i;//每次乘以变量i；得到所要的每个阶乘数
            sum+=x;//将每个阶乘的值相加；
        }
        System.out.println(sum);
    }
}
