import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Customer implements Serializable {
    private String firstName;
    private String lastName;
    private int id;
    private double balance;

    // No-argument constructor
    public Customer() {}

    // Parameterized constructor
    public Customer(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString for displaying customer details
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

 class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        customers = new ArrayList<>();
    }

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to get all customers
    public List<Customer> getCustomers() {
        return customers;
    }

    // Method to sort customers
    public void sortCustomers() {
        customers.sort(Comparator
                .comparing(Customer::getFirstName)
                .thenComparing(Customer::getLastName)
                .thenComparingInt(Customer::getId)
                .thenComparingDouble(Customer::getBalance));
    }
}

