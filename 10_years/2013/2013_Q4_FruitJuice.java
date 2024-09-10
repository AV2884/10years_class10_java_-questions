import java.util.Scanner;

class FruitJuice{
    public static int product_code;
    public static String flavour;
    public static String pack_type;
    public static float product_price;

    FruitJuice(){
        product_code = 0;
        flavour = "";
        pack_type = "";
        product_price = 0f;
    }

    public static void main(String[] args) {
        input();
        discount(product_price);
        display();
    }
    
    public static void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code :");
        product_code = sc.nextInt();
        System.out.print("Enter flavour :");
        flavour = sc.nextLine();
        System.out.print("Enter pack type :");
        pack_type = sc.nextLine();
        System.out.print("Enter product price :");
        product_price = sc.nextFloat();
        sc.close();
    }

    public static void discount(float product_price){
        product_price -= 10;
    }

    public static void display(){
        System.out.print("product price :"+product_price);
        System.out.print("pack type :"+pack_type);
        System.out.print("flavour :"+flavour);
        System.out.print("product code :"+product_code);
    }

}