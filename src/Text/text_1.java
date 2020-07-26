package Text;
//需求:有1.2.3.4个数字，能组成多少个不相同且不重复的三位数？并打印出来
/**
 *   第一层循环锁定第一个位置
 *   第二层循环锁定第二个位置
 *   第三层循环锁定第三个位置
 *   每次循环记录打印次数，所以定义一个变量记录次数
 *   最后判断各个位置的数字是否相同，不想同则打印
 */

public class text_1 {
    public static void  main(String[] a){
        int[] arr = {1,2,3,4};
        int index = 0;//记录打印次数
//        int[] list = {};
        for(int i=0;i<arr.length;i++){
            for(int j= 0;j<arr.length;j++){
                for(int x=0;x<arr.length;x++){
                    if(arr[i]!=arr[j]&&arr[j]!=arr[x]&&arr[i]!=arr[x]){
                System.out.println(arr[i]+""+arr[j]+""+arr[x]);
                index++;}
                }
            }

        }
        System.out.println(index);
    }
}
