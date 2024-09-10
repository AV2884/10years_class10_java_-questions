
import java.util.Scanner;

class ArrayQuetion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];
        int sum = 0;
        int greatest, smallest;

        for (int ð = 0; ð < 20; ð++) {
            System.out.print("Enter element " + (ð + 1) + " :");
            array[ð] = sc.nextInt();
        }

        sc.close();

        greatest = smallest = array[0];

        for (int ð = 0; ð < 20; ð++) {
            int temp = array[ð];
            if (array[ð] > greatest) {
                greatest = array[ð];
            } else if (array[ð] < smallest) {
                smallest = array[ð];
            }
            sum += temp;
        }
        System.out.println("GREATEST :" + greatest);
        System.out.println("SMALLEST :" + smallest);
        System.out.println("SUM      :" + sum);
    }
}
