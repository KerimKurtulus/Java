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
			System.out.println("Baþarýyla Kayýt oldunuz: " + player.getFirstNameString() + " " + player.getLastName());
		}
		else {
			System.out.println("Girdiðiniz bilgiler hatalýdýr");
		}		
		
	}

	@Override
	public void update(Player player) {
		
		if(playerCheckService.checkIfRealPerson(player)) 
		{
			System.out.println("Bilgiler baþarýyla güncellendi: " + player.getFirstNameString() + " " + player.getLastName());
		}
		else {
			System.out.println("Girdiðiniz bilgiler hatalýdýr");
		}	
		
		
	}

	@Override
	public void delete(Player player) {
		
		System.out.println("Silme iþlemi baþarýlý" + player.getLastName());
		
		
	}
}
