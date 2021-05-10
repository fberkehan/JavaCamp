package Entities;

public class Player {
int playerId;
String playerName;
String playerSurname;
String nationalNumber;
int birthYear;
Game[] hasGames;

public Player(int playerId, String playerName, String playerSurname, String nationalNumber, int birthYear) {
	super();
	this.playerId = playerId;
	this.playerName = playerName;
	this.playerSurname = playerSurname;
	this.nationalNumber = nationalNumber;
	this.birthYear = birthYear;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public String getPlayerName() {
	return playerName;
}

public void setPlayerName(String playerName) {
	this.playerName = playerName;
}

public String getPlayerSurname() {
	return playerSurname;
}

public void setPlayerSurname(String playerSurname) {
	this.playerSurname = playerSurname;
}

public String getNationalNumber() {
	return nationalNumber;
}

public void setNationalNumber(String nationalNumber) {
	this.nationalNumber = nationalNumber;
}

public int getBirthYear() {
	return birthYear;
}

public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}

public Game[] getHasGames() {
	return hasGames;
}

public void setHasGames(Game[] hasGames) {
	this.hasGames = hasGames;
}
}
