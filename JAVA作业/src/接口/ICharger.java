package 接口;


public interface ICharger {

    boolean connectPowerline(float voltage);

    void powerOff();

    int doCharge(int currentEnergy);
}