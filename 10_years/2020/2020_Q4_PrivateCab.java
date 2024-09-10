import java.util.*;
class CabService {
    String cartype;
    double km;
    double bill;

    CabService(){
        cartype = "";
        km = 0;
        bill = 0;
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car type (AC / NON-AC):");
        cartype = sc.nextLine();
        System.out.print("Enter km :");
        km= sc.nextInt();
        sc.close();
    }

    void calculate(){
        if(cartype.equals("AC")){
            if(km <= 5){
                bill = 150;
            }
            else if(km > 5){
                bill = 150 + ((km-5) * 10);
            }
        }
        else if(cartype.equals("NON-AC")){
            if(km <= 5){
                bill = 120;
            }
            else if(km > 5){
                bill = 120 + ((km-5) * 8);
            }
        }
    }

    void display(){
        System.out.println("CAR TYPE    :"+ cartype);
        System.out.println("KM TRAVELLED:"+km);
        System.out.println("TOTAL BILL  :"+bill);
    }


    public static void main(String[] args) {
        CabService ob = new CabService();
        ob.accept();
        ob.calculate();
        ob.display();
    }    
}
