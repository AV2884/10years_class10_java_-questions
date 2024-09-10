import java.util.Scanner;

class BookFair {
    String Bname;
    double price;

    BookFair(){
        Bname="";
        price=0.0f;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book name :");
        Bname = sc.nextLine();
        System.out.print("Enter Price :");
        price = sc.nextDouble();
        sc.close();
    }

    void calculate(){
        if(price <= 1000){
            price = price - (price * 0.02);
        }
        else if(price <= 3000){
            price = price - (price * 0.1);
        }
        else{
            price = price - (price*0.15);
        }
    }

    void display() {
        System.out.println("Book :"+Bname);
        System.out.println("Price after discount :"+price);
    }
    public static void main(String[] args) {
        BookFair ob = new BookFair();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
