import java.util.Scanner;

class RaliwayTicket {
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

    private void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter coach :");
        coach = sc.nextLine();
        System.out.print("Enter mobile number :");
        mobno = sc.nextLong();
        System.out.print("Enter amount :");
        amt = sc.nextInt();
        sc.close();
    }

    private void calculate() {
        if (coach.equals("First_AC")) {
            totalamt = 700 + amt;
        } else if (coach.equals("Second_AC")) {
            totalamt = 500 + amt;
        } else if (coach.equals("Third_AC")) {
            totalamt = 250 + amt;
        } else
            totalamt = amt;
    }

    private void display() {
        System.out.println("CUSTOMER NAME :" + "'" + name + "'");
        System.out.println("TOTAL AMOUNT  : " + totalamt);
        System.out.println("COACH CLASS   : " + coach);
        System.out.println("MOBILE NUMBER : " + mobno);
    }

    public static void main(String[] args) {
        RaliwayTicket ob = new RaliwayTicket();
        ob.accept();
        ob.calculate();
        ob.display();
    }

}
