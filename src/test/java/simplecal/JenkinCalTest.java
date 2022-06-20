package simplecal;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JenkinCalTest {
    @Test
    public void addTest(){
        JenkinCal jenkinCal = new JenkinCal();
        assertEquals(5, jenkinCal.addNumbers(2, 3));
    }

    @Test
    public  void substractTest(){
        JenkinCal jenkinCal = new JenkinCal();
        assertEquals(5 , jenkinCal.substractNumbers(10 , 5));
    }
}
