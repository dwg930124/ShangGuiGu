/**
 * @author DWG
 * @create 2020-06-13-9:45
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧", 22);
        Girl girl = new Girl("朱丽叶", 20);

        boy.marry(girl);
        girl.marry(boy);

        Girl girl1 = new Girl("祝英台", 18);
        int compare = girl.compare(girl1);

        if (compare > 0){
            System.out.println(girl.getName()+"大");
        }else if (compare<0){
            System.out.println(girl1.getName() + "大");
        }else {
            System.out.println("一样大");
        }
    }
}
