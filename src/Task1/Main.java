package Task1;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Customer> customers;

    public static void main(String[] args) {

        // Initialize ArrayList
        customers = new ArrayList<>();

        // Add customers to ArrayList
        customers.add(new Customer("Lauritz", "Hauge", "Lauritzmh"));
        customers.add(new Customer("John", "Smith", "Agent47"));
        customers.add(new Customer("Joe", "Mama", "Mrpickles"));
        customers.add(new Customer("Adam", "Sandler", "FunnyGuy420"));
        customers.add(new Customer("Rick", "Astley", "NeverGonna"));
        customers.add(new Customer("Jack", "Beans", "Mr.Bean"));

        printCustomers();
    }

    private static void printCustomers() {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}