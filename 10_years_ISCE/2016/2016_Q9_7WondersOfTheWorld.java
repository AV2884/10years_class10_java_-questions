import java.util.Scanner;

class WondersOfTheWorld {    
    
    public static String[] sevenWondors = {"Taj Mahal","Great Wall","Machu Pichu","The Colosseum","Christ the Redeemer Statue","Petra","Chichen Itza"};
    public static String[] countries = {"india","china","peru","rome","brazil","jordan","mexico"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country :");
        String search = sc.nextLine().toLowerCase();
        sc.close();

        int flag = 0;
        int indexAtCountry = 0;
        for(int i=0;i<7;i++){
            if(search.equals(countries[i])){
                flag = 1;
                indexAtCountry = i;
                break;
            }
        }

        if(flag == 1){
            System.out.println(search+" :"+sevenWondors[indexAtCountry]);
        }
        else{
            System.out.println("NO RECORDS");
        }

    }

}
