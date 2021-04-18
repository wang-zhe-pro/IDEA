package 接口;

import java.util.Scanner;

public class Telephone {
    ICharger charger;
    private int currentEnergy;
    public Telephone() {

         charger =new Charger();

    }
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Telephone tel=new Telephone();
        System.out.println("请输入交流电压和当前手机电量:");
        float vol=sc.nextFloat();
        tel.currentEnergy=sc.nextInt();
        tel.beginCharge(vol);
        sc.close();
    }
    private void beginCharge(float vol) {
        if(charger.connectPowerline(vol)) {
            while(true) {
                currentEnergy=charger.doCharge(currentEnergy);
                if(currentEnergy==100) {
                    break;
                }
            }
        }
    }

}
