import java.time.LocalDate;

import adapter.CheckAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.PlayerManager;
import concretes.SaleManager;
import entites.Campaign;
import entites.Game;
import entites.Player;
import entites.Sale;

public class Main {

	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirstNameString("Abdulkerimhan");
		player1.setLastName("Kurtuluþ");
		player1.setNationalityId("19070059832");
		player1.setDateOfBirthDate(LocalDate.of(1997, 10, 14));		
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("CS:GO");
		game1.setPrice(100);
		game1.setDescription("Silahli oyun :)");		
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Kampanya 1");
		campaign1.setDiscountPercent(35);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setPlayer(player1);	


		PlayerManager playerManager = new PlayerManager(new CheckAdapter());
		playerManager.add(player1);		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.add(sale1, campaign1);

	}

}
