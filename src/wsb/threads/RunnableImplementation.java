package wsb.threads;

public class RunnableImplementation implements Runnable {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
  }
}