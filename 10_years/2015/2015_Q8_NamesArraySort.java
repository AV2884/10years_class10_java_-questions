import java.util.*;

class NamesArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter name " + (i + 1) + " :");
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 19 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temp;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(names[i] + ", ");
        }
        sc.close();

    }
}
