public class Main {

    public static double WorkEffort;

    public static void main(String[] args) {
	// input Work Effort
        WorkEffort = 0;
        Addworkeffort(100);
        Addworkeffort(50);
        Addworkeffort(20);
        Addworkeffort(360);
        Addworkeffort(80);
        Addworkeffort(160);
        Addworkeffort(500);
        Addworkeffort(240);
        Addworkeffort(40);
        Addworkeffort(40);

    //input work capacity
    capacity(8,3,30);
    capacity(8,3,35);
    capacity(8,3,40);

    capacity(9,3,30) ;
    capacity(9,3,35);
    capacity(9,3,40);

    capacity(10,3,30) ;
    capacity(10,3,35);
    capacity(10,3,40);

    capacity(11,3,30) ;
    capacity(11,3,35);
    capacity(11,3,40);

    capacity(8,4,30) ;
    capacity(8,4,35);
    capacity(8,4,40);

    capacity(8,5,30) ;
    capacity(8,5,35);
    capacity(8,5,40);

    capacity(8,6,30) ;
    capacity(8,6,35);
    capacity(8,6,40);

    }
    public static void Addworkeffort(double input){
    WorkEffort += input;
    }
    public static double capacity(int a, int b, int c){
        double capacity = WorkEffort/(a*b*c);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, you would be at %d%% of capacity\n",a,b,c,(int)(capacity*100));
        return capacity;
    }
}
