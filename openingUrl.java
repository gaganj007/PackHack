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
            }
            else if(mainSelection == 2)
            {
                categoryPhysics();
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
                    else
                    {
                        System.out.println("Please enter a valid response");
                        categoryPuzzles();
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
    }

    public static void categoryMath()
    {

    }

    public static void categoryPhysics()
    {

    }

    public static void categoryPuzzles()
    {
        System.out.println("What Puzzle do you want to try out? Enter -1 to quit");
        System.out.println("\t1. Cryptography");
        System.out.println("\t2. General Knowledge");
        System.out.println("\t3. Sudoku");
    }
}
