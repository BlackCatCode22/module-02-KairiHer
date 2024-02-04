import java.util.Scanner;

public class MadnessWithMethods {
    static int getAnIntFromTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        return userInt;
    }

    static void compareTwoInts(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("The two integers are equal.");
        } else {
            System.out.println("The two integers are not equal.");
        }
    }

    static int sumTwoInts(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int firstInt = getAnIntFromTheUser();
        int secondInt = getAnIntFromTheUser();

        compareTwoInts(firstInt, secondInt);

        int sumResult = sumTwoInts(firstInt, secondInt);

       System.out.println("The sum of the two integers is: " + sumResult);
    }
}
