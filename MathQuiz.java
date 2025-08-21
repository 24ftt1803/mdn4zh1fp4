import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = (int) (Math.random() * 101);
        int y;

        do {
            y = (int) (Math.random() * 101);
        } while (y == 0);

        System.out.println("What is " + x + " + " + y + " ?");
        int userSum = input.nextInt();
        boolean sumCorrect = (userSum == x + y);
        System.out.println(x + " + " + y + " = " + userSum + " is " + (sumCorrect ? "true" : "false"));
        System.out.println();

        System.out.println("What is " + x + " % " + y + " ?");
        int userMod = input.nextInt();
        boolean modCorrect = (userMod == x % y);
        System.out.println(x + " % " + y + " = " + userMod + " is " + (modCorrect ? "true" : "false"));

        input.close();
    }
}

    

