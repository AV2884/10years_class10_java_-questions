import java.util.*;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to be searched :");
        int number_to_find = sc.nextInt();
        sc.close();

        int[] arr = {31,36,45,50,60,75,86,90};

        int flag = 0;
        int low = 0;                 
        int high = arr.length -1;

        while(low <= high){
            int middle_position = (low+high)/2;
            int number_at_middle_position = arr[middle_position];

            if(number_at_middle_position == number_to_find){
                flag = 1;
                break;
            }
            else if(number_at_middle_position > number_to_find){
                high = middle_position - 1;
            }
            else {
                low = middle_position + 1;
            }
        }

        if(flag == 1){
            System.out.println("Search Succesful!!!!!");
        }
        else{
            System.out.println("Search Unsuccesful");
        }
    }
}
