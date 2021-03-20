import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class openingUrl
{
    public static void main(String[] args) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        //d.browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));

        Scanner scan = new Scanner(System.in);

        mainOptions();
        int mainSelection = scan.nextInt();

        while (mainSelection != -1)
        {
            if(mainSelection == 1)
            {
                categoryMath();
                int secondaryOption = scan.nextInt();
                while(secondaryOption != -1)
                {
                    if(secondaryOption == 1)
                    {
                        d.browse(new URI("https://tutorial.math.lamar.edu/problems/alg/alg.aspx"));
                        categoryMath();

                    }
                    else if(secondaryOption == 2)
                    {
                        d.browse(new URI("https://tutorial.math.lamar.edu/problems/calci/calci.aspx"));
                        categoryMath();

                    }
                    else if(secondaryOption == 3)
                    {
                        d.browse(new URI("https://tutorial.math.lamar.edu/problems/calcii/calcii.aspx"));
                        categoryMath();

                    }
                    else if(secondaryOption == 4)
                    {
                        d.browse(new URI("https://tutorial.math.lamar.edu/problems/calciii/calciii.aspx"));
                        categoryMath();
                    }
                    else
                    {
                        System.out.println("Please enter a valid response");
                        categoryMath();
                    }

                    secondaryOption = scan.nextInt();

                }
                mainOptions();
            }
            else if(mainSelection == 2)
            {
                categoryPhysics();
                int secondaryOption = scan.nextInt();
                while(secondaryOption != -1)
                {
                    if(secondaryOption == 1)
                    {
                        d.browse(new URI("https://www.physicsclassroom.com/calcpad/problems"));
                        categoryPhysics();

                    }
                    else if(secondaryOption == 2)
                    {
                        d.browse(new URI("https://www.uwgb.edu/fenclh/problems/electricity-magnetism/"));
                        categoryPhysics();

                    }

                    else
                    {
                        System.out.println("Please enter a valid response");
                        categoryPhysics();
                    }

                    secondaryOption = scan.nextInt();

                }
                mainOptions();
            }
            else if(mainSelection == 3)
            {
                categoryPuzzles();
                int secondaryOption = scan.nextInt();
                while(secondaryOption != -1)
                {
                    if(secondaryOption == 1)
                    {
                        d.browse(new URI("https://cryptograms.puzzlebaron.com/play.php?session=1611001719"));
                        categoryPuzzles();

                    }
                    else if(secondaryOption == 2)
                    {
                        d.browse(new URI("https://www.transglobalexpress.co.uk/social/world-general-knowledge-quiz-2016/#R6598806-697BE21e"));
                        categoryPuzzles();

                    }
                    else if(secondaryOption == 3)
                    {
                        d.browse(new URI("https://sudoku.com/"));
                        categoryPuzzles();

                    }
					else if (secondaryOption == 4) {
						
						d.browse(new URI("https://www.boatloadpuzzles.com/playcrossword"));
						categoryPuzzles();
					}
                    else
                    {
                        System.out.println("Please enter a valid response");
                        categoryPuzzles();
                    }

                    secondaryOption = scan.nextInt();

                }
                mainOptions();

            }
			else if(mainSelection == 4) {
				categoryCoding();
				int secondaryOption = scan.nextInt();
				while (secondaryOption != -1) {
					if (secondaryOption == 1) {
						
						d.browse(new URI("https://code-exercises.com/"));
						categoryCoding();
					}
					else if (secondaryOption == 2) {
						
						d.browse(new URI("https://edabit.com/challenges/csharp"));
						categoryCoding();
					}
					else if (secondaryOption == 3) {
						
						d.browse(new URI("https://codingbat.com/python"));
						categoryCoding();
					}
					else {
						System.out.println("Please enter a valid response");
						categoryCoding();
					}
					
					secondaryOption = scan.nextInt();
				
				}
				mainOptions();
				
				
			}
            else
            {
                System.out.println("Please enter a valid response");
            }

            mainSelection = scan.nextInt();
        }
    }

    public static void mainOptions()
    {
        System.out.println("Welcome to REDACTED!");
        System.out.println();
        System.out.println("In what area do you want to jog your memory today? Enter -1 to quit");
        System.out.println("\t1. Mathematics");
        System.out.println("\t2. Physics");
        System.out.println("\t3. Puzzles");
		System.out.println("\t4. Coding");
    }

    public static void categoryMath()
    {
        System.out.println("What Mathematics topic do you want to try out? Enter -1 to quit");
        System.out.println("\t1. Algebra");
        System.out.println("\t2. Calculus I");
        System.out.println("\t3. Calculus II");
        System.out.println("\t4. Calculus III");

    }

    public static void categoryPhysics()
    {
        System.out.println("What Physics topic do you want to try out? Enter -1 to quit");
        System.out.println("\t1. Mechanics");
        System.out.println("\t2. Electricity and Magnetism");

    }

    public static void categoryPuzzles()
    {
        System.out.println("What Puzzle do you want to try out? Enter -1 to quit");
        System.out.println("\t1. Cryptography");
        System.out.println("\t2. General Knowledge");
        System.out.println("\t3. Sudoku");
		System.out.println("\t4. Crossword Puzzle");
    }
	
	public static void categoryCoding() {
		System.out.println("What Coding Langauge would you like to Pratice? Enter -1 to quit");
		System.out.println("\t1. Java");
		System.out.println("\t2. C#");
		System.out.println("\t3. Python");
		
		
		
	}
}
