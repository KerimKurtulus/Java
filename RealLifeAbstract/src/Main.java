import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager basecustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		
		basecustomerManager.save(new Customer(1, "Kerim", "Kurtulus", LocalDate.of(1998, 10, 14), "190700535455") );
		

	}

}
