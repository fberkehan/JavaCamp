package Concrete;

import Abstracts.PlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements PlayerCheckService{

	@Override
	public Boolean checkIfRealPlayer(Player player) {
		// Mernis ba�lant� kodlar� ve if ile sorgulama
		return true;
	}

}
