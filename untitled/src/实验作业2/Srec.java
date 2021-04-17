package 实验作业2;

public class Srec {
 private int x;
 private int y;
 private int z;
    Srec(){
        this.setX(1);
        this.setY(2);
        this.setZ(3);

    }
    Srec(int a,int b,int c){
        this.setX(a);
        this.setY(b);
        this.setZ(c);

    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x =x ;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
