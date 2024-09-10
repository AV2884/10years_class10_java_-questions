import java.util.*;

class ShowRoom {
    public Scanner sc = new Scanner(System.in); 
        String name;
        long mobno;
        double cost;
        double dis;
        double amount;

    ShowRoom(){
        name = "";
        mobno = 0;
        cost = 0f;
        dis = 0f;
        amount = 0f;
    }

    void input(){
        System.out.print("Enter customer name:");
        name = sc.nextLine();
        System.out.print("Enter customer mobile number :");
        mobno = sc.nextLong();
        System.out.print("Enter cost :");
        cost = sc.nextDouble();
    }

    void calculate(){
        if(cost<=10000){
            cost -= 0.05*cost;
        }
        else if(cost > 10000 && cost <= 20000){
            cost -= 0.1*cost;
        }
        else if(cost > 20000 && cost <+ 25000){
            cost -= 0.15*cost;
        }
        else if(cost > 35000){
            cost -= 0.2*cost;
        }
    }

    void display(){
        System.out.println("CUSTOMER NAME          :"+name);
        System.out.println("CUSTOMER MOBIlE NUMBER :"+mobno);
        System.out.println("TOTAL BILL             :"+cost);
    }

    public static void main(String[] args) {
        ShowRoom object = new ShowRoom();
        object.input();
        object.calculate();
        object.display();
    }
}
