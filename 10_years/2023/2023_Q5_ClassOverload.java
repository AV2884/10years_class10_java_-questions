import java.util.Scanner;

class ClassOverload {
    void print() {
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print(i);
            }
            System.out.println();
            System.out.println(i);
        }
    }

    void print(int n) {
        int sum_even = 0;
        int sum_odd = 0;

        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            String temp = number.charAt(i) + "";
            int tempInt = Integer.parseInt(temp);
            if (tempInt % 2 == 0) {
                sum_even += tempInt;
            } else {
                sum_odd += tempInt;
            }
        }
        System.out.println("Sum of odd integers is :" + sum_odd);
        System.out.println("Sum of even integers is :" + sum_even);
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassOverload ob = new ClassOverload();

        // System.out.print("Enter int n:");
        // int x = sc.nextInt();
        // sc.close();

        // ob.print(x);
        ob.print();
    }
}
