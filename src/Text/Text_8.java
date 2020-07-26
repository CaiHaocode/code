package Text;
//九九乘法
public class Text_8 {
    public static void main(String[] args) {
        for (int i = 1;i<=9;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
