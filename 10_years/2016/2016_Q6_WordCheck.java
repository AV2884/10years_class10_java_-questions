import java.util.Scanner;

class WordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word :");
        String input = sc.nextLine().toUpperCase();
        sc.close();

        String reverse ="";
        char temp;
        for(int i=input.length()-1; i >= 0; i--){
            temp = input.charAt(i);
            reverse += temp;
        }
        if(input.equals(reverse)){
            System.out.println("Palindrome and Special");
        }
        else if(input.charAt(0) == input.charAt(input.length()-1)){
            System.out.println("Only Special");
        }
        else{
            System.out.println("Its nothing bro");
        }
    }
}
