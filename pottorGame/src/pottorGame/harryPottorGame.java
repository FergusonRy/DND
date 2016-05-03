package pottorGame;
import java.util.Scanner;

public class harryPottorGame
	{
				static int i=0;
				static int e=0;
				static int s=0;
				static int n=0;
				static int t=0;
				static int f=0;
				static int p=0;
				static int j=0;
				static Scanner userInput = new Scanner(System.in);
				static Wand wd = new Wand ("", "", "", 0);
				static SpellBook sb = new SpellBook("","");
				static Wizard wiz = new Wizard("", "", 0, wd, sb);
				public static void main(String[] args) throws InterruptedException
					{
						fillName();
						meetOlivander();
						takeTest();
						getWood();
						getCore();
						getSize();
						getFlexability();
						buyWand();
						lookForBook();
						hogwartsExpress();
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
				public static void meetOlivander()  throws InterruptedException
				{
					System.out.println("As you enter Diagon Ally you notice the giant crooked building ahead and all of the shops along the side.");
					Thread.sleep(1000);
					System.out.println("However you know why your here. Your here to get your wand.");
					Thread.sleep(1000);
					System.out.println("You enter the store Olivanders and notice an old man standing on the other side of a desk.");
					Thread.sleep(188);
					System.out.println("he says ah your here for your first wand well lets see it");
					Thread.sleep(139);
				}
				public static void takeTest()   throws InterruptedException
				{		
					System.out.println("do you prefer (1) action and variety, or (2) quiet time to think things over?");
					int size = userInput.nextInt();
					if (size==1)
						{
							e = e +1;
						}
					else if (size==2)
						{
							i = i +1;
						}
					else
						{
						takeTest();
						}
					System.out.println("do you prefer to think about (1) what is going on now, or (2) the future and what might be?");
					int attitude = userInput.nextInt();
					if (attitude==1)
						{
							s = s + 1;
						}
					else if (attitude==2)
						{
							n = n + 1;
						}
					else 
						{
						takeTest();
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
						takeTest();
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
							takeTest();
						}
					System.out.println("do like to (1) act quickly, without thinking, or (2) rehearse what you say before you speak?");
					int question5 = userInput.nextInt();
					if (question5==1)
						{
							e = e +1;
						}
					else if (question5==2)
						{
							i = i +1;
						}
					else
						{
						takeTest();
						}
					System.out.println("do you prefer your friends to be (1) sensible and realistic people, or (2) imaginative and creative people?");
					int question6 = userInput.nextInt();
					if (question6==1)
						{
							s = s +1;
						}
					else if (question6==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("do you find (1) it easy to tell others how you feel and think, or (2) that you avoid hurting other peoples's feelings?");
					int question7 = userInput.nextInt();
					if (question7==1)
						{
							f = f +1;
						}
					else if (question7==2)
						{
							t = t +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("If you were to plan a trip, would you prefer to (1) have times, dates, and places arranged in advance, or (2) have no plans?");
					int question8 = userInput.nextInt();
					if (question8==1)
						{
							j = j +1;
						}
					else if (question8==2)
						{
							p = p +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("do you prefer (1) to know what others expect of you, or (2) to understand something before you do it?");
					int question9 = userInput.nextInt();
					if (question9==1)
						{
							e = e +1;
						}
					else if (question9==2)
						{
							i = i +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you like doing things (1) in the usual way, or (2) in a new and different way than others?");
					int question10 = userInput.nextInt();
					if (question10==1)
						{
							s = s +1;
						}
					else if (question10==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("do you tend to think more (1) with your head, or (2) with your heart?");
					int question11 = userInput.nextInt();
					if (question11==1)
						{
							t = t +1;
						}
					else if (question11==2)
						{
							f = f +1;
						}
					else
						{
							takeTest();
						}
					Thread.sleep(120);
					System.out.println("lets try this one olivander said handing you a wand");
					Thread.sleep(120);
					System.out.println("you give it a little flick and...");
					System.out.println("hit (5) to flick your wand");
					int flick = userInput.nextInt();
					if (flick==5)
					{
						Thread.sleep(1000);
						System.out.println("        *    *");
						System.out.println("*         '       *       .  *   '     .           * *");
						System.out.println("                                                         '");
						System.out.println(" *                *'          *          *        '");
						System.out.println(".           *               |               /");
						System.out.println("         '.         |    |      '       |   '     *");
						System.out.println("           \\*        \\   \\             /");
						System.out.println(" '          \\     '* |    |  *        |*                *  *");
						System.out.println("      *      `.       \\   |     *     /    *      '");
						System.out.println(".                  \\      |   \\          /               *");
						System.out.println("*'  *     '      \\      \\   '.       |");
						System.out.println("  -._            `                  /         *");
						System.out.println("' '      ``._   *                           '          .      '");
						System.out.println("*           *\\*          * .   .      *");
						System.out.println("*  '        *    `-._                       .         _..:='        *");
						System.out.println("       .  '      *       *    *   .       _.:--'");
						System.out.println("    *           .     .     *         .-'         *");
						System.out.println(".               '             . '   *           *         .");
						System.out.println("*       ___.-=--..-._     *                '               '");
						System.out.println("                            *       *");
						System.out.println("          *        _.'  .'       `.        '  *             *");
						System.out.println("*              *_.-'   .'            `.               *");
						System.out.println("             .'                       `._             *  '");
						System.out.println("'       '                        .       .  `.     .");
						System.out.println(" .                      *                  `");
						System.out.println("         *        '             '                          .");
						System.out.println(".                          *        .           *  *");
						System.out.println("       *        .                                    '");
					}
					System.out.println("oh no that wont do olivander said.");
					System.out.println("shall we continue");
					System.out.println("Do you prefer to (1) make a decisions quickly, or (2) put off making a decision?");
					int question12 = userInput.nextInt();
					if (question12==1)
						{
							p = p +1;
						}
					else if (question12==2)
						{
							j = j +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you feel (1) best when you're with more than a few people, or (2) do you often feel lost in the crowd?");
					int question13 = userInput.nextInt();
					if (question13==1)
						{
							e = e +1;
						}
					else if (question13==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("is easier for you to see (1) how other people are useful, or (2) how other people see?");
					int question14 = userInput.nextInt();
					if (question14==1)
						{
							n = n +1;
						}
					else if (question14==2)
						{
							s = s +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("are you (1) more firm (2) more gentle?");
					int question15 = userInput.nextInt();
					if (question15==1)
						{
							t = t +1;
						}
					else if (question15==2)
						{
							f = f +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you (1) like things neat and orderly, or (2) do you find it a bother to keep things neat and orderly?");
					int question16 = userInput.nextInt();
					if (question16==1)
						{
							j = j +1;
						}
					else if (question16==2)
						{
							p = p +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you prefer to have (1) many friends, or (2) one or two close friends?");
					int question17 = userInput.nextInt();
					if (question17==1)
						{
							e = e +1;
						}
					else if (question17==2)
						{
							i = i +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Which is more of a compliment to you?");
					System.out.println("(1) There's a person with good common sense.");
					System.out.println("(2) There's a person with imagination.");
					int question18 = userInput.nextInt();
					if (question18==1)
						{
							s = s +1;
						}
					else if (question18==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you (1) find it usually doesnt bother you when others dont get along, or (2) because upset when others dont get along?");
					int question19 = userInput.nextInt();
					if (question19==1)
						{
							t = t +1;
						}
					else if (question19==2)
						{
							f = f +1;	
						}					
					else					
						{				
							takeTest();
						}
					System.out.println("Do you prefer to (1) finish one thing before starting another, or (2) have many projects going on at once, leaving some of them unfinished?");
					int question20 = userInput.nextInt();
					if (question20==1)
						{
							j = j +1;
						}
					else if (question20==2)
						{
							p = p +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you prefer to work (1) in a group, or (2) alone?");
					int question21 = userInput.nextInt();
					if (question21==1)
						{
							e = e +1;
						}
					else if (question21==2)
						{
							i = i +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Do you find it (1) easy, or (2) difficult... to remember facts and figures?");
					int question22 = userInput.nextInt();
					if (question22==1)
						{
							s = s +1;
						}
					else if (question22==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Are you more (1) sympathetic, or (2) fair minded?");
					int question23 = userInput.nextInt();
					if (question23==1)
						{
							f = f +1;
						}
					else if (question23==2)
						{
							t = t +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("On weekends, do you prefer (1) to have some things planned, or (2) to do whatever comes up?");
					int question24 = userInput.nextInt();
					if (question24==1)
						{
							j = j +1;
						}
					else if (question24==2)
						{
							p = p +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("When you're with others you dont know very well, are you more likely to (1) begin conversation with them, or (2) wait for them to approach you?");
					int question25 = userInput.nextInt();
					if (question25==1)
						{
							e = e +1;
						}
					else if (question25==2)
						{
							i = i +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("Are you more interested in (1) what is, or (2) what could be?");
					int question26 = userInput.nextInt();
					if (question26==1)
						{
							s = s +1;
						}
					else if (question26==2)
						{
							n = n +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("are you more often (1) cool headed or (2) warm headed?");
					int question27 = userInput.nextInt();
					if (question27==1)
						{
							t = t +1;
						}
					else if (question27==2)
						{
							f = f +1;
						}
					else
						{
							takeTest();
						}
					System.out.println("which is more of a compliment to you?"); 
					System.out.println("(1) There is a very logical person.");
					System.out.println("(2) There is a very sentimental person.");
					int question28 = userInput.nextInt();
					if (question28==1)
						{
							f = f +1;
						}
					else if (question28==2)
						{
							t = t +1;
						}
					else
						{
							takeTest();
						}
				}
				public static void getWood()  
				{
					if (e%i==0)
						{
							wd.setWood(wd.getWood() + "vine");
						}
					else if (e%i==1)
						{
							wd.setWood(wd.getWood() + "cedar");
						}
					else if (e%i==2)
						{
							wd.setWood(wd.getWood() + "cherry");
						}
					else if (e%i==3)
						{
							wd.setWood(wd.getWood() + "ash");
						}
					else
						{
							wd.setWood(wd.getWood() + "willow");
						}
				}
				public static void getCore()
				{
					if(s%n==0)
						{
							wd.setCore(wd.getCore() + "Unicorn Hair core");
						}
					else if(s%n==1)
						{
							wd.setCore(wd.getCore() + "Dragon Heartstring core");
						}
					else if(s%n==2)
						{
							wd.setCore(wd.getCore() + "Phoenix Feather core");
						}
					else if(s%n==3) 
						{
							wd.setCore(wd.getCore() + "Thestral tail hair core");
						}
					else 
						{
							wd.setCore(wd.getCore() + "Veela hair core");
						}
				}
				public static void getSize()
				{
					if(t%f==0)
						{
							wd.setSize(wd.getSize() + 11);
						}
					else if(t%f==1)
						{
							wd.setSize(wd.getSize() + 13);
						}
					else if(t%f==2)
						{
							wd.setSize(wd.getSize() + 9);
						}
					else if(t%f==3)
						{
							wd.setSize(wd.getSize() + 10);
						}
					else 
						{
							wd.setSize(wd.getSize() + 12);
						}
				}
				public static void getFlexability()
				{
					if (j%p==0)
						{
							wd.setStability(wd.getStability() + "Surprisingly Swishy");
						}
					else if(j%p==1)
						{
							wd.setStability(wd.getStability() + "Slightly Yielding");
						}
					else if(j%p==2)
						{
							wd.setStability(wd.getStability() + "Quite flexible");
						}
					else if(j%p==3)
						{
							wd.setStability(wd.getStability() + "Unyielding");
						}
					else
						{
							wd.setStability(wd.getStability() + "stiff");
						}
				}
				public static void buyWand() throws InterruptedException
				{
					wiz.setWand(wd);
					System.out.println("ah I think I've got it, Olivander said");
					System.out.println("he hands you another wand");
					System.out.println("as you grab the wand the air around you glows a faint yellow.");
					System.out.println("I knew that was the one, its made of " + wd.getWood() + " with a " + wd.getCore() + ", " + wd.getSize() + "inches, " + wd.getStability());	
					Thread.sleep(10000);
				}
				public static void lookForBook() throws InterruptedException
				{
					System.out.println("now that you have your wand you should head over to Flourish and blotts and get your first spell Book. ");
					Thread.sleep(1000);
					System.out.println("your walking over...");
					for (int i=0; i<(Math.random() * 10) + 5; i++)
						{
							Thread.sleep(950);
							System.out.println(".");
						}
					System.out.println("another first year? a women said standing behind a desk at the back of the shop.");
					Thread.sleep(950);
					System.out.println("well it looks like you need your standered school books.");
					Thread.sleep(950);
					System.out.println("the lady walks over to you with a giant stack of books.");
					System.out.println("you notice the first book on the top of the stack it says Standered Book of Spells. Grade 1.");
					sb.setName(sb.getName() + "Standered book of spells. Grade 1");
				}	
				public static void hogwartsExpress()
				{
					System.out.println("you arrive at platform nine and three quaters.");
					System.out.println("you load all of the stuff in the train except your new wand and your spell book");
				}
			}

