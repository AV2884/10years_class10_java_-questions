import java.util.Scanner;

class StringDetails{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numDigits = 0;
        int numAlphabets = 0;
        int specialCharscters = 0;

        System.out.print("Enter a String:");
        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++){
            char temp = input.charAt(i);
            if(Character.isLetter(temp)){
                numAlphabets++;
            }
            else if(Character.isDigit(temp)){
                numDigits++;
            }
            else{
                specialCharscters++;
            }
        }
        System.out.println("Number of alphabets :"+numAlphabets);
        System.out.println("Number of digits :"+numDigits);
        System.out.println("Number of special chars :"+specialCharscters);
    }
}