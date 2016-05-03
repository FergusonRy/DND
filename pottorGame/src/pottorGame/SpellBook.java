package pottorGame;
public class SpellBook
{
	String name;
	String spells;
	
		public SpellBook (String n, String s)
			{
			name = n;
			spells = s;
			}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSpells() {
			return spells;
		}

		public void setSpells(String spells) {
			this.spells = spells;
		}

}
