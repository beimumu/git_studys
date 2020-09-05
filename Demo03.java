package base;

/**
 * Created by 林木木 on 2020/8/29.
 */
public class Demo03 {
    public static void main(String[] args) {
       int i = 128;
       byte b = (byte)i;
        System.out.println(i);
        System.out.println(b);
        System.out.println("==============");
        char c ='a';
        int d = c+1 ;
        System.out.println(d);
        System.out.println((char)d);
        System.out.println("==============");
        int money=10_0000_0000;
        int year=20;
        int total=money*year;//-1474836480,结果溢出
        long total2=money*year;//-1474836480虽然转换了类型但是结果还是没变，因为money和year在运算前就已经默认为int型
        long total3=money*((long)year);//先转型后计算就会得到我们想要的结果：20000000000
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
