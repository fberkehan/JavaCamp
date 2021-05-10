package Entities;

public class Game {
int gameId;
String gameName;
String gameDescription;
double gamePrice;

public Game(int gameId, String gameName, String gameDescription, double gamePrice) {
	super();
	this.gameId = gameId;
	this.gameName = gameName;
	this.gameDescription = gameDescription;
	this.gamePrice = gamePrice;
}

public int getGameId() {
	return gameId;
}

public void setGameId(int gameId) {
	this.gameId = gameId;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public String getGameDescription() {
	return gameDescription;
}

public void setGameDescription(String gameDescription) {
	this.gameDescription = gameDescription;
}

public double getGamePrice() {
	return gamePrice;
}

public void setGamePrice(double gamePrice) {
	this.gamePrice = gamePrice;
}
}
