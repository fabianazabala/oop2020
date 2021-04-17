package wsb.threads;

public class ThreadRunner {
  public static void main(String[] args) {
    Thread firstThread = new Thread(new RunnableImplementation());
    Thread secondThread = new Thread(new RunnableImplementation());

    firstThread.start();
    secondThread.start();

    Thread scorpion = new Thread(new Scorpion());
    Thread subZero = new Thread(new SubZero());

    scorpion.start();
    subZero.start();

    // scorpion won

  }
}
