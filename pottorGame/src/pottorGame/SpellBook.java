package pottorGame;
public class SpellBook
{
	String name;
	spell spell;
	
		public SpellBook (String n, spell sp)
			{
			name = n;
			spell = sp;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public spell getSpell()
			{
				return spell;
			}

		public void setSpell(spell spell)
			{
				this.spell = spell;
			}

}
