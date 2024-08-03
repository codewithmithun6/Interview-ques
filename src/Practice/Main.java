package Practice;

public class Main {
    static void main(int a){
        System.out.println("This is one parameter main method: "+a);
    }
    static double main(int a,double d){
        System.out.println("This is two parameter main method: "+a +" , "+d);
    return d;
    }

    public static void main(String... args) {
        System.out.println("Execution start from this method");
        main(10);
        main(20,30.0);

    }
    static {
        System.out.println("This is static block");
    }
}
