package work;

public class ThreadDemo {
    public static void main(String[] args) {
        // FIRST THREAD implemented with lambda
        Runnable thread1=()->{
          for (int i=1;i<=10;i++){
              System.out.println(i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Thread t=new Thread(thread1);
        t.start();

        // SECOND THREAD implemented with lambda
        Runnable t1=()->{
            for (int i=1;i<=10;i++)
                System.out.println(i*2);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread thread=new Thread(t1);
        thread.start();
    }
}
