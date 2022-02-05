import javax.swing.*;

/*
 * Written by: Yoav Amit
 * Create a file called Review3.java in your Review project.
 * Copy and paste this header and code into your file. Put your name at the top.
 * Write the methods to make my main work. You may want to
 * comment out lines so you can run the methods one at a time.
 *
 * The howMany method should ask the user how many times they
 *   want to print "Hello".
 * The printHello method should print "Hello" the number of times
 *   the user entered.
 * The whatWord method should ask the user what word they
 *   would like to translate to pigLatin.
 * The pigLatin method should translate the word.
 * We are using the simple pigLatin rules -
 *    remove the first letter, add it to the end and add "ay".
 *
 *   YOU CAN NOT MAKE ANY CHANGES TO MY MAIN!!!
 * When you are done copy and paste your program and submit it.
 */
public class Review3
{
    public static int howMany()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("How many times do you want to print hello: "));
        return num;
    }

    public static void printHello(int num)
    {
        for(int i = 0; i < num; i++)
        {
            System.out.println("Hello");
        }
    }

    public static String whatWord()
    {
        String word = JOptionPane.showInputDialog("What word would you like to translate to Pig Latin: ");
        return word;
    }

    public static String pigLatin(String word)
    {
        String pig = word.substring(1) + word.charAt(0) + "ay";
        return pig;
    }

    public static void main(String[] args)
    {
        int num = howMany();
        printHello(num);

        String word = whatWord();
        String pig = pigLatin(word);
        System.out.println(word + " in pigLatin is "+pig+".");
    }
}