package com.OurCharacters;

import com.Interfaces.Royal;
import com.app.Weapons.Weapon;
import com.parents.Elf;

public class ElfRoyal extends Elf implements Royal {
private Weapon royalWeapon = null;
	
	public ElfRoyal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ElfRoyal(Weapon jedWeapons) {
		super();
		this.royalWeapon = royalWeapon;
	}

	public ElfRoyal(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health - 5);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic + 40);
	}

	@Override
	public void setWeapons(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapons(Weapon.SCROLL);
	}

	

}
