package wsb.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class ImplementationOfCallable implements Callable<Double> {
  @Override
  public Double call() throws Exception {
    for (int i = 3; i >= 0; i--) {
      System.out.println(i + "...");
      Thread.sleep(1000);
    }
    return ThreadLocalRandom.current().nextDouble(0, 1);
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(8);
    Future<Double> future = executorService.submit(new ImplementationOfCallable());

    Double result = future.get();
    System.out.println("The result is " + result);
  }
}

