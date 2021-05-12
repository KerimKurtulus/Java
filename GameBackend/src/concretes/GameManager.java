package concretes;

import abstracts.GameService;
import entites.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun ba�ar�yla eklendi" + game.getGameName());
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun ba�ar�yla g�ncellendi" + game.getGameName());
		
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun ba�ar�yla silindi" + game.getGameName());
		
		
	}

}
