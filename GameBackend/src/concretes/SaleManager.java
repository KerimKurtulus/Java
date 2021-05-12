package concretes;

import abstracts.SaleService;
import entites.Campaign;
import entites.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		
		System.out.println("Sat�n alma i�leminiz ba�ar�yla ger�ekle�mi�tir" + "  " + "Tutar : " + sale.getGame().getPrice());
		
	}
	
	
	
	public void add(Sale sale,Campaign campaign) {
		
		
		System.out.println("Sat�n alma i�leminiz ba�ar�yla ger�ekle�mi�tir" + "  " + "Tutar : " + (sale.getGame().getPrice()-sale.getGame().getPrice()*campaign.getDiscountPercent()/100));
		
	}

}
