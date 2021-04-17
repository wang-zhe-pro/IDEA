package 日常学习测试;
 interface Demo {
    void demoMethod();
}

public class MyDemo{
    public void test(Demo demo){
        demo.demoMethod();    }

    public static void main(String[] args) {
        MyDemo md = new MyDemo();
        //这里我们使用匿名内部类的方式将接口对象作为参数传递到test方法中去了
        md.test(new Demo(){
            public void demoMethod(){
                System.out.println("具体实现接口");
            }
        });
    }
}

