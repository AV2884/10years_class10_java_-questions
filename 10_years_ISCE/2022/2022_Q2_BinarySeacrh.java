import java.util.Scanner;

class BinarySeacrh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search :");
        int number_to_find = sc.nextInt();
        sc.close();

        int[] data = {2,5,7,10,15,20,29,30,46,50};

        int low = 0;
        int high = data.length - 1;
        int flag = 0;

        while(low <= high){
            int middle_position = (low + high)/2;
            int number_at_middle_position = data[middle_position];

            if(number_at_middle_position == number_to_find){
                flag = 1;
                break;
            }
            else if(number_to_find > number_at_middle_position){
                low = middle_position + 1;
            } else {
                high = middle_position -1;
            }
        }
        if(flag == 1){
            System.out.println("SEARCH SUCCESFUL!!!!!!");
        } else {
            System.out.println("Search not succesful :(((((");
        }
    }   
}
