package tddClass;

import org.junit.jupiter.api.Test;
import org.testng.xml.dom.ParentSetter;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void AirCondition(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOn(true);
        assertTrue(airCondition.isOn(true));

    }
    @Test

    public void AirConditionSwitchOff(){
        AirCondition switchOn = new AirCondition();
        switchOn.isOff(false);
        assertFalse(switchOn.isOff(false));
    }
    @Test
    public void AirConditionIncrease(){
        AirCondition switchOn = new AirCondition();
        switchOn.increase(20);
        assertEquals(21,switchOn.increase(20));
    }
    @Test
    public void AirConditionDecrease(){
        AirCondition switchOn = new AirCondition();
        switchOn.decrease(20);
        assertEquals(19,switchOn.decrease(20));
    }
    @Test
    public void IncreaseTemperatureBeyond(){
        AirCondition increase = new AirCondition();
        increase.beyond30(32);
        assertEquals(30,increase.beyond30(32));
    }
    @Test
    public void DecreaseTemperatureBelow(){
        AirCondition decrease = new AirCondition();
        decrease.below(14);
        assertEquals(16,decrease.below(14));

    }

}
