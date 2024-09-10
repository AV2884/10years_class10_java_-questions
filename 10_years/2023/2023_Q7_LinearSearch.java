import java.util.Scanner;
class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter element :" + (i + 1) + " :");
            arr[i] = sc.nextDouble();
        }

        System.out.print("Enter element to search :");
        double numToFind = sc.nextDouble();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (numToFind == arr[i]) {
                System.out.println("Search succeseful at index :" + i);
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Search unseccsesful :(");
        }
    }
}
