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
		int I=0;
		int E=0;
		int s=0;
		int w=0;
		int t=0;
		int f=0;
		int p=0;
		int j=0;
		System.out.println("As you enter Diagon Ally you notice the giant crooked building ahead, all of the shops along the side.");
		Thread.sleep(1000);
		System.out.println("However you know why your here. Your here to get your wand.");
		Thread.sleep(1000);
		System.out.println("You enter the store Olivands and notice an old man standing on the other side of a desk.");
		Thread.sleep(188);
		System.out.println("he says aaaaa your here for your first wand well lets see it");
		Thread.sleep(139);
		System.out.println("do you prefer (1) action and variety, or (2) quiet time to think things over?");
		int size = userInput.nextInt();
		if (size==1)
			{
				E = E +1;
			}
		else if (size==2)
			{
				I = I +1;
			}
		else
			{
				buyWand();
			}
		System.out.println("do you prefer to think about (1) what is going on now, or (2) the future and what might be?");
		int attitude = userInput.nextInt();
		if (attitude==1)
			{
				s = s + 1;
			}
		else if (attitude==2)
			{
				w = w + 1;
			}
		else 
			{
				buyWand();
			}
		System.out.println("Do you prefure to decide (1) on what is best, no matter how you feel, or (2) by how yoou feel about something?");
		int direction = userInput.nextInt();
		if (direction==1)
			{
				t = t + 1;
			}
		else if (direction==2)
			{
				f = f + 1;
			}
		else 
			{
				buyWand();
			}
		System.out.println("Do you like to (1) have a plan before getting started on something, or (2) get going on something by just getting it?");
		int question4 = userInput.nextInt();
		if (question4==1)
			{
				j = j + 1;
			}
		else if (question4==2)
			{
				p = p +1;
			}
		else 
			{
				buyWand();
			}
		}
		

	}
