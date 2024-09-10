import java.util.Scanner;

class SpyNumber {
    public static void main(String[] args) {
        int sum = 0,number,product = 1;
        String tempString,numberString;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        number = sc.nextInt();
        sc.close();

        numberString = Integer.toString(number);

        for (int i = 0; i < numberString.length(); i++) {
            tempString = numberString.charAt(i) + "";
            sum += Integer.parseInt(tempString);
            product *= Integer.parseInt(tempString);
        }

        if (sum == product) {
            System.out.println("SPY NUMBER!!!!!");
        } else
            System.out.println("Not a spy number.");

    }

}
