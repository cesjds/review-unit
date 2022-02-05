/********************************************************************
 * Written by:  Hadley Steelman
 *
 * Purpose: To demonstrate how to use the JOptionPane class to input
 * 			and output data.
 *
 *******************************************************************/
import java.awt.Color;
import java.awt.Font;



import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class JOPNotes
{
    public static void changeJOP()
    {
        // These colors are very ugly - you need to CHANGE them!

        // The font of the message text
        UIManager.put("Label.font", new FontUIResource (new Font("Tempus Sans ITC", Font.BOLD, 58)));
        // The color of the message text
        UIManager.put("OptionPane.messageForeground",new Color(80, 63, 91));

        // color for text field (where you are inputting data)
        UIManager.put("TextField.background", Color.yellow);
        // font for message in text field
        UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.ITALIC, 24)));
        // color for message in text field
        UIManager.put("TextField.foreground", Color.red);

        // The color of the panel
        UIManager.put("Panel.background",new Color(255,0,132));
        // The color around the outside of the panel
        UIManager.put("OptionPane.background",new Color(255,0,0));

        // Buttons at bottom
        UIManager.put("Button.background",new Color(132,112,255));
        UIManager.put("Button.foreground", new Color(72,61,139));
        UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
    }

    public static void main(String[] args)
    {
        // This calls the changeJOP method to change your
        // colors & fonts
        changeJOP();

        // There are 2 methods we will be using for input from the
        //	JOptionPane class:
        //	1)  showMessageDialog() - prints a message in a JOP
        //	2)  showInputDialog() - prints a prompt and lets the
        //		user input a String.

        // declares the answer variable that will print in the JOP window
        String answer="";

        // 	To print a prompt and input a String:
        String name = JOptionPane.showInputDialog("Enter your name: ");

        // adds the name to answer
        answer +=  "Hello "+name+"! \n";

        // Since the only data type that can be input with JOP is
        //	Strings we have to convert the Strings to ints and doubles
        //	if that's the data type we need.
        //	To convert to ints we will use the parseInt method from
        //	the Integer class.
        //  To convert to doubles we will use the parseDouble method
        //	from the Double class.


        // Let's the user input an int value and prints it:
        int iNum = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
        answer +="Your integer number is  "+iNum+". \n";
//
//		// Let's the user input an double value and prints it:
        double dNum = Double.parseDouble(JOptionPane.showInputDialog("Enter an double:"));
        answer +="Your double number is  "+dNum+". \n";
//
//		// Let's the user input an boolean value and prints it:
        boolean bool = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter a boolean value:"));
        answer += "Your boolean value is  "+bool+". \n";
//
//		// Let's the user input an character value and prints it:
        char ch = JOptionPane.showInputDialog("Enter a character value:").charAt(0);
        answer += "Your character value is  "+ch+". \n";

        JOptionPane.showMessageDialog(null, answer);

    }
}


