package wsb.threads;

public class RunnableImplementation implements Runnable {
  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    String message = "Hello";
    print(message);
    message += "World!";
    print(message);
  }

  public static void print(String message){
    System.out.println(message);
    message += " ";
  }
}