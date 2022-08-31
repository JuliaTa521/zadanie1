import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        if(firstNumber == secondNumber && secondNumber == thirdNumber){
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        }
        else if(firstNumber == secondNumber){
            System.out.println(firstNumber + " " + secondNumber);
        }
        else if(firstNumber == thirdNumber){
            System.out.println(firstNumber + " " + thirdNumber);
        }
        else if(thirdNumber == secondNumber){
            System.out.println(thirdNumber + " " + secondNumber);
        }
    }
}
