package base;

/**
 * Created by 林木木 on 2020/9/1.
 */
public class Demo04 {
    //属性：变量
    //类变量（需加static关键字）
    static double salary = 2500;
    //实例变量（类和main之间）：从属于对象，如果不进行初始化，这个类型会用默认值。
    //字符串型默认值u0000。
    //布尔值默认值为false。
    //除了基本类型，其余类型默认值都是null。
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量（只活在main方法里）：必须声明变量和初始化值
        int i = 10;
        System.out.println(i);
        Demo04 demo04 = new Demo04();
        /*
            快捷键：new base.Demo04()后加“.var”回车。
            变量类型也可以是本身：变量类型 变量名 = new base.Demo04();
        */
        System.out.println(demo04.age);
        System.out.println(demo04.name);
        System.out.println(salary);//类变量在有static时可以直接在main方法里使用。
    }

    //其他方法
    public void add(){
    }
}

