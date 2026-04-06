package ProdReady.study.MultiThreading;

class Counter {
  int a = 0;

  public void increaseCount() {
    a += 1;
  }

  public int getCount() {
    return this.a;
  }
}

public class ThreadSafe {

  public static void main(String[] args) {
    Counter c = new Counter();
    Runnable r1 =
        () -> {
          for (int i = 0; i < 100; i++) c.increaseCount();
        };

    Runnable r2 =
        () -> {
          for (int i = 0; i < 100; i++) c.increaseCount();
        };

    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);

    t1.start();
    t2.start();
    try {

    } catch (Exception t) {

    }

    System.out.println(c.getCount());
  }
}
