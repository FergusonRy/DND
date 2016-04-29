package pottorGame;

public class Wand
	{
	String wood;
	String core;
	String stability;
	int size;
	int attack;
	int defence;
	
		public Wand (String w, String c, String st, int sz, int att, int d)
			{
			wood = w;
			core = c;
			stability = st;
			size = sz;
			attack = att;
			defence = d;
			}

		public String getWood()
			{
				return wood;
			}

		public void setWood(String wood)
			{
				this.wood = wood;
			}

		public String getCore()
			{
				return core;
			}

		public void setCore(String core)
			{
				this.core = core;
			}

		public String getStability()
			{
				return stability;
			}

		public void setStability(String stability)
			{
				this.stability = stability;
			}

		public int getSize()
			{
				return size;
			}

		public void setSize(int size)
			{
				this.size = size;
			}

		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public int getDefence()
			{
				return defence;
			}

		public void setDefence(int defence)
			{
				this.defence = defence;
			}

		
	}
