import java.util.*;
class SpecialTwoDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int og;
        while(true){
            System.out.print("Enter a 2 digit number :");
            og = sc.nextInt();
            if(og > 9 & og <100)
                break;
            else
                System.out.println("THE NUMBER SHOULD BE 2 DIGIT BRO!");
        }
        sc.close();
        
        int unit_place = og % 10;
        int tens_place = og/10;

        int sum_of_digits = unit_place + tens_place;
        int product_of_gigits = unit_place * tens_place;

        if(product_of_gigits+sum_of_digits == og)
            System.out.println("Special Number");
        else
            System.out.println("not a special number");
        
    }
}