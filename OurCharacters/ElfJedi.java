package com.OurCharacters;

import com.Interfaces.Jedi;
import com.app.Weapons.Weapon;
import com.parents.Elf;

public class ElfJedi extends Elf implements Jedi {

	private Weapon jediWeapon = null;
	
	public ElfJedi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ElfJedi(Weapon jedWeapons) {
		super();
		this.jediWeapon = jediWeapon;
	}

	public ElfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health + 50);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic + 100);
	}

	@Override
	public void setWeapons(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapons(weapon);
	}

	

}
