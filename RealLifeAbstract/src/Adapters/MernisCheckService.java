package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisCheckService implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;
	}

}
