import java.util.*;
class BankDeposit {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Choice 1-Term , 2-Recuring :");
        short choice = sc.nextShort();
        switch(choice){
            case 1:
                System.out.println(TermDeposit());
            case 2:
                System.out.println(ReccuringDeposit());
            default:
                System.out.println("Wrong answer bro");
        }
    }

    public static double TermDeposit(){
        System.out.print("Enter principal :");
        int principal = sc.nextInt();
        System.out.print("Enter rate of intrest :");
        float rate = sc.nextFloat();
        System.out.print("Enter time years :");
        int timeInYears = sc.nextInt();
        
        double maturityValue = principal*(Math.pow((1+rate/10), timeInYears));
        return maturityValue;
    }

    public static double ReccuringDeposit(){
        System.out.print("Enter principal :");
        int principal = sc.nextInt();
        System.out.print("Enter rate of intrest :");
        float rate = sc.nextFloat();
        System.out.print("Enter time years :");
        int timeInMonths = sc.nextInt();
        timeInMonths *= 12;

        double maturityValue = (principal * timeInMonths) + (principal * timeInMonths * (timeInMonths + 1.0)
                                / 2.0*rate / 100.0 * 1.0 / 12.0); 
        return maturityValue;
    }
}
