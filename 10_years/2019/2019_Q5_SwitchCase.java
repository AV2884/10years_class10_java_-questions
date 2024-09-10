import java.util.*;

class SwitchCase {

    static void unicode() {
        System.out.println("Letter      Number");
        for (int i = 65; i <= 90; i++) {
            System.out.println("  "+((char) i) + "           " + i);
        }
    }

    static void pattern() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice :");
        byte choice = sc.nextByte();
        sc.close();
        switch (choice) {
            case 1:
                unicode();
                break;
            case 2:
                pattern();
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
