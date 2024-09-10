import java.util.Scanner;

class Student{
    String name;
    int age;
    int mks;
    String stream;

    Student(){
        name = "";
        age = 0;
        mks = 0;
        stream = "";
    }
    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter age :");
        age = sc.nextInt();
        System.out.print("Enter marks :");
        mks = sc.nextInt();
        sc.close();
    }

    void allocation(){
        if(mks >= 300){
            stream = "Science and Computer";
        }
        else if(mks >=200 && mks < 300){
            stream = "Commerce and Computer";
        }
        else if(mks >= 75 && mks < 200){
            stream = "Arts and Animation";
        }
        else{
            stream = "Try Again -_-";
        }
    }

    void print(){
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("MARKS : "+mks);
        System.out.println("STREAM : "+stream);
    }

    public static void main(String[] args) {
        Student ob = new Student();
        ob.accept();
        ob.allocation();
        ob.print();
    }
}