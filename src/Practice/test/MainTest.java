package Practice.test;

class Parent{
     public Parent(){
         System.out.println("This is Parent constructor");
     }

     public void m1(){
         System.out.println("This is parent method.");
     }
}

class Child extends Parent{
    public Child(){
        System.out.println("This is Child constructor");
    }

    public void m1(){
        System.out.println("This is Child method.");
    }
}
public class MainTest {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.m1();

    }



}
