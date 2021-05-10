package Concrete;

import Abstracts.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService{

	@Override
	public void add(Game game, Player player) {
		System.out.println("Tebrikler " + player.getPlayerName() + "! " +game.getGameName() + " Isimli oyun eklendi.");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getGameName() + " Isimli oyun silindi.");
		
	}

}
