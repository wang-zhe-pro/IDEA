package 匿名类和lambada表达式的应用;
public class Integrator {

    private double precision=1e-3;
    private IFun func;
    public Integrator(IFun func) {

        this.func=func;
    }

    public double compute(double down, double up) {
        double res=0;
        double x=down;
        double val0=func.fun(x);

        while(x<up) {
            x+=this.precision;

            res+=(func.fun(x)+val0)/2;
            val0= func.fun(x);





        }
        return res/1000;
    }
    public double getPrecision() {
        return precision;
    }
    public void setPrecision(double precision) {
        assert precision>1e-6;
        this.precision = precision;
    }

}

