package Text;

/**
 * 一个小球从100米高度自由落下，每次落地后回调元位置的一般；
 * 求他十次落地时，共经过多少米？第十次反弹多高?
 *
 * 每次反弹减半，会出现小数，用Double类型定义反弹后高度；
 * 每次减半；循环
 */
public class Text_20 {
    public static void main(String[] args) {
        Double l=100.0;
        Double sum=00.0;
        for(int i =0;i<2;i++){
            sum+=l;//每次下落时，将下落了的高度先加进去
            l=l/2.0;//每次下落高度减半
            sum+=l;//将减半的高度加到之前落下的高度；则为每次下落并反弹共计高度
        }
        System.out.println(sum);
        System.out.println(l);
    }
}
