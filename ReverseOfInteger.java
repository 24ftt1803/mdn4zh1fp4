import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        int lastDigit = number % 10;       
        int middleDigit = (number / 10) % 10; 
        int firstDigit = number / 100;      

        int reversed = (lastDigit * 100) + (middleDigit * 10) + firstDigit;

        System.out.println("The reverse of " + number + " is " + reversed);

        input.close();
    }
}

