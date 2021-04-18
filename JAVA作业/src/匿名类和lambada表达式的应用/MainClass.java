package 匿名类和lambada表达式的应用;

public class MainClass {

    public static void main(String[] args) {


        IFun fun1=new IFun() {


            @Override
            public double fun(double x) {
                return Math.sin(x);
            }
        };
        Integrator integrator=new Integrator(fun1);
        double res=integrator.compute(0,Math.PI/5.0);
        System.out.printf("%.3f",res);
        System.out.println("");


        IFun fun2= (double x)->{
         return  Math.sin(x*x+10);
        };
        integrator=new Integrator(fun2);
        res=integrator.compute(0,9*Math.PI);
        System.out.printf("%.4f",res);
    }

}

