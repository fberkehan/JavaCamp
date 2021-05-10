package Abstracts;

import Entities.Game;
import Entities.Player;

public interface GameService {
void add(Game game, Player player);
void remove(Game game);
}
