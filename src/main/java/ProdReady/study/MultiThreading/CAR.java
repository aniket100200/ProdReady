package ProdReady.study.MultiThreading;

public interface CAR extends Runnable {}

class Lamborgini implements CAR {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("A");
    }
  }
}

class Audi implements CAR {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) System.out.println("This is CAR " + Audi.class.getName());

    try {
      Thread.sleep(20);
    } catch (Exception t) {

    }
  }
}

class ThreadA extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) System.out.println("This is CAR " + Audi.class.getName());
  }
}

class ThreadB extends Thread {
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("A");
      try {
        Thread.sleep(200);
      } catch (Exception t) {

      }
    }
  }
}

class Main {
  public static void main(String[] args) {
    //    Thread a = new ThreadA();
    //    Thread b = new ThreadB();
    //
    //    a.start();
    //    b.start();

    // using Runnable Interface
    Lamborgini lamborgini = new Lamborgini();
    Audi audi = new Audi();

    Thread t1 = new Thread(lamborgini);
    Thread t2 = new Thread(audi);
    t1.start();
    t2.start();
  }
}
