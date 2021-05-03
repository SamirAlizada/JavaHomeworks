import Abstract.BaseCustomerManager;
import Concrate.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer= new Customer();
		customer.setId(1);
		customer.setNationalityId("12345678911");
		customer.setFirstName("Furkan");
		customer.setLastName("Çeri");
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(customer);
		
		

	}

}
