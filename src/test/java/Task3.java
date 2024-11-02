import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ რიცხვითი მნიშვნელობა ");
        try {
            int integerData = scanner.nextInt();
            System.out.println("თქვენს მიერ შეყვანილი რიცხცვია " + integerData);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
            System.out.println("სკანერი დახურულია");
        }
    }
}
