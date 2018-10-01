import java.util.Scanner;

 /* this exercise im tasked to prompt a user for a number month and a number year. Then the program will calculate and decide
how many days there is in the chosen month */

public class FindTheNumberOfDaysInAMonth {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // I will use the Leap year program som listing 3,7 in the book to determine if its is a leapyear or not
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0);

        // Display the result
        System.out.println(year + " is a leap year? " + isLeapYear);

        int high = 31; // Integer for the high number months
        int middle = 30;  // Variable for the middle number months
        int low = 28;   // Variable for the low and leap year months

        // In this section im correcting the number of days in february according to wether it is a leapyear or not!
        if (isLeapYear = true)
            low++;

        System.out.print("");
        // Finally im coding the program to display the number of days in the chosen month
        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();

        if ((month == 1) || (month == 3) || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("The number of days in the chosen month is: " + high);
        else if (month == 2)
            System.out.print("The number of days in the chosen month is: " + low);
        else
            System.out.println("The number of days in the chosen month is: " + middle);
    }
}