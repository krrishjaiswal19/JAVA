import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {
    public static void main(String[] args) {

        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found!");

        } catch (Exception e) {
            System.out.println("❌ Some error occurred: " + e);
        }
    }
}