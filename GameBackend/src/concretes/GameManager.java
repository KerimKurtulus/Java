package concretes;

import abstracts.GameService;
import entites.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) {
		
		System.out.println("Oyun başarıyla eklendi" + game.getGameName());
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun başarıyla güncellendi" + game.getGameName());
		
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun başarıyla silindi" + game.getGameName());
		
		
	}

}
