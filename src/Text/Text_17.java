package Text;
//输入一行字符，分别统计出其中字符中的英文字母。空格。数字和其他字符的个数

/**
 * 先将字符存储起来
 * 循环遍历每个字符
 * 如果为英文字母。空格。数字和其他字符，则用一个变量存储起来
 *
 *
 isLetter() 方法用于判断指定字符是否为字母。
 如果字符为字母，则返回 true；否则返回 false。

 isDigit() 方法用于判断指定字符是否为数字。如果字符为数字，则返回 true；否则返回 false。
 isSpaceChar()  判断是否空格键
 */
public class Text_17 {
    public static void main(String[] args) {
        String s="asdjkas  143";
        getStr(s.toCharArray());//将字符串转换为字符数组

    }

    public static void getStr(char[] s) {
        char[] str = s;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<str.length;i++){
                if(Character.isLetter(str[i])) {//判断指定字符是否为字母。
                    a++;
                }else if(Character.isDigit(str[i])){//判断指定字符是否为数字
                    b++;
                }else if(Character.isSpaceChar(str[i])){//判断指定字符是否为空格
                    c++;
                }else {
                    d++;
                }
        }
            System.out.println("英文有"+a+"数字："+b+"空格"+c+"其他"+d);
    }
}
