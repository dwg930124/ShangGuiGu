/**
 * @author DWG
 * @create 2020-06-11-16:42
 */
public class Test01 {
    public static void main(String[] args) {
        int num = 193;

        //分别打印个位、十位、百位上的数
        System.out.println("个位：" + num % 10);
        System.out.println("十位：" + num / 10 % 10);
        System.out.println("百位：" + num / 100);

        //位运算符
        int num2 = 2;
        System.out.println(num2 >> 10);

        //将0~255十进制换成十六进制
        int temp = num & 15;
        String j = (temp > 9) ? (char) (temp - 10 + 'A') + "" : temp + "";
        num = num >>> 4;
        temp = num & 15;
        String k = (temp > 9) ? (char) (temp - 10 + 'A') + "" : temp + "";
        System.out.println(k + j);


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("你的年龄：");
//        int age = scanner.nextInt();
//        System.out.println("你的名字：");
//        String name = scanner.next();
//        System.out.println(name + age);

        //获取随机数: [10, 99]
        System.out.println((int) (Math.random() * 100));    //[0.0~100.0)
        System.out.println((int) Math.random() * 90 + 10);  //[0.0~90.0) --> [10.0~100.0) --> int [10.0~99]

    }
}