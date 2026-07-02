/**
 * Demonstrates Dependency Injection.
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.displayCustomer(101);

    }

}