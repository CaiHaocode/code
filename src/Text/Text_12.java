package Text;
//判断 100-200之间有多少质数，并打印出来

/**
 * 质数：只能被自己或1整除的数
 */
public class Text_12 {
    public static void main(String[] args) {
//        getZhiShu(101,200);
        getZhiShu_2(1,20);
    }

    public static void getZhiShu_2(int x, int y) {
        int index=0;
        for(;x<y;x++){//循环遍历从x--y 的所有数
            boolean flag=true;
            for (int i=2;i<x;i++){
                if(x%2==0){//判断是否为质数，不为质数全false，无法进入打印循环
                    flag=false;
                    break;
                }
                }
            if(flag){
                System.out.print(x+",");
                index++;
                if(index%5==0){
                    System.out.println();
                }
            }else {//flag为false ，直接进入这个位置，重新开始循环
                continue;
            }
        }
        System.out.println(index);

    }

    private static void getZhiShu(int x, int y) {
        int index= 0;
        for(;x<=y;x++) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {//不是质数,跳出内循环
                    break;//跳出当前for循环内循环（）
                }else  if(i==x-1){//初到最后一个数
                    System.out.print(x+",");
                    index++;
                    if(index%5==0){
                        System.out.println();
                    }
                }
            }
        }
        System.out.println();
        System.out.println(x);
        System.out.println(index);
//        17,17,17,17,17,17,17,17,17,17,17,17,17,17,17
//        18,18,18,18,18,18,18,18,18,18,18,18,
    }
}
