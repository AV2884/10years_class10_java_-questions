import java.io.IOException;
import java.util.*;
class MovieMagic {
    int year;
    String title;
    float rating;

    MovieMagic(){
        year=0;
        title="";
        rating=0.0f;
    }

    void accept()throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year :");
        year = sc.nextInt();

        sc.nextLine();
    
        System.out.print("Enter the title :");
        title = sc.nextLine();

        while(true){
            System.out.print("Enter rating (0.0 - 5.0):");
            rating = sc.nextFloat();
            if(rating >= 0.0f & rating <= 5.0f){
                break;
            }
            else
                System.out.println("rating should be between 0.00 and 5.00");
        }
        sc.close();
    }

    void display(){
        System.out.println("Year :" + year);
        System.out.println("Title :" + title);

        if(rating > 0.0f & rating <= 2.0f)
            System.out.println("Flop!");
        else if(rating > 2.0f & rating <= 3.4f)
            System.out.println("Semi-hit");
        else if(rating > 3.4f & rating < 4.5f)
            System.out.println("Hit");
        else
            System.out.println("SUPERRR HITT!!!!!");
    }

    public static void main(String[] args) throws IOException {
        MovieMagic ob = new MovieMagic();
        ob.accept();
        ob.display();
    }
}
