/**
 * Created by Daniel on 2017-05-14.
 */
public class Customer {

    private String customerName;
    private String customerSurname;
    private int cash;
    private int customerId;

    public Customer(String customerName, String customerSurname, int cash, int customerId) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.cash = cash;
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return customerId == customer.customerId;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
