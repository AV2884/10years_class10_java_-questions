import java.util.*;
class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[15];
        for(int i=0;i<15;i++){
            System.out.print("Enter element "+(i+1)+" :");
            array[i] = sc.nextInt();
        }

        sc.close();

        for(int q=0;q<array.length-1;q++){
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }

        System.out.print("Sorted arrey -->");
        for(int i=0;i<15;i++){
            System.out.print(array[i]+" ");
        }
    }    
}
