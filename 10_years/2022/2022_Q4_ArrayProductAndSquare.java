import java.util.Scanner;

class ArrayProductAndSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[20];

        for(int i=0; i<20; i++){
            System.out.print("Enter Double: ");
            arr[i] = sc.nextDouble();
        }
        
        double product = 1;

        for(int i=0; i<20; i++){
            product *= arr[i];
        }
        System.out.println("Product of all elements :" + product);

        System.out.print("Square of all elements ---> ");
        for(int i=0; i<20; i++){
            System.out.print(Math.pow(arr[i],2));
        }
        sc.close();
    }
}
