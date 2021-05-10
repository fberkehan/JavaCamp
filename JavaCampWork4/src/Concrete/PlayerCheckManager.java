package Concrete;

import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public Boolean checkIfRealPlayer(Player player) {
		// Mernis baðlantý kodlarý ve if ile sorgulama
		return true;
	}

}
