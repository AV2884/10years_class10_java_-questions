import java.util.Scanner;

class ThreeDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + (i + 1) + "," + (j + 1) + "] :");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
        sc.close();
    }
}
