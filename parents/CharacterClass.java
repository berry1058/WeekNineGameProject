package com.parents;

import com.app.Weapons;
import com.app.Weapons.*;


public class CharacterClass {
protected int health = 0;
protected int magic = 0;
protected String name = null;
protected Weapon weapon = null;
public CharacterClass() {
	super();
	// TODO Auto-generated constructor stub
}

public CharacterClass(int health, int magic, String name, Weapon weapon) {
	super();
	this.health = health;
	this.magic = magic;
	this.name = name;
	this.weapon = weapon;
}

public int getHealth() {
	return health;
}

public void setHealth(int health) {
	this.health = health;
}

public int getMagic() {
	return magic;
}

public void setMagic(int magic) {
	this.magic = magic;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Weapon getWeapons() {
	return weapon;
}

public void setWeapons(Weapon weapon) {
	this.weapon = weapon;
}



}
