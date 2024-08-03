package practice9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Test1 {
    public static void main(String[] args) throws ExecutionException,InterruptedException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "result of Asy";
        });

        System.out.println("Doing other thing..");

        String result = future.get();
        System.out.println(result);


    }
}
