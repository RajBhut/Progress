public class thr {
    public static void main(String[] args) {
        my_thrad_runable1 t1 = new my_thrad_runable1();
        my_thrad_runable2 t2 = new my_thrad_runable2();
        t1.start();
        t2.start();
    }
}
class my_thrad_runable1 extends Thread{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("Good morning!");
        }

    }
}
class my_thrad_runable2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
         try
         {
             Thread.sleep(2);
         }
         catch (Exception e)
         {
             System.out.println(e);
         }
            System.out.println("Good Afternoon!");
        }

    }
    }

