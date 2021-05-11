package entities.concretes;

import entities.Abstracts.Entity;

public class User implements Entity{
int id;
String eMail;
String name;
String surName;
String password;

public User(int id, String eMail, String name, String surName, String password) {
	super();
	this.id = id;
	this.eMail = eMail;
	this.name = name;
	this.surName = surName;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurName() {
	return surName;
}

public void setSurName(String surName) {
	this.surName = surName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
