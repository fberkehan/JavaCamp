import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player(1,"Mert Bekir", "Karademir", "00000000000", 2005); // player1 isimli yeni bir oyuncu.
		Game game1 = new Game(1, "Valorant", "Online FPS Game", 0); //game1 isimli yeni bir oyun.
		
		PlayerCheckManager playerCheckManager = new PlayerCheckManager(); //Kullanici kontrol sistemi için referans tanımlama.
		PlayerManager playerManager = new PlayerManager(playerCheckManager); //Kullanici islemleri icin referans tanımlama.
		GameManager gameManager = new GameManager(); //oyun islemleri icin referans tanimlama
		
		playerManager.add(player1); //player1 isimli oyuncuyu ekleme
		
		gameManager.add(game1, player1); //player1 isimli oyuncuya game1'i ekleme.
	}

}
