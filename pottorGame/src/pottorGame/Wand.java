package pottorGame;

public class Wand
{
String wood;
String core;
String stability;
int size;
	public Wand (String w, String c, String st, int sz)
		{
		wood = w;
		core = c;
		stability = st;
		size = sz;
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

}
