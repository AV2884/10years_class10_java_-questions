import java.util.Scanner;

class ASCIIArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = new char[10];

        char highest_value = 'A';
        char lowest_value = 'z';

        for(int i=0; i<10 ;i++){
            System.out.print("Enter a char :");
            input[i] = sc.nextLine().charAt(0);
        }

        for(int i=0; i<10 ;i++){
            char temp = input[i];
            if(temp > highest_value){
                highest_value = temp;
            }
            else if(temp < lowest_value){
                lowest_value = temp;
            }
        }
        extracted(highest_value, lowest_value);
        sc.close();
        System.exit(0);
    }

    private static void extracted(char highest_value, char lowest_value) {
        System.out.println("Char with highest ASCII value is  :"+highest_value);
        System.out.println("Char with lowest ASCII value is  :"+lowest_value);
    }
    
}

