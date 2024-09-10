import java.util.*;
class CollageLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int logBook[] = {1982,1987,1993,1996,1999,2003,2006,2007,2009,2010};
        System.out.print("Enter year to be searched :");
        int yearToFind = sc.nextInt();
        System.out.println(binarySearch(logBook,yearToFind)); 
        sc.close();
    }
    
    public static boolean binarySearch(int[] logBook,int yearToFind){
        int low = 0;
        int high = logBook.length-1;
        boolean searchSuccesful = false;
        
        while(low<=high){
            int middleIndex = (low+high)/2;
            int middleNumber = logBook[middleIndex];

            if(middleNumber == yearToFind){
                searchSuccesful = true;
            }
            if(yearToFind < middleNumber){
                high = middleIndex-1;
            }
            else{
                low = middleIndex+1;
            }
        }
        return searchSuccesful;
    }
}
