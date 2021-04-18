package 线程;

public class exam01 {
    public static void main(String[] args) {
         A a=new A();
         MyThread t1=new MyThread(a);
         t1.setName("t1");
         MyThread t2=new MyThread(a);
         t2.setName("t2");
         t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();


    }
}


class A {
    public synchronized void dosome()  {
        System.out.println("dosome begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("dosome over");
    }
    public void doother(){
        System.out.println("doother begin");
        System.out.println("doother over");

    }

}
class MyThread extends Thread{
    private  A a;
    public MyThread(A a){
        this.a=a;
    }
    public void run(){
      if(Thread.currentThread().getName().equals("t1")){
          a.dosome();
      }
      if(Thread.currentThread().getName().equals("t2")){
          a.doother();
      }
    }
}
