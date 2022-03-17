package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    private Television tv;
    @BeforeEach
    public void StartWithThis(){
        tv = new Television();
    }
    @Test
    public void TvOn(){
        assertFalse(tv.isOn());
        tv.setPower();
        assertTrue(tv.isOn());
        
    }

    @Test
    public void TvOff(){
        tv.setPower();
        assertTrue(tv.isOn());
        tv.setPower();
        assertFalse(tv.isOn());

    }

    @Test
    public void televisionChannel(){
        tv.setChannel(7);
        assertEquals(7, tv.getChannel());
    }

    @Test
    public void increaseTelevisionChannel(){
        tv.setChannelToIncrease(10);
        assertEquals(11, tv.getIncreaseChannel());
    }
    
    @Test
    public void decreaseTelevisionChannel(){
        tv.setChannelToDecrease(20);
        assertEquals(19, tv.getDecreaseChannel());
    }

    @Test
    public void increaseTelevisionVolume(){
        tv.setVolumeToIncrease(10);
        assertEquals(10, tv.getIncreaseVolume(10));
    }

    @Test
    public void decreaseTelevisionVolume(){
        tv.setVolumeToDecrease(16);
        assertEquals(15, tv.getDecreaseVolume());
    }

    @Test
    public void manufacturer(){
        tv.getManufacturer();
        assertEquals("SONY", tv.getManufacturer());
    }

    @Test
    public void screenSize(){
        tv.getScreenInches();
        assertEquals(5.6, tv.getScreenInches());
    }



}
