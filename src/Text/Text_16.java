package Text;
//输入两个正整数n,m,求其最大公约数和最小公倍数

/**
 * 先判断两束的大小
 *最大公约数：先将大数和小树求余；再将小树和余求余；依次循环；直到后面那个数为0；
 * 最小公倍数: 两数之积除以最大公约数
 */
public class Text_16 {
    public static void main(String[] args) {

        getNum(4,16);
    }

    public static void getNum(int i, int i1) {
        int num=i;
        int num2=i1;
        int temp=0;
        if(i>i1){//先判断那个数为较大的数；将小的放在前面
             temp = i1;
            i1=i;
            i=temp;
        }
        while(i!=0){//如果这个小的数不为0
             temp = i1%i;//求两数之余
            i1=i;//交换位置；直到i为0；跳出循环;所得i1则为公约数
            i=temp;
        }
        System.out.println("最大公约数为："+i1);
        System.out.println("最小公被数为："+num*num2/i1);//最小公倍数: 两数之积除以最大公约数
    }
}
