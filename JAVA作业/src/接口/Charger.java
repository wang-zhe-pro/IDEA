package 接口;

public class Charger implements  ICharger {
    @Override
    public boolean connectPowerline(float voltage) {
        if(voltage>=200&&voltage<=240){
            return  true;
        }

        else{
            System.out.println("交流电压不在[200,240]范围,无法充电");
            return false;

        }
    }

    @Override
    public void powerOff() {
        System.out.println("充电器停止充电");
    }

    @Override
    public int doCharge(int currentEnergy) {
        if(currentEnergy==100){
            System.out.println("已充电到100");
            powerOff();

            return 100;
        }
        else if (currentEnergy>=95){
            currentEnergy=100;
            System.out.println("已充电到100%");
            return 100;
        }

        else
        currentEnergy+=5;
        System.out.println("已充电到"+currentEnergy+"%");
            return currentEnergy;
    }
}
