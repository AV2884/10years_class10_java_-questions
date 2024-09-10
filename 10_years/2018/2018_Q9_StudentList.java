import java.util.Scanner;
class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students N:");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int marks[] = new int[n];
        float sum = 0.0f;
        n += 0.0;//TO CONVERT N INTO A FLOAT

        for(int i=0; i<n ;i++){
            System.out.print("Enter name " +(i+1)+" :");
            name[i] = sc.nextLine();
            System.out.print("Enter marks " +(i+1)+":");
            marks[i] = sc.nextInt();
            sc.nextLine();
            sum += marks[i];
        }
        System.out.println(sum+" "+n);
        double avg = (sum/n);

        System.out.println(avg);

        for(int i=0; i<n ;i++){
            System.out.println("Deviation of "+name[i]+" :"+(marks[i]-avg));
        }
        sc.close();
    }
}
