import java.util.Scanner;

class WordForming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String str1 = sc.nextLine()+" ";
        System.out.print("Enter String 2:");
        String str2 = sc.nextLine()+" ";

        String output = "";

        for(int i=0;i<str1.length()-1;i++){
            char temp1 = str1.charAt(i);
            output += temp1;
            char temp2 = str2.charAt(i);
            output += temp2;
        }
        System.out.println(output);
        sc.close();      
        
    }
}


























