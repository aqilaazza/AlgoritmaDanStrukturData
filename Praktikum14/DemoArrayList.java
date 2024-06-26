import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer(1, "Zaskia");
        Customer customer2 = new Customer(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));

        customers.add(2, new Customer(100, "Rosa"));

        System.out.println("Mencari index ");
        System.out.println(customers.indexOf(customer2));
        System.out.println();

        System.out.println("Mengakses elemen tertentu ");
        Customer customer = customers.get(1);
        System.out.println((customer.name));
        customer.name = "Budi Utomo";
        System.out.println();

        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        customers.addAll(newCustomers);


        System.out.println("Auto sort :");
        customers.sort((Zaskia,Budi)->Zaskia.name.compareTo(Budi.name));
        for(Customer cust : customers) {
            System.out.println(cust.toString());
        }
        System.out.println();
        
        System.out.println(customers);
    }
}
