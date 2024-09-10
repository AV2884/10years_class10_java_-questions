import java.util.Scanner;

class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String names[] = new String[students];
        int sub1[] = new int[students];
        int sub2[] = new int[students];
        int sub3[] = new int[students];
        int rollNumbers[] = new int[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter name :");
            names[i] = sc.nextLine();

            System.out.print("Enter roll number "+(i+1)+": ");
            rollNumbers[i] = sc.nextInt(i);
            sc.nextLine(); 

            System.out.print("Enter marks sub1 :");
            sub1[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter marks sub2 :");
            sub2[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter marks sub3 :");
            sub3[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.println();
        }

        for (int i = 0; i < students; i++) {
            float avg = ((sub1[i] + sub2[i] + sub3[i]) / 3.0f);
            System.out.println("Student: " + names[i] + " roll no: " + rollNumbers[i]);
            if (avg >= 85 && avg <= 100){
                System.out.println("Avg: " + avg + " EXCELLENT!!");
                System.out.println("---------------------");
            }
            
            else if (avg >= 75 && avg <= 84){
                System.out.println("Avg: " + avg + " DISTINCTION");
                System.out.println("---------------------");
            }
            else if (avg >= 60 && avg <= 74){
                System.out.println("Avg: " + avg + " FIRST CLASS");
                System.out.println("---------------------");
            }
            
            else if (avg >= 40 && avg <= 59){
                System.out.println("Avg: " + avg + " PASS");
                System.out.println("---------------------");
            }
                
            else{
                System.out.println("Avg: " + avg + " POOR");
                System.out.println("---------------------");
            }
               
            sc.close();
        }
    }
}
