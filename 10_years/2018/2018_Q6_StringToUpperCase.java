import java.util.Scanner;

class StringToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String input = sc.nextLine();
        input = ' ' + input;
        sc.close();

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (temp == ' ') {
                char temp2 = input.charAt(i + 1);
                output = output + ' ' + Character.toUpperCase(temp2);
                i+=1;
            } else {
                output = output + temp;
            }
        }

        System.out.println("New String: " + output);

    }
}