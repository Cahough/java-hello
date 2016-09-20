/*
Carter Hough
09.15.16
CSCI 310 - Java
Hello World
Dr. MacEvoy
 
TimezoneClock.java
*/

package helloworld;

import static kiss.API.*;

public class TimezoneClock extends Clock
{
    double timezoneShift = 0.0;
    @Override
    double getHours()
    {
        
    }
    
    void testGetTime2()
    {
        Clock clock = new TimezoneClock();
        double hours = clock.getHours();
        double minutes = clock.getMinutes();
        double seconds = clock.getSeconds();
    }
    
    void testGetCorrectTime2()
    {
        Clock clock = new TimezoneClock();
        clock.setHours(6.5);
        assert clock.getHours() == 6.5;
        assert clock.getMinutes() == 30.0;
        assert clock.getSeconds() == 0.0;
    }
    
    void testGetFlowingTime2()
    {
        Clock clock = new TimezoneClock();
        clock.setHours(1.00);
        clock.start();
        pause(1.0);
        double now = clock.getHours();
        double shouldBe = 1.00 + 1.0/3600.0;
        assert abs(now-shouldBe) < 0.1/3600.0;
    }
}
