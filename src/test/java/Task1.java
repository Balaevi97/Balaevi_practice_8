import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ რიცხვი #1: ");
        int number1 = scanner.nextInt();

        System.out.println("შეიყვანეთ რიცხვი #2: ");
        int number2 = scanner.nextInt();

        try {
            int result = number1/number2;
            System.out.println(" შედეგი: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide " + e.getMessage());
            //  System.out.println("Cannot divide by zero");
        }

    }
}
