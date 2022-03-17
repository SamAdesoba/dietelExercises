package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomaticAutoBikeTest {

    @Test
    public void BikeTurnOn(){
        AutoBike turnOff = new AutoBike();
        turnOff.isOn(true);
        assertEquals(true,turnOff.isOn(true));
    }

    @Test
    public void BikeTurnOff(){
        AutoBike turnOn = new AutoBike();
        turnOn.isOff(false);
        assertEquals(false, turnOn.isOff(false));
    }
    @Test
    public void BikeGear1(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(18);
        bike.accelerate();
        assertEquals(19, bike.getSpeed());
    }
    @Test
    public void BikeGear2(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.getSpeed());
    }
    @Test
    public void BikeGear3(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(36);
        bike.accelerate();
        assertEquals(39, bike.getSpeed());
    }
    @Test
    public void BikeGear4(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(50);
        bike.accelerate();
        assertEquals(54, bike.getSpeed());
    }

    @Test
    public void gear4To3(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(46);
        bike.decelerate();
        assertEquals(42,bike.getSpeed());
    }
    @Test
    public void gear3To2(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(33);
        bike.decelerate();
        assertEquals(30,bike.getSpeed());
    }
    @Test
    public void gear2To1(){
        AutoBike bike = new AutoBike();
        bike.setSpeed(22);
        bike.decelerate();
        assertEquals(20,bike.getSpeed());
    }

}
