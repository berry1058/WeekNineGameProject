package com.OurCharacters;

import com.Interfaces.Ninja;
import com.app.Weapons.Weapon;
import com.parents.Turtle;

public class TurtleNinja extends Turtle implements Ninja {

	private Weapon ninjaWeapon = null;
	

	public TurtleNinja() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TurtleNinja(Weapon ninjaWeapon) {
		super();
		this.ninjaWeapon = ninjaWeapon;
	}

	public TurtleNinja(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health + 20);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic - 5);
	}

	@Override
	public void setWeapons(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapons(Weapon.NUNCHUCK);
	}
	
}
