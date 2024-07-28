package dependencies;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // # Hard coded # In practical example it interacts with a DB
        return new Customer(id, "Soumyajit Dey Sarkar");
    }
}
