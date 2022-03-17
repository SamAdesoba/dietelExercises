package tddClass;

public class AutoBike {
    private int speed;

    public boolean isOn(boolean status) {
        return true;
    }

    public boolean isOff(boolean status) {
        return false;
    }

    public void setSpeed(int speed){this.speed = speed;}
    public void accelerate() {
        if(speed >= 0 && speed < 20) speed = speed + 1;
        if(speed >= 20 && speed < 30) speed = speed + 2;
        if(speed >= 30 && speed <= 42) speed = speed + 3;
        if(speed > 42) speed = speed + 4;
    }

    public void decelerate() {
        if(speed >= 40) speed = speed - 4;
        if(speed >= 30 && speed < 40) speed = speed - 3;
        if(speed >= 20 && speed < 30) speed = speed - 2;
        if(speed < 20) speed = speed - 1;
    }

    public int getSpeed() {
        return speed;
    }


}
