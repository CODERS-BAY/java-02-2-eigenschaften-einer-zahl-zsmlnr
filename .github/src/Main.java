import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double number = userInput.nextDouble();
        int myLuckyNumber = 29;

        System.out.println("My lucky number is.: " + myLuckyNumber);

        boolean wholeNumber = number == Math.floor(number);
        System.out.println("Number is whole.: " + wholeNumber);

        boolean round = number == Math.round(number / 10.0) * 10;
        System.out.println("Number is Round.: " + round);

        boolean myLucky = number == 29;
        System.out.println("My Lucky number is.: " + myLucky);

        boolean doubleDigit = (number > 9 && number < 100) || (number < -9 && number > -100);
        System.out.println("Double digit.: " + doubleDigit);
    }
}