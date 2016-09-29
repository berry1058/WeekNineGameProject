package com.OurCharacters;

import com.Interfaces.Wizard;
import com.app.Weapons.Weapon;
import com.parents.Human;

public class HumanWizard extends Human implements Wizard {

	
	private Weapon wizardWeapon = null;
	
		

	public HumanWizard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HumanWizard(Weapon wizardWeapon) {
		super();
		this.wizardWeapon = wizardWeapon;
	}

	public HumanWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		// TODO Auto-generated method stub
		super.setHealth(health = health + 0);
	}

	@Override
	public void changeMagic() {
		// TODO Auto-generated method stub
		super.setMagic(magic = magic + 200);
	}

	@Override
	public void setWeapons(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapons(Weapon.WAND);
	}

	public HumanWizard makeHumanWizard(){
		HumanWizard ourHumanWizard = new HumanWizard();
		
		ourHumanWizard.changeHealth();
		ourHumanWizard.changeMagic();
		ourHumanWizard.setName(name);
		ourHumanWizard.setWeapons(weapon);
		
		return ourHumanWizard;
	}

	
}
