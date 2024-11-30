public class main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Adding sample customers
        manager.addCustomer(new Customer(3, "hari", "charan", 1200.50));
        manager.addCustomer(new Customer(1, "vrushab", "kb", 800.75));
        manager.addCustomer(new Customer(2, "reddy", "kumar", 1000.00));
        manager.addCustomer(new Customer(4, "bhanu", "prakash", 1500.00));

        System.out.println("Before Sorting:");
        for (Customer customer : manager.getCustomers()) {
            System.out.println(customer);
        }

        // Sorting customers
        manager.sortCustomers();

        System.out.println("\nAfter Sorting:");
        for (Customer customer : manager.getCustomers()) {
            System.out.println(customer);
        }
    }
}