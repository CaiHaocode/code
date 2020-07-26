package Text;
//输入三个整数，从小到大排序

/**
 * 冒泡排序：将第一个数依次和另外两个数对比
 */
public class Text_5 {
    public static void main(String[] args) {
        int[] list = {112,43,756};
        for(int i=0;i<list.length-1;i++){
            for (int j = 0;j<list.length-1-i;j++){
                if(list[j]>list[j+1]){
                    int temp=list[j+1];
                    list[j+1]=list[j];
                    list[j]=temp;
                }
            }
        }
        for (int i:list){
            System.out.println(i);
        }
//        int a = getMin(list[0],list[1]);
//        int d=getMin()
//        System.out.println(a);
    }
    public static int getMin(int a,int n) {//返回两个数的最小值
        if(a>n){
            int temp=n;
            n=a;
            a=temp;
        }
        return a;
    }
}
