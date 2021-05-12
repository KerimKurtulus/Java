package concretes;

import abstracts.PlayerCheckService;
import abstracts.PlayerService;
import entites.Player;

public class PlayerManager implements PlayerService
{

	
	PlayerCheckService playerCheckService;
	
	public PlayerManager(PlayerCheckService playerCheckService) {
		
		this.playerCheckService =playerCheckService;
	}

	@Override
	public void add(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("Ba�ar�yla Kay�t oldunuz: " + player.getFirstNameString() + " " + player.getLastName());
		}
		else {
			System.out.println("Girdi�iniz bilgiler hatal�d�r");
		}		
		
	}

	@Override
	public void update(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("Bilgiler ba�ar�yla g�ncellendi: " + player.getFirstNameString() + " " + player.getLastName());
		}
		else {
			System.out.println("Girdi�iniz bilgiler hatal�d�r");
		}	
		
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("Silme i�lemi ba�ar�l�" + player.getLastName());
		
		
	}
}
