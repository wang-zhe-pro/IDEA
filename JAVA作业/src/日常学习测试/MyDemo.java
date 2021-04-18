package 日常学习测试;
 interface Demo {
    void demoMethod();
}

public class MyDemo{
    public void test(Demo demo){
        demo.demoMethod();    }

    public static void main(String[] args) {
        MyDemo md = new MyDemo();

        md.test(new Demo(){
            public void demoMethod(){
                System.out.println("具体实现接口");
            }
        });
    }
}

