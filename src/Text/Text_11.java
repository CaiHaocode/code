package Text;

/**
 * 有一对兔子，从出生后三个月起每个月都生一对兔子；小兔子长到第三个月后每个月由生一对兔子
 * 假如兔子都不死，
 * 问每个月的兔子总数为多少？
 *
 *
 * 思路：：
 *  1 1 2 3 5 7
 *  前两数之和 = 第三个数
 */
public class Text_11 {
    public static void main(String[] args) {

        getNumber(12);
    }

    public static void getNumber(int num) {
        int num1 = 1;//第一天
        int num2 = 1;//第二天
        int sum = 0;//存储第三天的数据
        if(num<3){//如果输入数据小于3则总数依然为1
            sum=1;
        }
        for(int i=3;i<=num;i++){
            sum = num1+num2;//前两天之和为第三天
            num1 = num2;//交换
            num2 = sum;
        }
        System.out.println(sum);
    }
}
