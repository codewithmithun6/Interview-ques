package practice1;

import com.sun.tools.javac.Main;

import java.util.stream.IntStream;

public class Demo4 {

    public static boolean isPrime(int n){
        return n>1 && IntStream.range(2,(int) Math.sqrt(n)+1).noneMatch(i->n%i==0);


    }
    public static void main(String[] args) {

        // prime number below 100

        IntStream.range(2,100).filter(Demo4::isPrime).forEach(System.out::println);

        }
    }

