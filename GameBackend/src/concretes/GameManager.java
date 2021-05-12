package concretes;

import abstracts.GameService;
import entites.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun baþarýyla eklendi" + game.getGameName());
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun baþarýyla güncellendi" + game.getGameName());
		
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun baþarýyla silindi" + game.getGameName());
		
		
	}

}
