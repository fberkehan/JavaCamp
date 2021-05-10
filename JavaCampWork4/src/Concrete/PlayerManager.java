package Concrete;

import Abstracts.PlayerCheckService;
import Abstracts.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	private PlayerCheckService playerCheckService;
	public PlayerManager()
	{
		
	}
	public PlayerManager(PlayerCheckService playerCheckService)
	{
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void add(Player player) {
		if(playerCheckService.checkIfRealPlayer(player))
		{
			System.out.println(player.getPlayerName()+ " Isimli Kullan�c� Eklendi.");
		}else {
			
			System.out.println("Kimlik Dogrulamas� Basarisiz. Lutfen Bilgilerinizi Kontrol Edin.");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getPlayerName()+ " Isimli Kullan�c� Silindi.");
		
	}

}
