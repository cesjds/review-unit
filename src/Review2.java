/*
Written by: Yoav Amit

Go through the following code and write what you think the output will be below:

In main num1 = 5 and num2 = 8.
In swap n1 = 5 and n2 = 8.
In swap n1 = 8 and n2 = 5.
In main num1 = 5 and num2 = 8.
In swap n1 = 5 and n2 = 8.
In swap n1 = 8 and n2 = 5.
In main num1 = 5 and num2 = 5.

Create a Review2.java file in your Review project.
Type the in and run it and see if you were right. 
Please make sure you understand any errors you made.

Now comment out the "return n2" line in the swap method.
Write the error message you get below:

java: missing return statement

Comment it back in and change the header for the swap method to:
	public static int swap(int n1)
Write the error message you get below:

java: cannot find symbol

Please make sure you understand these errors - they are the most frequent
ones you will make!

When you are done copy and paste this header with your answers and submit it.
 */


public class Review2
{
    public static int swap(int n1, int n2)
    {
        System.out.println("In swap n1 = "+n1+ " and n2 = "+n2+".\n");
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("In swap n1 = "+n1+ " and n2 = "+n2+".\n");
        return n2;
    }
    public static void main(String[] args)
    {
        int num1 = 5, num2 = 8;
        System.out.println("In main num1 = "+num1+ " and num2 = "+num2+".\n");
        swap(num1, num2);
        System.out.println("In main num1 = "+num1+ " and num2 = "+num2+".\n");
        num2 = swap(num1, num2);
        System.out.println("In main num1 = "+num1+ " and num2 = "+num2+".\n");
    }
}