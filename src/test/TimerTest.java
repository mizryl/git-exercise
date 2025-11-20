package src.test;
import org.junit.Test;

import src.main.Timer;

import static org.junit.Assert.*;


public class TimerTest {

    @Test
    public void testFormattedTime() {
        Timer timer = new Timer();
        timer.setMinute(3);
        timer.setSecond(5);

        assertEquals("03:05", timer.getFormatedTime());
    }
    
    @Test
    public void testCountdownOneSecond() {
        Timer timer = new Timer();
        timer.setMinute(0);
        timer.setSecond(3);
        
        timer.updateTimerCountdown();

        assertEquals(0, timer.getMinute());
        assertEquals(2, timer.getSecond());

    }


}

