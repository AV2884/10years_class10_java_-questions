import java.util.Scanner;

class SumDigitsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element :");
            arr[i] = sc.nextInt();
        }

        int sumSingleDigit = 0;
        int sumDoubleDigit = 0;

        for (int i = 0; i < 10; i++) {
            String temp = Integer.toString(arr[i]);
            if (temp.length() == 1) {
                sumSingleDigit += Integer.parseInt(temp);
            } else if (temp.length() == 2) {
                sumDoubleDigit += Integer.parseInt(temp);
            }
        }

        System.out.println("sum double digits :" + sumDoubleDigit);
        System.out.println("sum single digits :" + sumSingleDigit);

    }
}