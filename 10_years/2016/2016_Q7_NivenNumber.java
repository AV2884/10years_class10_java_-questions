import java.util.Scanner;

class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for NIVEN :");
        int input = sc.nextInt();
        sc.close();
        int sum = 0;
        // Integer.toString(99);
        // Integer.parseInt("99");
        String inputString = Integer.toString(input);
        for(int i=0; i<inputString.length();i++){
            String tempString = String.valueOf(inputString.charAt(i));
            int temp = Integer.parseInt(tempString);
            sum += temp;
        }

        if(input % sum == 0){
            System.out.println("Niven number!!!!");
        }
        else
            System.out.println("Not Niven Number!!!");
        

    }
}
