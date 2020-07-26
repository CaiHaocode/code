package Text;
//输入某年某月某日；判断这是这一年的第几天

/**
 * 先判断这年是否为闰年，是这加一
 * 1:公历年份是4的倍数的，且不是100的倍数，2:必须是400的倍数
 *1-12月分别为31天，29天，31天，30天，31天，30天，31天，31天，30天，31天，30天，31天）
 * 用数组存储每月的天数
 */
public class Text_4 {
    public static void main(String[] args) {
        getDays(2000,2,29);
    }

    public static void getDays(int y,int m,int d) {
        int[] ints = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int days = 0;
        //先判断是否为闰年
        if(y%4==0&&y%100!=0||y%400==0){
            if(m>1){//如果输入月份小于二月，则不加，诺为二月且
                ints[2]=29;
            }
        }
        if(m>12 ||m<0|| d>31||m==2&&d>ints[2]||m==4&&d>30||m==6&&d>30
                ||m==9&&d>30||m==11&&d>30 ){
            System.out.println("请输入正确日期");
            return;
        }
        //循环月数
       for(int i = 1;i<m;i++){
           days+=ints[i];
       }
        System.out.println(days+d);
    }
}
