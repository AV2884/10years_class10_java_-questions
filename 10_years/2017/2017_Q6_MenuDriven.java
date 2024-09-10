import java.util.Scanner;

class MenuDriven {
    public static void seriesSum(){
        int x = 2,sum = 0,power = 1;
        for(int i = 1; i <= 20; i+=2){
            sum += Math.pow(x, power)*(i % 2 ==0 ? -1 : 1);
            power++;
        }
        
        System.out.println("SUM WHEN X IS 2 :" +(sum));
    }
    public static void pattern(){
        int x = 0;
        for (int i = 1; i <= 5; i++) {
            x = (x*10)+1;
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER CHOICE 1 OR 2 :");
        int choice = sc.nextInt();
        sc.close();

        
        switch(choice){
            case 1:
                seriesSum();
                break;
            case 2:
                pattern();
                break;
            default:
                System.out.println("ENTER APPORPIATE CHOICE BROO");
        }
    
    }
}
