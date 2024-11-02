import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String fileData = scanner.nextLine();
                System.out.println(fileData);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please make sure data.txt exists in the directory");

        }

    }

}
