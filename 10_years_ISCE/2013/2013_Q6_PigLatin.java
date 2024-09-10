import java.util.*;
class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word :");
        String input = sc.nextLine();
        input = input.toUpperCase();
        sc.close();
        
        String temp2 = "";
        for(int i=0; i<= input.length()-1; i++){
            char temp = input.charAt(i);
            if(temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U'){
                input = input.substring(i);
                break;
            }
            temp2 += temp;
        }
        System.out.println(input.concat(temp2+"AY"));

    }
}
