import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(1,"Mert Bekir", "Karademir", "00000000000", 2005);
		Game game1 = new Game(1, "Valorant", "Online FPS Game", 0);
		
		PlayerCheckManager playerCheckManager = new PlayerCheckManager();
		PlayerManager playerManager = new PlayerManager(playerCheckManager);
		GameManager gameManager = new GameManager();
		
		playerManager.add(player1);
		
		gameManager.add(game1, player1);
	}

}
