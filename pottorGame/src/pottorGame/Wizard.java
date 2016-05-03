package pottorGame;
public class Wizard
{
String name;
String house;
int health;
Wand wand;
SpellBook spellBook;
	
	public Wizard (String n, String h, int hp, Wand w, SpellBook sb)
		{
		name = n;
		house = h;
		health =hp;
		wand =w;
		spellBook =sb;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Wand getWand() {
		return wand;
	}

	public void setWand(Wand wand) {
		this.wand = wand;
	}

	public SpellBook getSpellBook() {
		return spellBook;
	}

	public void setSpellBook(SpellBook spellBook) {
		this.spellBook = spellBook;
	}
	

}
