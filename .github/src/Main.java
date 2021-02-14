import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double number = userInput.nextDouble();
        int myLuckyNumber = 29;

        System.out.println("My lucky number is.: " + myLuckyNumber);

        boolean wholeNumber = false;
        if (number == Math.floor(number)) {
            wholeNumber = true;
            System.out.println("Number is whole.: " + wholeNumber);
        } else {
            System.out.println("Number is whole.: " + wholeNumber);
        }

        boolean round = false;
        if (number % 2 == 0) {
            round = true;
            System.out.println("Number is even.: " + round);
        } else {
            System.out.println("Number is even.: " + round + " Your number is odd!");
        }

        if (number == myLuckyNumber) {
            System.out.println("Is my lucky number!");
        } else {
            System.out.println("Is not my lucky number!");
        }

        boolean doubleDigit = false;
        if (number > 9 && number < 100) {
            doubleDigit = true;
            System.out.println("Double digit.: " + doubleDigit);
        } else {
            System.out.println("Double digit.: " + doubleDigit);
        }
    }
}