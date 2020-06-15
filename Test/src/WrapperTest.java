/**
 * @author DWG
 * @create 2020-06-15-16:39
 */
public class WrapperTest {
    public static void main(String[] args) {
        int num = 22;

        //基本类型 --> 包装类
        Integer integer = new Integer(num); //弃用
        Integer integer1 = 22;  //自动装箱

        //包装类 --> 基本类型
        num = integer.intValue();   //弃用
        num = integer1; //自动拆箱

        //基本类型、包装类 --> String类
        String str = String.valueOf(num);

        // String类 --> 基本类型、包装类
        num = Integer.parseInt(str);

        System.out.println(num);    //22
    }
}
