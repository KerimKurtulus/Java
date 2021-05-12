package concretes;

import abstracts.CampaignService;
import entites.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Kampanya başarıyla eklendi " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya başarıyla güncellendi " + campaign.getName());
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya başarıyla silindi " + campaign.getName());
		
		
	}

}
