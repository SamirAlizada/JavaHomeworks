import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException{
		Customer customer= new Customer();
		customer.setId(1);
		customer.setNationalityId(12345678911L);
		customer.setFirstName("Furkan");
		customer.setLastName("Çeri");
		customer.setBirthYear(1995);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		
		

	}

}
