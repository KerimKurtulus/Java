package concretes;

import abstracts.CampaignService;
import entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar�yla eklendi " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar�yla g�ncellendi " + campaign.getName());
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya ba�ar�yla silindi " + campaign.getName());
		
		
	}

}
