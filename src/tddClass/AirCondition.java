package tddClass;

public class AirCondition {
    private int temperature = 16;
    public boolean isOn(boolean status) {
        return true;
    }

    public boolean isOff(boolean status) {
        return false;
    }

    public int increase(int temperature) {
            this.temperature = ++temperature;
        return temperature;
    }

    public int decrease(int temperature) {
            this.temperature = --temperature;
        return temperature;
    }

    public int beyond30(int temperature) {
        if(temperature > 30) {temperature = 30;}
        return temperature;
    }

    public int below(int temperature) {
        if (temperature < 16) {temperature = 16;}
        return temperature;
    }
}
