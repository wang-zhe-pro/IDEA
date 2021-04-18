package 线程;

public class Thread_test {
    public static void main(String[] args) {
        yun yun1=new yun();
        Thread a=new Thread(yun1);
        a.start();
        String fa="dsa s dfs";
        String[] h=fa.split(" ");
        for (int i=0;i<h.length;i++){
            System.out.println(h[i]);
        }
    }
    }

 class yun implements  Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            for (int i=0;i<=10;i++){
                System.out.println("19003");

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
