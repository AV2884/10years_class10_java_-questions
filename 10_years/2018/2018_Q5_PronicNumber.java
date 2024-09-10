import java.util.Scanner;

class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int input = sc.nextInt();
        sc.close();

        int i=0;
        boolean flag = false;
        while(i<input){
            if(i*(i+1)==input){
                flag = true;
            }
            i++;
        }
        if(flag == true){
            System.out.println("PRONIC!!! :))))");
        }
        else{
            System.out.println("NOT PRONIC :(");
        }
    }
}
