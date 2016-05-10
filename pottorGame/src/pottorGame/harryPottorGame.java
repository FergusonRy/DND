package pottorGame;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class harryPottorGame extends JFrame
	{
			private static final long serialVersionUID = 1L;
			static String name; 
			static int answer;
			static JFrame frame = new JFrame();
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
						question1();
						question2();
						question3();
						question4();
						question5();
						question6();
						question7();
						question8();
						question9();
						question10();
						question11();
						question12();
						question13();
						question14();
						question15();
						question16();
						question17();
						question18();
						question19();
						question20();
						question21();
						question22();
						getWood();
						getCore();
						getSize();
						getFlexability();
						buyWand();
						lookForBook();
						hogwartsExpress();
						squidEncounter();
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
						JOptionPane.showMessageDialog(frame,"Hello, I hope your ready to enter into the amazing world of harry pottor.");
						JOptionPane.showMessageDialog(frame,"First of all you need to choose your Wizard's name so...");
						name = JOptionPane.showInputDialog("What is your name?");
						JOptionPane.showMessageDialog(frame, "Welcome, " + name);
						wiz.setName(name);
					}
				public static void meetOlivander()  throws InterruptedException
				{
					JOptionPane.showMessageDialog(frame,"As you enter Diagon Ally you notice the giant crooked building ahead and all of the shops along the side.");					
					JOptionPane.showMessageDialog(frame,"you think about everything you need to start your first year at hogwarts.");
					JOptionPane.showMessageDialog(frame,"the first thing on that list is your wand.");
					JOptionPane.showMessageDialog(frame,"You enter the store Olivanders and notice an old man standing on the other side of a desk.");					
					JOptionPane.showMessageDialog(frame,"he says ah your here for your first wand well lets see it");					
				}
				public static void question1()   
				{	
					Object[] options = {"action and variety", "quiet time to think things over"};
					answer = JOptionPane.showOptionDialog(frame,"what do you prefer?",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							e = e +1;
						break;
						}
					case 1:
						{
							i = i +1;
						break;
						}
					}	
				}
				public static void question2()
				{
					Object[] options ={"what is going on now", "the future and what might be"};
					answer = JOptionPane.showOptionDialog(frame,"do you prefer to think about",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							s = s +1;
						break;
						}
					case 1:
						{
							n = n +1;
						break;
						}
					}
				}
				public static void question3()
				{
					Object[] options ={"on what is best, no matter how you feel", "by how you feel about something"};
					answer = JOptionPane.showOptionDialog(frame,"do you prefer to decide",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							t = t +1;
						break;
						}
					case 1:
						{
							f = f +1;
						break;
						}
					}
				}
				public static void question4()
				{
					Object[] options ={"have a plan before getting started on something", "get going on something by just getting it"};
					answer = JOptionPane.showOptionDialog(frame,"do you like to",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							j = j +1;
						break;
						}
					case 1:
						{
							p = p +1;
						break;
						}
					}
				}
				public static void question5()
				{
					Object[] options ={"act quickly without thinking", "rehearse what you say before you speak"};
					answer = JOptionPane.showOptionDialog(frame,"do you like to",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							e = e +1;
						break;
						}
					case 1:
						{
							i = i +1;
						break;
						}
					}
				}	
				public static void question6()
					{
						Object[] options ={"sensible and realistic people", "imaginative and creative people"};
						answer = JOptionPane.showOptionDialog(frame,"do you prefer your friends to be",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								s = s +1;
							break;
							}
						case 1:
							{
								n = n +1;
							break;
							}
						}
					}
				public static void question7()
					{
						Object[] options ={"easy to tell others how you feel and think", "or do you avoid herting others feelings"};
						answer = JOptionPane.showOptionDialog(frame,"do you find it",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								s = s +1;
							break;
							}
						case 1:
							{
								n = n +1;
							break;
							}
						}
					}
				public static void question8()
				{
					Object[] options ={"have times, dates, and places arranged in advance", "have no plans"};
					answer = JOptionPane.showOptionDialog(frame,"if you were to plan a trip, would you prefer to",
					"personality test",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null, options, options [1]);
					switch(answer)
					{
					case 0:
						{
							j = j +1;
						break;
						}
					case 1:
						{
							p = p +1;
						break;
						}
					}
				}
				public static void question9()
					{
						Object[] options ={"know what others expect of you", "understand something before you do it"};
						answer = JOptionPane.showOptionDialog(frame,"do you prefer to",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								e = e +1;
							break;
							}
						case 1:
							{
								i = i +1;
							break;
							}
						}
					}
				public static void question10()
					{
						Object[] options ={"int the usual way", "in a new and different way then others"};
						answer = JOptionPane.showOptionDialog(frame,"do you like doing things",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								e = e +1;
							break;
							}
						case 1:
							{
								i = i +1;
							break;
							}
						}
					}
				public static void question11() throws InterruptedException
					{
						Object[] options ={"your head", "your heart"};
						answer = JOptionPane.showOptionDialog(frame,"do you tend to think more with",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								t = t +1;
							break;
							}
						case 1:
							{
								f =  +1;
							break;
							}
						}
						Thread.sleep(120);
						JOptionPane.showMessageDialog(frame,"lets try this one olivander said handing you a wand");
						Thread.sleep(120);
						JOptionPane.showMessageDialog(frame,"you give it a little flick and...");
						JOptionPane.showMessageDialog(frame,"hit (5) on the console to flick your wand");
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
						else 
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
						
						JOptionPane.showMessageDialog(frame,"oh no that wont do olivander said.");
						JOptionPane.showMessageDialog(frame,"shall we continue");
					}
				public static void question12()
					{
						Object[] options ={"make a decisions quickly", "put off making a decision"};
						answer = JOptionPane.showOptionDialog(frame,"do you prefer to",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								p = p +1;
							break;
							}
						case 1:
							{
								j = j +1;
							break;
							}
						}
					}
				public static void question13()
					{
						Object[] options ={"best when you're with more then a few people", "or do you often feel lost in the crowd"};
						answer = JOptionPane.showOptionDialog(frame,"do you feel",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								p = p +1;
							break;
							}
						case 1:
							{
								j = j +1;
							break;
							}
						}
					}
				public static void question14()
					{
						Object[] options ={"how other people are useful", "how other people see"};
						answer = JOptionPane.showOptionDialog(frame,"is it easier for you to see",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								n = n +1;
							break;
							}
						case 1:
							{
								s = s +1;
							break;
							}
						}
					}
				public static void question15()
					{
						Object[] options ={"firm", "gentle"};
						answer = JOptionPane.showOptionDialog(frame,"are you more",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								t = t +1;
							break;
							}
						case 1:
							{
								f = f +1;
							break;
							}
						}
					}
				public static void question16()
					{
						Object[] options ={"Like things neat and orderly", "or, do you not care enough to clean"};
						answer = JOptionPane.showOptionDialog(frame,"do you",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								j = j +1;
							break;
							}
						case 1:
							{
								p = p +1;
							break;
							}
						}
					}
				public static void question17()
					{
						Object[] options ={"many friends", "or a small group of close friends"};
						answer = JOptionPane.showOptionDialog(frame,"do you prefer to have",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								e = e +1;
							break;
							}
						case 1:
							{
								i = i +1;
							break;
							}
						}
					}
				public static void question18()
					{
						Object[] options ={"there's a person with good common sense", "there's a person with imagination"};
						answer = JOptionPane.showOptionDialog(frame,"Which is more of a compliment too you",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								s = s +1;
							break;
							}
						case 1:
							{
								n = n +1;
							break;
							}
						}
					}
				public static void question19()
					{
						Object[] options ={"find it usually doesnt bother you when others dont get along", "get upset when others dont get along"};
						answer = JOptionPane.showOptionDialog(frame,"Do you",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								t = t +1;
							break;
							}
						case 1:
							{
								f = f +1;
							break;
							}
						}
					}
				public static void question20()
					{
						Object[] options ={"finish one thing before you start another", "have many projects going on at the same time"};
						answer = JOptionPane.showOptionDialog(frame,"Do you prefer to",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								j = j +1;
							break;
							}
						case 1:
							{
								p = p +1;
							break;
							}
						}
					}
				public static void question21()
					{
						Object[] options ={"finish one thing before you start another", "have many projects going on at the same time"};
						answer = JOptionPane.showOptionDialog(frame,"Do you prefer to",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								j = j +1;
							break;
							}
						case 1:
							{
								p = p +1;
							break;
							}
						}
					}
				public static void question22()
					{
						Object[] options ={"in a group", "alone"};
						answer = JOptionPane.showOptionDialog(frame,"Do you prefer to work",
						"personality test",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options [1]);
						switch(answer)
						{
						case 0:
							{
								e = e +1;
							break;
							}
						case 1:
							{
								i = i +1;
							break;
							}
						}
					}
				public static void takeTest()
				{
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
				public static void hogwartsExpress() throws InterruptedException
				{
					System.out.println("you arrive at platform nine and three quaters.");
					System.out.println("you load all of the stuff in the train except your new wand and your spell book");
					System.out.println("as you sit in your cart eating candy off the trolly your read Standered book of spells grade one");
					System.out.println("the first spell you see is the incendio charm");
					Thread.sleep(950);
					System.out.println("listed next to the charm is a description of how it works");
					Thread.sleep(950);
					System.out.println("Incendio is a charm and a form of Conjuration that can be used to conjure a jet of orange and red flames, therefore setting things on fire.");
					Thread.sleep(3000);
					System.out.println("listed below is the motion you need to make with your wand in order to cast this spell.");
					System.out.println("(1), (2), (3), (5)");					
				}
				public static void squidEncounter() throws InterruptedException
				{
					System.out.println("as you step out of the train you see a big man with a lanter yelling");
					System.out.println("first years! first years! over here.");
					Thread.sleep(2000);
					System.out.println("you make your way to the giant man who introduced himself as hagrid.");
					Thread.sleep(2000);
					System.out.println("he escorts you to a small fleet of boats docked by the lake.");
					Thread.sleep(2000);
					System.out.println("you get in and make your way across the lake...");
					for (int i=0; i<(Math.random() * 10) + 5; i++)
						{
							Thread.sleep(900);
							System.out.println(".");
						}
					System.out.println("about half way accross the lake there was a huge roar.");
					System.out.println("the sound of kids screaming and water splashing was about all you made sence of.");
					System.out.println("on instinct however you took out your wand.");
					System.out.println("as you did you saw the giant tenticale of a giant squid.");
					Thread.sleep(4000);
					System.out.println("please type the combanation of which spell you would like to cast");
					int spell = userInput.nextInt();
					if (spell==1235)
						{
							System.out.println("Incendio!");
						}
					else 
						{
							System.out.println("thats not a spell you died. go to last check point");
							squidEncounter();
						}
				}
			}

