import java.util.Scanner;

class Sentence {    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = sc.nextLine();
        sc.close();

        input = input.toUpperCase()+ " ";

        char temp;
        String str ="";

        for(int i = 0; i < input.length() ;i ++){
            temp = input.charAt(i);
            if(temp != ' '){
                str += temp;
            }
            else{
                System.out.println(str);
                str = "";
            }
        }
    }
}
