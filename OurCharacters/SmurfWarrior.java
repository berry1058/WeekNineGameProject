package com.OurCharacters;

import com.Interfaces.Warrior;
import com.app.Weapons.Weapon;
import com.parents.Smurf;

public class SmurfWarrior extends Smurf implements Warrior {

	private Weapon warriorWeapon = null;
	
	

	public SmurfWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SmurfWarrior(Weapon warriorWeapon) {
		super();
		this.warriorWeapon = warriorWeapon;
	}

	public SmurfWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health + 75);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic + 0);
	}

	@Override
	public void setWeapons(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapons(Weapon.MACE);
	}


	

	
}
