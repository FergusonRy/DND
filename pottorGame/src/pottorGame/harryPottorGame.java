package pottorGame;

import java.util.Scanner;

public class harryPottorGame
	{
		static Scanner userInput = new Scanner(System.in);
		static Wand w = new Wand ("", "", "", 0, 0, 0);
		static Wizard wiz = new Wizard("", "", 0, w);
		public static void main(String[] args) throws InterruptedException
			{
				fillName();
				buyWand();
			}
		public static void fillName() throws InterruptedException
			{
				System.out.println("           *");
				Thread.sleep(149);
				System.out.println("       *   *");
				Thread.sleep(139);
				System.out.println("     *    \\* / *");
				Thread.sleep(129);
				System.out.println("       * --.:. *");
				Thread.sleep(119);
				System.out.println("      *   * :\\ -");
				Thread.sleep(109);
				System.out.println("        .*  | \\");
				Thread.sleep(99);
				System.out.println("       * *     \\");
				Thread.sleep(89);
				System.out.println("     .  *       \\");
				Thread.sleep(79);
				System.out.println("      ..        /\\.");
				Thread.sleep(69);
				System.out.println("     *          |\\)|");
				Thread.sleep(59);
				System.out.println("   .   *         \\ |");
				Thread.sleep(49);
				System.out.println("  . . *           |/\\");
				Thread.sleep(39);
				System.out.println("     .* *         /  \\");
				Thread.sleep(29);
				System.out.println("   *              \\ / \\");
				Thread.sleep(19);
				System.out.println(" *  .  *           \\   \\");
				System.out.println("    * .");  
				System.out.println("   *    *");    
				System.out.println("  .   *    *");  
				System.out.println("Hello, I hope your ready to enter into the amazing world of harry pottor.");
				System.out.println("First of all you need to choose your Wizard's name so...");
				System.out.println("What do you want your Wizards name to be?");
				String word = userInput.nextLine();
				wiz.setName(word);
				System.out.println("Welcome " + wiz.getName() + "!!!");
			}
		public static void buyWand()  throws InterruptedException
		{
		int points=0;
		System.out.println("As you enter Diagon Ally you notice the giant crooked building ahead, all of the shops along the side.");
		Thread.sleep(1000);
		System.out.println("However you know why your here. Your here to get your wand.");
		Thread.sleep(1000);
		System.out.println("You enter the store Olivands and notice an old man standing on the other side of a desk.");
		Thread.sleep(188);
		System.out.println("he says aaaaa your here for your first wand well lets see it");
		Thread.sleep(139);
		System.out.println("do you consider yourself (1) tall (2) medium (3) small");
		int size = userInput.nextInt();
		if (size==1)
			{
				w.setSize(w.getSize() +12);
				points = points + 10;
			}
		else if (size==2)
			{
				w.setSize(w.getSize() +10);
				points = points +5;
			}
		else if (size==3)
			{
				w.setSize(w.getSize() +8);
				points = points + 0;
			}
		else
			{
				buyWand();
			}
		System.out.println("do you consider yourself (1) stubborn, (2) easy going, (3) agressive, (4) passive");
		int attitude = userInput.nextInt();
		if (attitude==1)
			{
				points = points + 15;
			}
		else if (attitude==2)
			{
				points = points + 5;
			}
		else if (attitude==3)
			{
				points = points + 10;
			}
		else if (attitude==4)
			{
				points = points +0;
			}
		else 
			{
				buyWand();
			}
		System.out.println("if there was a fork in the road and it you had to choose to go to them (1) mountains, (2) forest, (3) ocian, which would you choose?");
		int direction = userInput.nextInt();
		if (direction==1)
			{
				points = points + 10;
			}
		else if (direction==2)
			{
				points = points + 5;
			}
		else if (direction==3)
			{
				points = points + 0;
			}
		else 
			{
				buyWand();
			}
		System.out.println("what are you most looking forword to studying at hogwarts? (1) Herbology (2) Defence against the Dark arts (3)");
		}
		

	}
