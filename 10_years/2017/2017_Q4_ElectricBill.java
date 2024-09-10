import java.util.Scanner;

class ElectricBill {
    String n;
    int units;
    double bill;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        n = sc.nextLine();
        System.out.print("Enter units consumed :");
        units = sc.nextInt();
        System.out.println("---------------------");
        sc.close();
    }
    void calculate(){
        if(units <= 100){
            bill = 2 * units;
        }
        else if(units > 100 && units <= 300){
            bill = (100 * 2) + ((units-100)*3);
        }
        else{
            bill = (100*2)+(200*3)+((units-300)*5);
            if(bill > 300){
                bill += 2.5/100*bill;
            }
        }
    }
    void print(){
        System.out.println("NAME  : "+n);
        System.out.println("UNITS :"+units);
        System.out.println("BILL  :"+bill);
    }
    public static void main(String[] args) {
        ElectricBill ob = new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
