package practice4;

interface ScreenTouch{
    default void display(){
        System.out.println("This is screen touch input.");
    }
    static void displayStatic(){
        System.out.println("This is static Screen touch..");
    }
}

interface KeyPadTouch{
    default void display(){
        System.out.println("This is key pad touch input..");
    }

}

public class Laptop implements ScreenTouch,KeyPadTouch{

    @Override
    public void display() {
        System.out.println("This is Laptop input");
    }
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.display();
        ScreenTouch.displayStatic();

    }
}
