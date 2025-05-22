import java.util.Scanner;
class casee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,x;
        System.out.println("This is a normal quiz to choose your favorite subject:");
        System.out.println("For Mathematics choose 1");
        System.out.println("For Physics choose 2");
        System.out.println("For Commerce choose 3");
        System.out.println("For Chemistry choose 4");
        x=sc.nextInt();
        switch (x){
            case 1:
            {
                System.out.println("You chose for Mathematics");
                break;
            }
            case 2:
            {
                System.out.println("You chose for Physics");
                break;
            }
            case 3:
            {
            System.out.println("You chose for Commerce");
            break;
            }
            case 4:
            {
                System.out.println("You chose for Chemistry");
                break;
            }
            default:{
            System.out.println("You chose Wrong option");
            break;
            }
            
        }
    }
}