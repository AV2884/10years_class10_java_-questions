import java.util.Scanner;
class ParkingLot {
    int vno;
    int hours;
    double bill;

    ParkingLot(){
        vno = 0;
        hours = 0;
        bill = 0.0f;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle number :");
        vno = sc.nextInt();
        System.out.print("Enter hours :");
        hours = sc.nextInt();
        sc.close();
    }

    void calculate(){
        if(hours > 1){
            bill += 3;
            hours -= 1;
            bill += hours*1.50;
        }
        else
            bill += 3;
    }

    void display(){
        System.out.println("VEHICLE NUMBER : "+vno);
        System.out.println("NUMBER OF HOURS: "+hours);
        System.out.println("TOTAL BILL --->: "+bill+"$");
    }

    public static void main(String[] args) {
        ParkingLot ob = new ParkingLot();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
