package concretes;

import abstracts.SaleService;
import entites.Campaign;
import entites.Sale;

public class SaleManager implements SaleService {

	@Override
	public void add(Sale sale) {
		
		System.out.println("Satýn alma iþleminiz baþarýyla gerçekleþmiþtir" + "  " + "Tutar : " + sale.getGame().getPrice());
		
	}
	
	
	
	public void add(Sale sale,Campaign campaign) {
		
		
		System.out.println("Satýn alma iþleminiz baþarýyla gerçekleþmiþtir" + "  " + "Tutar : " + (sale.getGame().getPrice()-sale.getGame().getPrice()*campaign.getDiscountPercent()/100));
		
	}

}
