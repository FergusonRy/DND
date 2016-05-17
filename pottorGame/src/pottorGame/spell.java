package pottorGame;

public class spell
	{
		String combo;
		String name;
		int damage;
		int level;	

		public spell (String n, String cmb, int dm, int lvl)
			{
			name = n;	
			combo = cmb;
			damage =dm;
			level = lvl;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public String getCombo()
			{
				return combo;
			}
		public void setCombo(String combo)
			{
				this.combo = combo;
			}
		public int getDamage()
			{
				return damage;
			}
		public void setDamage(int damage)
			{
				this.damage = damage;
			}
		public int getLevel()
			{
				return level;
			}
		public void setLevel(int level)
			{
				this.level = level;
			}


	}
