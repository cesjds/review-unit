/*
Written by:

Use DOCS to help you write this program.

1) Write a for loop that lets the user input 5 numbers.

2) Find the average of the 5 numbers.

3) Use an answer string to store your five numbers.

4) AFTER your loop print the numbers and average in this format;
        Your numbers are: 5 4 3 2 1
        The average of your numbers is: 3.0

5) Now add an if/else statement to count the number of even and
    odd numbers that were entered. AFTER your loop print your answer.
    Your output should now look like this:

    Your numbers are: 6 5 4 3 2
    The average of your numbers is: 4.0
    You entered 3 even numbers and 2 odd numbers.

 */

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class Review1{

    public static void changeJOP()
    {
        // These colors are very ugly - you need to CHANGE them!

        // The font of the message text
        UIManager.put("Label.font", new FontUIResource(new Font("Tempus Sans ITC", Font.BOLD, 58)));
        // The color of the message text
        UIManager.put("OptionPane.messageForeground",new Color(0, 0, 0));

        // color for text field (where you are inputting data)
        UIManager.put("TextField.background", Color.white);
        // font for message in text field
        UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
        // color for message in text field
        UIManager.put("TextField.foreground", Color.black);

        // The color of the panel
        UIManager.put("Panel.background",new Color(45, 130, 184));
        // The color around the outside of the panel
        UIManager.put("OptionPane.background",new Color(58, 130, 152));

        // Buttons at bottom
        UIManager.put("Button.background",new Color(211, 211, 211));
        UIManager.put("Button.foreground", new Color(204, 204, 204));
        UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
    }


    public static void main(String[] args) {
        changeJOP();
        int oddNum = 0;
        int evenNum = 0;
        String numString = "";
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            int iNum = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer:"));
            sum = sum + iNum;
            numString = numString + " " + Integer.toString(iNum);
            if (iNum % 2 == 0)
                evenNum += 1;
            else
                oddNum +=1;
        }
        double average = ((sum/5.0));

        String answer = "";
        answer +="The numbers you entered are "+numString+" \n";
        answer +="Your average of numbers is "+average+" \n";
        answer +="Your entered "+evenNum+" even number and "+oddNum+" odd numbers"+". \n";

        JOptionPane.showMessageDialog(null, answer);
    }
}