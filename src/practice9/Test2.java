package practice9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<Future<String>> futures = new ArrayList<>();

        for(int i=0;i<10;i++){
            int index = i;

            Future<String> future = executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {

                    Thread.sleep(1000);
                    return "result of task"+index;
                }
            });
            futures.add(future);


        }

        for(Future<String> future: futures){

            System.out.println(future.get());

        }

        executorService.shutdown();




    }
}
