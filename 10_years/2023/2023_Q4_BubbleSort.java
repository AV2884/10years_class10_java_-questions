import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char inputArray[] = new char[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter char " + (i + 1) + " :");
            inputArray[i] = sc.nextLine().charAt(0);
        }

        sc.close();

        boolean swappedSomething = true;
        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    swappedSomething = true;
                    char temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
