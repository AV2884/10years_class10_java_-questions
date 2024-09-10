class OverLoad {
    void series(int x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }

    void series(int p){
        // 0, 7, 26, 63 ........... 
        for(int i = 1; i <= p; i++){
            System.out.print((Math.pow(i, 3))-1+" ");
        }
        System.out.println("");
    }

    void series(){
        double sum2 = 0;
        for(float i = 2;i <= 10; i++){
            sum2 += (1/i);
        }
        System.out.println(sum2);
    }

    public static void main(String[] args) {
        OverLoad object = new OverLoad();
        object.series(2,10);
        object.series(10);
        object.series();
    }
}