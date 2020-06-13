/**
 * @author DWG
 * @create 2020-06-12-11:33
 */
public class FamilyAccount {

    public static void main(String[] args) {
        char menuSelection;
        boolean loop = true;
        int balance = 10000;
        String details = "收支" + "\t\t账户金额" + "\t\t\t收支金额" + "\t\t\t说  明\n";


        while (loop) {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("                  1 收支明细                     ");
            System.out.println("                  2 登记收入                     ");
            System.out.println("                  3 登记支出                     ");
            System.out.println("                  4 退   出                     ");
            System.out.print("请选择（1 ~ 4）：");
            menuSelection = MyUtility.readMenuSelection();

            switch (menuSelection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("------------------------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int income = MyUtility.readNumber();
                    balance += income;
                    System.out.print("本次收入说明：");
                    String info = MyUtility.readString();
                    details = details + "收入" + "\t\t" + balance + "\t\t\t" + income + "\t\t\t" + info + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    income = MyUtility.readNumber();
                    balance -= income;
                    System.out.print("本次支出说明：");
                    info = MyUtility.readString();
                    details = details + "支出" + "\t\t" + balance + "\t\t\t" + income + "\t\t\t" + info + "\n";
                    System.out.println("-----------------登记完成-----------------");
                    break;
                case '4':
                    System.out.print("确认退出（Y/N）：");
                    char isExit = MyUtility.readConfirmSelection();

                    if (isExit == 'Y') {
                        loop = false;
                    }
            }
        }
    }
}
