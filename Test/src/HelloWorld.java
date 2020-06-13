/**
 * @author DWG
 * @create 2020-06-11-11:23
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("姓名：习大大\n");
        System.out.println("性别：男");
        System.out.println("家庭住址：北京中南海");

        byte b = 12;
        System.out.println(b);

        long l = 155;

        float f = 12.2f;
        System.out.println(f);

        double d = 200.1;
        System.out.println(d);

        char c = 'D';
        System.out.println(c);

        char c2 = '\n';
        System.out.print("123" + c2);

        boolean b1 = true;
        System.out.println(b1);

        //类型转换
        int i = 12;
        byte b2 = (byte) (i + b);

        float f2 = l;

        byte b3 = (byte) (b2 + b2);

        //输出：*  *
        System.out.println("*  *");
        System.out.println('*' + "\t" + '*');
//        System.out.println('*' + '\t' + '*'); //93
    }
}
