package pottorGame;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class harryPottorGame extends JFrame
	{
			private static final long serialVersionUID = 1L;
			private static final pottorGame.spell sp = null;
			static String name; 
			static int answer;
			static JFrame frame = new JFrame();
			static int i=1;
			static int e=1;
			static int s=1;
			static int n=1;
			static int t=1;
			static int f=1;
			static int p=1;
			static int j=1;
			static String EorI;
			static String NorS;
			static String TorF;
			static String JorP;
			static Scanner userInput = new Scanner(System.in);
			static Wand wd = new Wand ("", "", "", 0);
			static SpellBook sb = new SpellBook("",sp);
			static Wizard wiz = new Wizard("", "", 0, wd, sb);
			static Rose rz= new Rose("", 0, 0);
			static String spell;
			static String temp;
			static int damage = 0;
			static int blockChance = 0;
			static ArrayList<spell> spells = new ArrayList<spell>();
			public static void main(String[] args) throws InterruptedException 
					{
//						fillName();
//						meetOlivander();
//						question1();
//						question2();
//						question3();
//						question4();
//						question5();
//						question6();
//						question7();
//						question8();
//						question9();
//						question10();
//						question11();
//						question12();
//						question13();
//						question14();
//						question15();
//						question16();
//						question17();
//						question18();
//						question19();
//						question20();
//						question21();
//						question22();
//						question23();
//						question24();
//						question25();
//						question26();
//						question27();
//						question28();
//						getWood();
//						getCore();
//						getLength();
//						getFlexability();
//						buyWand();
//						lookForBook();
//						hogwartsExpress();
//						squidEncounter();
						
//						hogwarts();
//						ble();
//						bwa();
//						bleBle();
//						bwaBwa();
//						temp = EorI + NorS +TorF + JorP;
//						houseThing();
						firstClass();
						firstDuel();
						duel();
					}
//				public static void fillName() throws InterruptedException
//					{
//						JFrame frame = new JFrame();
//						ImageIcon icon = new ImageIcon(("potter.jpg"));
//						JOptionPane.showMessageDialog(frame,"Hello, I hope your ready to enter into the amazing world of Harry Potter.",
//							name, JOptionPane.QUESTION_MESSAGE,
//							icon);
//						JOptionPane.showMessageDialog(frame,"First of all you need to choose your Wizard's name so..."); 
//						name = JOptionPane.showInputDialog("What is your name?");
//						JOptionPane.showMessageDialog(frame, "Welcome, " + name);
//						wiz.setName(name);
//					}
//				public static void meetOlivander()  throws InterruptedException
//				{
//					JOptionPane.showMessageDialog(frame,"As you enter Diagon Ally you notice the giant crooked building ahead and all of the shops along the side.");					
//					JOptionPane.showMessageDialog(frame,"you think about everything you need to start your first year at hogwarts.");
//					JOptionPane.showMessageDialog(frame,"the first thing on that list is your wand.");
//					JOptionPane.showMessageDialog(frame,"You enter the store Olivanders and notice an old man standing on the other side of a desk.");					
//					JOptionPane.showMessageDialog(frame,"he says ah your here for your first wand well lets see it");					
//				}
//				public static void question1()   
//				{	
//					Object[] options = {"action and variety", "quiet time to think things over"};
//					answer = JOptionPane.showOptionDialog(frame,"what do you prefer?",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							e = e +1;
//						break;
//						}
//					case 1:
//						{
//							i = i +1;
//						break;
//						}
//					}	
//				}
//				public static void question2()
//				{
//					Object[] options ={"what is going on now", "the future and what might be"};
//					answer = JOptionPane.showOptionDialog(frame,"do you prefer to think about",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							s = s +1;
//						break;
//						}
//					case 1:
//						{
//							n = n +1;
//						break;
//						}
//					}
//				}
//				public static void question3()
//				{
//					Object[] options ={"on what is best, no matter how you feel", "by how you feel about something"};
//					answer = JOptionPane.showOptionDialog(frame,"do you prefer to decide",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							t = t +1;
//						break;
//						}
//					case 1:
//						{
//							f = f +1;
//						break;
//						}
//					}
//				}
//				public static void question4()
//				{
//					Object[] options ={"have a plan before getting started on something", "get going on something by just getting it"};
//					answer = JOptionPane.showOptionDialog(frame,"do you like to",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							j = j +1;
//						break;
//						}
//					case 1:
//						{
//							p = p +1;
//						break;
//						}
//					}
//				}
//				public static void question5()
//				{
//					Object[] options ={"act quickly without thinking", "rehearse what you say before you speak"};
//					answer = JOptionPane.showOptionDialog(frame,"do you like to",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							e = e +1;
//						break;
//						}
//					case 1:
//						{
//							i = i +1;
//						break;
//						}
//					}
//				}	
//				public static void question6()
//					{
//						Object[] options ={"sensible and realistic people", "imaginative and creative people"};
//						answer = JOptionPane.showOptionDialog(frame,"do you prefer your friends to be",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								s = s +1;
//							break;
//							}
//						case 1:
//							{
//								n = n +1;
//							break;
//							}
//						}
//					}
//				public static void question7()
//					{
//						Object[] options ={"easy to tell others how you feel and think", "or do you avoid hurting others feelings"};
//						answer = JOptionPane.showOptionDialog(frame,"do you find it",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								s = s +1;
//							break;
//							}
//						case 1:
//							{
//								n = n +1;
//							break;
//							}
//						}
//					}
//				public static void question8()
//				{
//					Object[] options ={"have times, dates, and places arranged in advance", "have no plans"};
//					answer = JOptionPane.showOptionDialog(frame,"if you were to plan a trip, would you prefer to",
//					"personality test",
//					JOptionPane.YES_NO_CANCEL_OPTION,
//					JOptionPane.QUESTION_MESSAGE,
//					null, options, options [1]);
//					switch(answer)
//					{
//					case 0:
//						{
//							j = j +1;
//						break;
//						}
//					case 1:
//						{
//							p = p +1;
//						break;
//						}
//					}
//				}
//				public static void question9()
//					{
//						Object[] options ={"know what others expect of you", "understand something before you do it"};
//						answer = JOptionPane.showOptionDialog(frame,"do you prefer to",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								e = e +1;
//							break;
//							}
//						case 1:
//							{
//								i = i +1;
//							break;
//							}
//						}
//					}
//				public static void question10()
//					{
//						Object[] options ={"in the usual way", "in a new and different way then others"};
//						answer = JOptionPane.showOptionDialog(frame,"do you like doing things",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								e = e +1;
//							break;
//							}
//						case 1:
//							{
//								i = i +1;
//							break;
//							}
//						}
//					}
//				public static void question11() throws InterruptedException
//					{
//						Object[] options ={"your head", "your heart"};
//						answer = JOptionPane.showOptionDialog(frame,"do you tend to think more with",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								t = t +1;
//							break;
//							}
//						case 1:
//							{
//								f =  +1;
//							break;
//							}
//						}
//						Thread.sleep(120);
//						JOptionPane.showMessageDialog(frame,"lets try this one olivander said handing you a wand");
//						Thread.sleep(120);
//						JOptionPane.showMessageDialog(frame,"you give it a little flick and...");
//						JOptionPane.showMessageDialog(frame,"hit (5) on the console to flick your wand");
//						int flick = userInput.nextInt();
//						if (flick==5)
//						{
//							Thread.sleep(1000);
//							System.out.println("        *    *");
//							System.out.println("*         '       *       .  *   '     .           * *");
//							System.out.println("                                                         '");
//							System.out.println(" *                *'          *          *        '");
//							System.out.println(".           *               |               /");
//							System.out.println("         '.         |    |      '       |   '     *");
//							System.out.println("           \\*        \\   \\             /");
//							System.out.println(" '          \\     '* |    |  *        |*                *  *");
//							System.out.println("      *      `.       \\   |     *     /    *      '");
//							System.out.println(".                  \\      |   \\          /               *");
//							System.out.println("*'  *     '      \\      \\   '.       |");
//							System.out.println("  -._            `                  /         *");
//							System.out.println("' '      ``._   *                           '          .      '");
//							System.out.println("*            *\\*          * .   .      *");
//							System.out.println("*  '        *    `-._                       .         _..:='        *");
//							System.out.println("       .  '      *       *    *   .       _.:--'");
//							System.out.println("    *           .     .     *         .-'         *");
//							System.out.println(".               '             . '   *           *         .");
//							System.out.println("*       ___.-=--..-._     *                '               '");
//							System.out.println("                            *       *");
//							System.out.println("          *        _.'  .'       `.        '  *             *");
//							System.out.println("*              *_.-'   .'            `.               *");
//							System.out.println("             .'                       `._             *  '");
//							System.out.println("'       '                        .       .  `.     .");
//							System.out.println(" .                      *                  `");
//							System.out.println("         *        '             '                          .");
//							System.out.println(".                          *        .           *  *");
//							System.out.println("       *        .                                    '");
//						}
//						else 
//						{
//							Thread.sleep(1000);
//							System.out.println("        *    *");
//							System.out.println("*         '       *       .  *   '     .           * *");
//							System.out.println("                                                         '");
//							System.out.println(" *                *'          *          *        '");
//							System.out.println(".           *               |               /");
//							System.out.println("         '.         |    |      '       |   '     *");
//							System.out.println("           \\*        \\   \\             /");
//							System.out.println(" '          \\     '* |    |  *        |*                *  *");
//							System.out.println("      *      `.       \\   |     *     /    *      '");
//							System.out.println(".                  \\      |   \\          /               *");
//							System.out.println("*'  *     '      \\      \\   '.       |");
//							System.out.println("  -._            `                  /         *");
//							System.out.println("' '      ``._   *                           '          .      '");
//							System.out.println("*           *\\*          * .   .      *");
//							System.out.println("*  '        *    `-._                       .         _..:='        *");
//							System.out.println("       .  '      *       *    *   .       _.:--'");
//							System.out.println("    *           .     .     *         .-'         *");
//							System.out.println(".               '             . '   *           *         .");
//							System.out.println("*       ___.-=--..-._     *                '               '");
//							System.out.println("                            *       *");
//							System.out.println("          *        _.'  .'       `.        '  *             *");
//							System.out.println("*              *_.-'   .'            `.               *");
//							System.out.println("             .'                       `._             *  '");
//							System.out.println("'       '                        .       .  `.     .");
//							System.out.println(" .                      *                  `");
//							System.out.println("         *        '             '                          .");
//							System.out.println(".                          *        .           *  *");
//							System.out.println("       *        .                                    '");	
//						}
//						
//						JOptionPane.showMessageDialog(frame,"oh no that wont do olivander said.");
//						JOptionPane.showMessageDialog(frame,"shall we continue");
//					}
//				public static void question12()
//					{
//						Object[] options ={"make a decisions quickly", "put off making a decision"};
//						answer = JOptionPane.showOptionDialog(frame,"do you prefer to",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								p = p +1;
//							break;
//							}
//						case 1:
//							{
//								j = j +1;
//							break;
//							}
//						}
//					}
//				public static void question13()
//					{
//						Object[] options ={"best when you're with more then a few people", "or do you often feel lost in the crowd"};
//						answer = JOptionPane.showOptionDialog(frame,"do you feel",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								p = p +1;
//							break;
//							}
//						case 1:
//							{
//								j = j +1;
//							break;
//							}
//						}
//					}
//				public static void question14()
//					{
//						Object[] options ={"how other people are useful", "how other people see"};
//						answer = JOptionPane.showOptionDialog(frame,"is it easier for you to see",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								n = n +1;
//							break;
//							}
//						case 1:
//							{
//								s = s +1;
//							break;
//							}
//						}
//					}
//				public static void question15()
//					{
//						Object[] options ={"firm", "gentle"};
//						answer = JOptionPane.showOptionDialog(frame,"are you more",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								t = t +1;
//							break;
//							}
//						case 1:
//							{
//								f = f +1;
//							break;
//							}
//						}
//					}
//				public static void question16()
//					{
//						Object[] options ={"Like things neat and orderly", "or, do you not care enough to clean"};
//						answer = JOptionPane.showOptionDialog(frame,"do you",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								j = j +1;
//							break;
//							}
//						case 1:
//							{
//								p = p +1;
//							break;
//							}
//						}
//					}
//				public static void question17()
//					{
//						Object[] options ={"many friends", "or a small group of close friends"};
//						answer = JOptionPane.showOptionDialog(frame,"do you prefer to have",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								e = e +1;
//							break;
//							}
//						case 1:
//							{
//								i = i +1;
//							break;
//							}
//						}
//					}
//				public static void question18()
//					{
//						Object[] options ={"there's a person with good common sense", "there's a person with imagination"};
//						answer = JOptionPane.showOptionDialog(frame,"Which is more of a compliment too you",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								s = s +1;
//							break;
//							}
//						case 1:
//							{
//								n = n +1;
//							break;
//							}
//						}
//					}
//				public static void question19()
//					{
//						Object[] options ={"find it usually doesn't bother you when others don't get along", "get upset when others don't get along"};
//						answer = JOptionPane.showOptionDialog(frame,"Do you",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								t = t +1;
//							break;
//							}
//						case 1:
//							{
//								f = f +1;
//							break;
//							}
//						}
//					}
//				public static void question20()
//					{
//						Object[] options ={"finish one thing before you start another", "have many projects going on at the same time"};
//						answer = JOptionPane.showOptionDialog(frame,"Do you prefer to",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								j = j +1;
//							break;
//							}
//						case 1:
//							{
//								p = p +1;
//							break;
//							}
//						}
//					}
//				public static void question21()
//					{
//						Object[] options ={"in a group", "alone"};
//						answer = JOptionPane.showOptionDialog(frame,"Do you prefer to work",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								e = e +1;
//							break;
//							}
//						case 1:
//							{
//								i = i +1;
//							break;
//							}
//						}
//					}
//				public static void question22()
//					{
//						Object[] options ={"easy", "difficult"};
//						answer = JOptionPane.showOptionDialog(frame,"Do you find it ______ to remember facts and figures?",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								s = s +1;
//							break;
//							}
//						case 1:
//							{
//								n = n +1;
//							break;
//							}
//						}
//					}
//				public static void question23()
//					{
//						Object[] options ={"sympathetic", "fair minded"};
//						answer = JOptionPane.showOptionDialog(frame,"are you more",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								f = f +1;
//							break;
//							}
//						case 1:
//							{
//								t = t +1;
//							break;
//							}
//						}
//					}
//				public static void question24()
//					{
//						Object[] options ={"to have some things planned", "to do whatever comes up"};
//						answer = JOptionPane.showOptionDialog(frame,"on weekends, do you prefer",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								j = j +1;
//							break;
//							}
//						case 1:
//							{
//								p = p +1;
//							break;
//							}
//						}
//					}
//				public static void question25()
//					{
//						Object[] options ={"begin conversation with them", "or wait for them to approach you"};
//						answer = JOptionPane.showOptionDialog(frame,"When you're with others you don't know very well, are you more likely to",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								e = e +1;
//							break;
//							}
//						case 1:
//							{
//								i = i +1;
//							break;
//							}
//						}
//					}
//				public static void question26()
//					{
//						Object[] options ={"what is", "what could be"};
//						answer = JOptionPane.showOptionDialog(frame,"are you interested in",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								s = s +1;
//							break;
//							}
//						case 1:
//							{
//								n = n +1;
//							break;
//							}
//						}
//					}
//				public static void question27()
//					{
//						Object[] options ={"cool headed", "warm headed"};
//						answer = JOptionPane.showOptionDialog(frame,"are you more often",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								t = t +1;
//							break;
//							}
//						case 1:
//							{
//								f = f +1;
//							break;
//							}
//						}
//					}
//				public static void question28()
//					{
//						Object[] options ={"there is a very logical person", "there is a very sentimental person"};
//						answer = JOptionPane.showOptionDialog(frame,"which is more of a compliment to you",
//						"personality test",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						null, options, options [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								j = j +1;
//							break;
//							}
//						case 1:
//							{
//								p = p +1;
//							break;
//							}
//						}
//					}
//				public static void getWood()  
//				{
//					if (e%i==1)
//						{
//							wd.setWood(wd.getWood() + "vine");
//						}
//					else if (e%i==2)
//						{
//							wd.setWood(wd.getWood() + "cedar");
//						}
//					else if (e%i==3)
//						{
//							wd.setWood(wd.getWood() + "cherry");
//						}
//					else if (e%i==4)
//						{
//							wd.setWood(wd.getWood() + "ash");
//						}
//					else
//						{
//							wd.setWood(wd.getWood() + "willow");
//						}
//				}
//				public static void getCore()
//				{
//					if(s%n==1)
//						{
//							wd.setCore(wd.getCore() + "Unicorn Hair core");
//						}
//					else if(s%n==2)
//						{
//							wd.setCore(wd.getCore() + "Dragon Heartstring core");
//						}
//					else if(s%n==3)
//						{
//							wd.setCore(wd.getCore() + "Phoenix Feather core");
//						}
//					else if(s%n==4) 
//						{
//							wd.setCore(wd.getCore() + "dragon Heartstring core");
//						}
//					else 
//						{
//							wd.setCore(wd.getCore() + "Unicorn Hair core");
//						}
//				}
//				public static void getLength()
//				{
//					if(t%f==1)
//						{
//							wd.setSize(wd.getSize() + 11);
//						}
//					else if(t%f==2)
//						{
//							wd.setSize(wd.getSize() + 13);
//						}
//					else if(t%f==3)
//						{
//							wd.setSize(wd.getSize() + 9);
//						}
//					else if(t%f==4)
//						{
//							wd.setSize(wd.getSize() + 10);
//						}
//					else 
//						{
//							wd.setSize(wd.getSize() + 12);
//						}
//				}
//				public static void getFlexability()
//				{
//					if (j%p==1)
//						{
//							wd.setStability(wd.getStability() + "Surprisingly Swishy");
//						}
//					else if(j%p==2)
//						{
//							wd.setStability(wd.getStability() + "Slightly Yielding");
//						}
//					else if(j%p==3)
//						{
//							wd.setStability(wd.getStability() + "Quite flexible");
//						}
//					else if(j%p==4)
//						{
//							wd.setStability(wd.getStability() + "Unyielding");
//						}
//					else
//						{
//							wd.setStability(wd.getStability() + "stiff");
//						}
//				}
//				public static void buyWand() throws InterruptedException
//				{
//					wiz.setWand(wd);
//					JOptionPane.showMessageDialog(frame,"ah I think I've got it, Olivander said");
//					JOptionPane.showMessageDialog(frame,"he hands you another wand");
//					JOptionPane.showMessageDialog(frame,"as you grab the wand the air around you glows a faint yellow.");
//					JOptionPane.showMessageDialog(frame,"I knew that was the one, its made of " + wd.getWood() + " with a " + wd.getCore() + ", " + wd.getSize() + "inches, " + wd.getStability());	
//					Thread.sleep(1000);
//				}
//				public static void lookForBook() throws InterruptedException
//				{
//					JOptionPane.showMessageDialog(frame,"now that you have your wand you should head over to Flourish and blotts and get your first spell Book. ");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"you enter the building titled Flourish and blotts");
//					JOptionPane.showMessageDialog(frame,"another first year? a women said standing behind a desk at the back of the shop.");
//					Thread.sleep(950);
//					JOptionPane.showMessageDialog(frame,"well it looks like you need your standered school books.");
//					Thread.sleep(950);
//					JOptionPane.showMessageDialog(frame,"the lady walks over to you with a giant stack of books.");
//					JOptionPane.showMessageDialog(frame,"you notice the first book on the top of the stack it says Standered Book of Spells. Grade 1.");
//					sb.setName(sb.getName() + "Standered book of spells. Grade 1");
//				}	
//				public static void hogwartsExpress() throws InterruptedException
//				{
//					JOptionPane.showMessageDialog(frame,"you arrive at platform nine and three quarters.");
//					JOptionPane.showMessageDialog(frame,"you load all of the stuff in the train except your new wand and your spell book");
//					JOptionPane.showMessageDialog(frame,"as you sit in your cart eating candy off the trolley your read Standered book of spells grade one");
//					JOptionPane.showMessageDialog(frame,"the first spell you see is the incendio charm");
//					Thread.sleep(950);
//					JOptionPane.showMessageDialog(frame,"listed next to the charm is a description of how it works");
//					Thread.sleep(950);
//					JOptionPane.showMessageDialog(frame,"Incendio is a charm and a form of Conjuration that can be used to conjure a jet of orange and red flames, therefore setting things on fire.");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"listed below is the motion you need to make with your wand in order to cast this spell.");
//					JOptionPane.showMessageDialog(frame,"(1), (2), (3), (5)");		
//					spells.add(new spell("Incendio","1235",5,1 ));
//				}
//				public static void squidEncounter() throws InterruptedException
//				{
//					JOptionPane.showMessageDialog(frame,"as you step out of the train you see a big man with a lantern yelling");
//					JOptionPane.showMessageDialog(frame,"first years! first years! over here.");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"you make your way to the giant man who introduced himself as Hagrid.");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"he escorts you to a small fleet of boats docked by the lake.");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"you get in and make your way across the lake...");
//					JOptionPane.showMessageDialog(frame,"about half way across the lake there was a huge roar.");
//					JOptionPane.showMessageDialog(frame,"the sound of kids screaming and water splashing was about all you made sense of.");
//					JOptionPane.showMessageDialog(frame,"on instinct however you took out your wand.");
//					JOptionPane.showMessageDialog(frame,"as you did you saw the giant tentacle of a giant squid.");
//					Thread.sleep(1000);
//					spell = JOptionPane.showInputDialog("please type the combination of which spell you would like to cast");
//					if (spell.equals("1235"))
//						{
//							JOptionPane.showMessageDialog(frame,"Incendio!");
//						}
//					else 
//						{
//							JOptionPane.showMessageDialog(frame,"thats not a spell you died. go to last check point");
//							squidEncounter();
//						}
//					JOptionPane.showMessageDialog(frame,"you hit the squids tentacle and it burst into flames he quickly submerged and roared away");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"aya good job " + wiz.getName() + " Hagrid said");
//					JOptionPane.showMessageDialog(frame,"well shall we continue");
//					JOptionPane.showMessageDialog(frame,"you continue to make your way to the Castle");
//				}
//				public static void hogwarts() throws InterruptedException
//				{
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,"your stopped in front of the entrance to the Great Hall by a professor");
//					JOptionPane.showMessageDialog(frame,"Hello, I am professor Tomis");
//					JOptionPane.showMessageDialog(frame,"very soon now you will be put into one of the four houses.");
//					JOptionPane.showMessageDialog(frame,"oh thats our cue. follow me");
//					Thread.sleep(2000);
//					JOptionPane.showMessageDialog(frame,"your small group of first years stands in front of all the professors waiting for there name to be called");
//					JOptionPane.showMessageDialog(frame,"Sara!");
//					Thread.sleep(2000);
//					JOptionPane.showMessageDialog(frame,"Hufflepuff!");
//					Thread.sleep(500);
//					JOptionPane.showMessageDialog(frame,"Robert!");
//					Thread.sleep(2000);
//					JOptionPane.showMessageDialog(frame,"Gryffindor!");
//					Thread.sleep(500);
//					JOptionPane.showMessageDialog(frame,"Austin!");
//					JOptionPane.showMessageDialog(frame,"Slytherin!");
//					Thread.sleep(1000);
//					JOptionPane.showMessageDialog(frame,wiz.getName() + "!");
//					JOptionPane.showMessageDialog(frame,"you walk up, sit on the stool, and put the beat up hat on your head");
//				}
//				public static void ble()
//				{
//					if (e>i)
//						{
//							Integer.toString(e);
//							EorI = "e";
//						}	
//					else
//						{
//							Integer.toString(i);
//							EorI = "i";
//						}					
//				}
//				public static void bwa()
//					{
//						if (s>n)
//							{
//								Integer.toString(s);
//								NorS = "s";
//							}	
//						else
//							{
//								Integer.toString(n);
//								NorS = "n";
//							}				
//					}
//				public static void bleBle()
//					{
//						if (t>f)
//							{
//								Integer.toString(t);
//								TorF = "t";
//							}	
//						else
//							{
//								Integer.toString(f);
//								TorF = "f";
//							}					
//					}
//					public static void bwaBwa()
//						{
//							if (p>j)
//								{
//									Integer.toString(p);
//									JorP = "p";
//								}	
//							else
//								{
//									Integer.toString(j);
//									JorP = "j";
//								}	
//						}
//					public static void houseThing()
//					{
//						ImageIcon icon1 = new ImageIcon(("Gryffindorcrest.jpg"));
//						ImageIcon icon2 = new ImageIcon(("Hufflepuffhousecrest2.jpg"));
//						ImageIcon icon3 = new ImageIcon(("Ravenclaw house crest.jpg"));
//						ImageIcon icon4 = new ImageIcon(("slytherincrest.jpg"));
//						ImageIcon icon5 = new ImageIcon(("Hogwarts houses.jpg"));
//						if (temp.equals("istj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Ravenclaw!",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon3);
//								wiz.setHouse(wiz.getHouse() + "Ravenclaw");
//							}
//						else if (temp.equals("isfj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Hufflepuff!",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon2);
//								wiz.setHouse(wiz.getHouse() + "Hufflepuff");
//							}
//						else if (temp.equals("infj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Gryffindor!",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon1);
//								wiz.setHouse(wiz.getHouse() + "Gryffindor");
//							}
//						else if (temp.equals("intj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Slytherin!",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon4);
//								wiz.setHouse(wiz.getHouse() + "Slytherin");
//							}
//						else if (temp.equals("istp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Ravenclaw",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon3);
//								wiz.setHouse(wiz.getHouse() + "Ravenclaw");
//							}
//						else if (temp.equals("isfp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Hufflepuff",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon2);
//								wiz.setHouse(wiz.getHouse() + "Hufflepuff");
//							}
//						else if (temp.equals("infp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Gryffindor",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon1);
//								wiz.setHouse(wiz.getHouse() + "Gryffindor");
//							}
//						else if (temp.equals("intp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Slytherin",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon4);
//								wiz.setHouse(wiz.getHouse() + "Slytherin");
//							}
//						else if (temp.equals("estp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Ravenclaw",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon3);
//								wiz.setHouse(wiz.getHouse() + "Ravenclaw");
//							}
//						else if (temp.equals("esfp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Hufflepuff",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon2);
//								wiz.setHouse(wiz.getHouse() + "Hufflepuff");
//							}
//						else if (temp.equals("enfp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Slytherin",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon4);
//								wiz.setHouse(wiz.getHouse() + "Slytherin");
//							}
//						else if (temp.equals("entp"))
//							{
//								JOptionPane.showMessageDialog(frame,"Gryffindor",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon1);
//								wiz.setHouse(wiz.getHouse() + "Gryffindor");
//							}
//						else if (temp.equals("estj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Ravenclaw",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon3);
//								wiz.setHouse(wiz.getHouse() + "Ravenclaw");
//							}
//						else if (temp.equals("esfj"))
//							{
//								
//								JOptionPane.showMessageDialog(frame,"Hufflepuff",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon2);
//								wiz.setHouse(wiz.getHouse() + "Hufflepuff");
//							}
//						else if (temp.equals("enfj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Gryffindor",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon1);
//								wiz.setHouse(wiz.getHouse() + "Gryffindor");
//							}
//						else if (temp.equals("entj"))
//							{
//								JOptionPane.showMessageDialog(frame,"Slytherin",
//										name, JOptionPane.QUESTION_MESSAGE,
//										icon4);
//								wiz.setHouse(wiz.getHouse() + "Slytherin");
//							}
//						Object[] choices ={"new house", "house chosen"};
//						answer = JOptionPane.showOptionDialog(frame,"However the Hat also takes into account you choice would you like to be in the House chosen or would you like to choose a different House",
//						"house",
//						JOptionPane.YES_NO_CANCEL_OPTION,
//						JOptionPane.QUESTION_MESSAGE,
//						icon5, choices, choices [1]);
//						switch(answer)
//						{
//						case 0:
//							{
//								Object[] houseChoices ={"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"};
//								answer = JOptionPane.showOptionDialog(frame,"which do you want to be",
//								"house",
//								JOptionPane.YES_NO_CANCEL_OPTION,
//								JOptionPane.QUESTION_MESSAGE,
//								icon5, houseChoices, houseChoices [0]);
//								switch(answer)
//								{
//									case 0:
//											{
//												JOptionPane.showMessageDialog(frame,"the hat screems. Gryffindor!!!",
//												name, JOptionPane.QUESTION_MESSAGE,
//												icon1);
//												wiz.setHouse(wiz.getHouse() + "Gryffindor");
//												break;
//											}
//									case 1:
//											{
//												JOptionPane.showMessageDialog(frame,"the hat screems. Hufflepuff!!!",
//												name, JOptionPane.QUESTION_MESSAGE,
//												icon2);
//												wiz.setHouse(wiz.getHouse() + "Hufflepuff");
//												break;
//											}
//									case 2:
//											{
//												JOptionPane.showMessageDialog(frame,"the hat screems. Ravenclaw!!!",
//												name, JOptionPane.QUESTION_MESSAGE,
//												icon3);
//												wiz.setHouse(wiz.getHouse() + "Ravenclaw");
//												break;
//											}
//									case 3:
//											{
//												JOptionPane.showMessageDialog(frame,"the hat screems. Slytherin!!!",
//												name, JOptionPane.QUESTION_MESSAGE,
//												icon4);
//												wiz.setHouse(wiz.getHouse() + "Slytherin");
//												break;
//											}
//								}
//							break;
//							}
//						case 1:
//							{
//								JOptionPane.showMessageDialog(frame,"the hat screems. " + wiz.getHouse() + "!!!");	
//							break;
//							}
//						}
//					}
					public static void firstClass()
						{
							JOptionPane.showMessageDialog(frame,"the next day you look at your first class");	
							JOptionPane.showMessageDialog(frame,"double Defence against the Dark arts");
							JOptionPane.showMessageDialog(frame,"the teacher, proffesor Tomis, tells you to open your book to pg 10");
							JOptionPane.showMessageDialog(frame,"the page is titled basic defensive spells");
							JOptionPane.showMessageDialog(frame,"the first spell under it is called Aguamenti");
							JOptionPane.showMessageDialog(frame,"under nieth the name of it is a brief explanation of what it does");
							JOptionPane.showMessageDialog(frame,"Aguamenti is a charm and a form of Conjuration that can be used to conjure a stream of water that shoots from the users wand, it is mostly used to counter Incendio.");
							JOptionPane.showMessageDialog(frame,"Proffesor Tomis tells the class what motion you should make with your wand in order to cast the spell");
							JOptionPane.showMessageDialog(frame,"(1)(1)(6)(7)(g)(m)(n)(t)");
							spells.add(new spell("Aguamenti", "1167gmnt", 0, 1));
							spells.add(new spell("Stupify", "23999stpfy9", 0, 2));
							spells.add(new spell("Protago", "5313579prtg0", 0, 3));
							spells.add(new spell("Ennervate", "331119nnrvt", 0, 2));
							JOptionPane.showMessageDialog(frame,"Proffesor Tomis then tells the class how much harder defensive spells are compared to attacking spells");
							JOptionPane.showMessageDialog(frame,"you really must memorize the combanation and wand movments.");
						}
					public static void firstDuel()
					{
						JOptionPane.showMessageDialog(frame,"we shall practice using the Incendio charm and the Aguamenti charm against each other");
						JOptionPane.showMessageDialog(frame,"pare up with someone and begin to duel.");
						JOptionPane.showMessageDialog(frame,"you pair up with a girl who has bushy red hair and slightly big teeth she introduced her self as Rose Weasly and she is from the house Gryffindor");
						JOptionPane.showMessageDialog(frame,"you both stare at each other from oposite sides of the room slightly bow then flick your wands to the side.");
						rz.setLevel(rz.getLevel()+1);
						rz.setHealth(rz.getHealth()+20);
						wiz.setHealth(wiz.getHealth() + 25);
					}
					public static void duel()
					{
						boolean playerTurn = false;;
						ImageIcon icon6 = new ImageIcon(("fireball.jpg"));
						ImageIcon icon7 = new ImageIcon(("waterstream.jpg"));
						ImageIcon icon8 = new ImageIcon(("firewater.jpg"));
						ImageIcon icon9 = new ImageIcon(("fireballexplosion.jpg"));
						ImageIcon icon10 = new ImageIcon(("stupify.jpg"));
						ImageIcon icon11 = new ImageIcon(("protago.jpg"));
						ImageIcon icon12 = new ImageIcon(("Ennervate.jpg"));
						ImageIcon icon13 = new ImageIcon(("wandlock.gif"));
						for(spell s : spells)
							{
								System.out.println(s.getName() + " " + s.getCombo());
							}
						while(rz.getHealth()>=0 || wiz.getHealth()>=0)
							{
							boolean duel = true;
							while(duel)
								{				
								if(playerTurn)
									{
										JOptionPane.showMessageDialog(frame, "now its your turn to cast a spell.");
										spell = JOptionPane.showInputDialog("please type the combination of which spell you would like to cast int the box below");
										if(spell.equals("1235"))
											{
												JOptionPane.showMessageDialog(frame, "Incendio!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon6);
												JOptionPane.showMessageDialog(frame, "you shoot the fire spell at Rose");
												int attack = (int)(Math.random() * 6) + 1;
												int defence = (int) (Math.random() * 2) + 2;
												if (attack>defence)
													{
														rz.setHealth(rz.getHealth()-attack);
														JOptionPane.showMessageDialog(frame, "Aguamen...");
														JOptionPane.showMessageDialog(frame, "the spell hit Rose streat in the chest before she could cast the counter Charm");
														JOptionPane.showMessageDialog(frame, "you did " + attack + " damage, she now has " + rz.getHealth() + " health");
													}
												else 
													{
														JOptionPane.showMessageDialog(frame, "Aguamenti",
																name, JOptionPane.QUESTION_MESSAGE,
																icon8);
														JOptionPane.showMessageDialog(frame, "the spell was doused by the counter charm Aguamenti");
													}
												playerTurn = false;
											}
										else if(spell.equals("1167gmnt"))
											{
												JOptionPane.showMessageDialog(frame, "Aguamenti!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon7);
												JOptionPane.showMessageDialog(frame, "you shoot some water at Rose");
												JOptionPane.showMessageDialog(frame, "your spell has no effect");
												playerTurn = false;
											}
										else if (spell.equals("23999stpfy9"))
											{
												int stAttack = (int)(Math.random() * 8) + 5;
												int stDefence = (int) (Math.random() * 8) + 4;
												int counterChance = (int) (Math.random() * 8) + 4;
												JOptionPane.showMessageDialog(frame, "Stupify!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon10);
												playerTurn = false;
												if (counterChance>stAttack)
													{
														JOptionPane.showMessageDialog(frame, "Protago!!!",
																name, JOptionPane.QUESTION_MESSAGE,
																icon11);
														spell=JOptionPane.showInputDialog(frame, "Rose countered your spell and it comes heraling back at you");
														int ndAttack = (int)(Math.random() * 9) + 1;
														int ndDefence = (int) (Math.random() * 8) + 4;
														int ndCounterChance = (int) (Math.random() * 8) + 5;
														if(spell.equals("5313579prtg0"))
															{
																if(ndCounterChance>ndAttack)
																	{
																		JOptionPane.showMessageDialog(frame, "Protago!!!",
																		name, JOptionPane.QUESTION_MESSAGE,
																		icon11);
																		JOptionPane.showMessageDialog(frame, "the spell goes flying of in another direction");
																	}
																else if (ndCounterChance<ndAttack)
																	{
																		JOptionPane.showMessageDialog(frame, "Protag...!!!",
																				name, JOptionPane.QUESTION_MESSAGE,
																				icon12);
																		JOptionPane.showMessageDialog(frame, "The redirected spell blast through your weekend defensive Charm");
																		JOptionPane.showMessageDialog(frame, "you had " + wiz.getHealth() + " Health");
																		wiz.setHealth(wiz.getHealth()-ndAttack+ndDefence);
																		JOptionPane.showMessageDialog(frame, "now you have " + wiz.getHealth() + " Health");
																	}
															}
														else if (spell.equals("331119nnrvt"))
																	{
																		JOptionPane.showMessageDialog(frame, "Ennervate!!",
																				name, JOptionPane.QUESTION_MESSAGE,
																				icon12);
																		JOptionPane.showMessageDialog(frame, "the spells colide in mid air");
																		JOptionPane.showMessageDialog(frame, "when the dust settles both of you are still standing");
																	}
														else if (spell.equals("23999stpfy9"))
															{
																JOptionPane.showMessageDialog(frame, "Stupify!!",
																		name, JOptionPane.QUESTION_MESSAGE,
																		icon13);
																JOptionPane.showMessageDialog(frame, "the Identicale spells colide then expload in mid air");
																JOptionPane.showMessageDialog(frame, "when the dust settles both of you are still standing");
															}
														else 
															{
																JOptionPane.showMessageDialog(frame, "The redirected spell blast you right in the face");
																JOptionPane.showMessageDialog(frame, "you had " + wiz.getHealth() + " Health");
																wiz.setHealth(wiz.getHealth()-ndAttack);
																JOptionPane.showMessageDialog(frame, "now you have " + wiz.getHealth() + " Health");
															}
											
													}
												else if (stDefence>stAttack)
													{
														JOptionPane.showMessageDialog(frame, "Ennervate!!!",
																name, JOptionPane.QUESTION_MESSAGE,
																icon12);
														JOptionPane.showMessageDialog(frame, "the spells colide in mid air");
														JOptionPane.showMessageDialog(frame, "when the dust settles both of you are still standing");
													}
												else
													{
														JOptionPane.showMessageDialog(frame, "Rose failed to block the powerfull spell");
														JOptionPane.showMessageDialog(frame, "you did " + stAttack + " damage");
														rz.setHealth(rz.getHealth()-stAttack);
														JOptionPane.showMessageDialog(frame, "She now has " + rz.getHealth() + " Health");
													}
												playerTurn = false;
												
												
											}
										else 						
											{
												JOptionPane.showMessageDialog(frame, "that spell has no effect right now");
												playerTurn = false;
											}					
									}
								else 
									{
										JOptionPane.showMessageDialog(frame, "oppenents turn");
										JOptionPane.showMessageDialog(frame, "Incendio!!",
												name, JOptionPane.QUESTION_MESSAGE,
												icon6);
										JOptionPane.showMessageDialog(frame, "a giant fire ball is flying at you what do you do");
										spell = JOptionPane.showInputDialog("please type the combination of which spell you would like to cast int the box below");
										if (spell.equals("1167gmnt"))
											{
												JOptionPane.showMessageDialog(frame, "Aguamenti!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon7);
												int opattack = (int) (Math.random() * 6) + 1;
												int block = (int) (Math.random() * 5) + 3;
												if (block>opattack)
													{
														JOptionPane.showMessageDialog(frame, "your spell douces her flames in mid air.",
																name, JOptionPane.QUESTION_MESSAGE,
																icon8);
													}
												else
													{
														JOptionPane.showMessageDialog(frame, "you had " + wiz.getHealth() + " Health");
														wiz.setHealth(wiz.getHealth()-opattack);
														JOptionPane.showMessageDialog(frame, "now you have " + wiz.getHealth() + " Health");
														
													}
												playerTurn = true;								
											}
										else if (spell.equals("1235"))
											{
												JOptionPane.showMessageDialog(frame, "Incendio!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon6);
												JOptionPane.showMessageDialog(frame, "your spell hits hers in mid air and flames go everywere, some even hit you.",
														name, JOptionPane.QUESTION_MESSAGE,
														icon9);
												int block = (int) (Math.random() * 3) + 1;
												int opattack = (int) (Math.random() * 6) + 1 - block;
												JOptionPane.showMessageDialog(frame, "you had " + wiz.getHealth() + " Health");
												wiz.setHealth(wiz.getHealth()-opattack);
												JOptionPane.showMessageDialog(frame, "now you have " + wiz.getHealth() + " Health");												
												playerTurn = true;
											}
										else if(spell.equals("5313579prtg0"))
											{
												JOptionPane.showMessageDialog(frame, "Protago!!!",
														name, JOptionPane.QUESTION_MESSAGE,
														icon12);
												JOptionPane.showMessageDialog(frame, "The fire spell is absorbed in your shield and no damage is done to you");
											}
										else 
											{											
												JOptionPane.showMessageDialog(frame, "uuu...");
												int opattack = (int) (Math.random() * 6) + 1;
												JOptionPane.showMessageDialog(frame, "you had " + wiz.getHealth() + " Health");
												wiz.setHealth(wiz.getHealth()-opattack);
												JOptionPane.showMessageDialog(frame, "now you have " + wiz.getHealth() + " Health");
												playerTurn = true;
											}
									}
								if (rz.getHealth()<=0)
									{
										duel = false;
										JOptionPane.showMessageDialog(frame, "you win");
										System.exit(0);
									}
								if(wiz.getHealth()<=0)
									{
										duel = false;
										JOptionPane.showMessageDialog(frame, "you loose");
										System.exit(0);
									}
								}
							}
					}
			}

