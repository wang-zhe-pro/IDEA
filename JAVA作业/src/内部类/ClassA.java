package 内部类;
public class ClassA {
    private String memberA;

    public ClassA() {
        System.out.println("我是ClassA对象");
        this.memberA="member1";
    }
    public class ClassB{
        public ClassB() {
            System.out.println("我是ClassA中的内部类ClassB的对象");
            System.out.println("memberA="+memberA);
        }
    }

}
