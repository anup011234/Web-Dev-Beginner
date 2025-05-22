
import java.util.Scanner;  // Correct import

public class Scan {     // Class name should match the file name (Pyramid.java)

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the value of a: ");
            int a = in.nextInt();
            System.out.println("The value of a is: " + a);
            in.close();
        }
    }
}
