/**
 * @author DWG
 * @create 2020-06-13-10:57
 */
public class Bank {
    private Customer[] customers;
    private int numOfCustomer;

    public Bank() {
        customers = new Customer[5];
    }

    public Customer getCustomers(int indexd) {
        return customers[indexd];
    }

    public int getNumOfCustomer() {
        return numOfCustomer;
    }

    public void addCustomer(String f, String l){
        customers[numOfCustomer++] = new Customer(f, l);
    }
}
