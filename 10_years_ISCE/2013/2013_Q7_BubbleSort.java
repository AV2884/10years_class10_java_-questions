import java.util.*;
class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length :");
        short len = sc.nextShort();
        int arr[] = new int[len];
        for(int i=0; i<len;i++){
            System.out.print("Enter element "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<len;i++){
            for(int p=0;p<(len-1)-i;p++){
                if(arr[p]>arr[p+1]){
                    int t = arr[p+1];
                    arr[p+1] = arr[p];
                    arr[p] = t;
                }
            }
        }
        for(int i=0; i<len;i++){
            System.out.print(arr[i]+",");
        }
    }
}