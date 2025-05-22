
public class Pyramid {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) //Total number of rows in the pyramid
        {
            System.out.print("*");
            for (int j = 0; j < i; j++) //print the coulmns
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
