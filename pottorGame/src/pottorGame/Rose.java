package pottorGame;

public class Rose
	{
		String name;
		int health;
		int level;		
		public Rose (String n, int hp, int lvl)
			{
			name = n;			
			health =hp;
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

		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
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
