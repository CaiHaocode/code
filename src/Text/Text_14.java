package Text;

/**
 * 将一个正整数分解质因数
 * 如：：90=2*3*3*5
 *
 *
 * 现将这个数从二开始除除
 * 将除后的数据存储起来；继续第一个步骤依次执行下去
 *
 */
public class Text_14 {
    public static void main(String[] args) {
        getNum(90);
    }

    public static void getNum(int num) {
        int x=num;
        String str="";//定义一个字符串；将所得数据拼接
        for(int  i=2;i<=num; ){
            if(num%i==0){//求出这个数的所有质因数
                if(num==i){//如果这个数符合当前条件；则这个数为最后一个质因数
                    str+=i;
                }else {
                    str+=i+"*";
                }
                num=num/i;//每次循环后除以这个质因数求下一个质因数
            }else {
                i++;//如果不为不为质因数；则++
            }
        }
        System.out.println(x+"="+str);
    }
}
