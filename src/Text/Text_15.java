package Text;

/**
 * 运用条件运算符（？：）完成
 * 学习成绩》=90位A     60-89位B          60以下为C
 */
public class Text_15 {
    public static void main(String[] args) {
        String str=getScore(89);
        System.out.println(str);
    }

    public static String getScore(int i) {
        return i>=90?"A":i>=60&&i<90?"B":"C";
    }
}
