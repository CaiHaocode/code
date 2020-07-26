package Text;
//有一分数序列：2/1,3/2,5/3,8/5,13/8.21/13...
//求出这个数列的前二十项之和

/**
 * 前一个数的分子分母之和为第二个数的分子
 * 第二个数的分母为第一个数的分子
 *
 * 循环遍历出二十个数列
 * 每次循环加上这个数
 * num1/num2-----num1+num2/num1
 * x=num1
 * y=num2
 * a=num1+num2
 * x/y-----a/x
 */
public class Text_24 {
    public static void main(String[] args) {
        Double sum=0d;
        Double num1=2d;//存储第一个数的分子
        Double num2=1d;//存储第一个数的分母
        Double temp=num1/num2;//存储第二个数的分子
        Double num3=0d;//存储第二个数的分母
        for(int i=0;i<20;i++){
            sum+=temp;//先将第一个数添加到变量
            num3=num1;//下一个数的分母
            num1=num1+num2;//下一个数的分子
            num2=num3;
            temp=num1/num2;//下一个数
        }
        System.out.println(sum);
    }
}
