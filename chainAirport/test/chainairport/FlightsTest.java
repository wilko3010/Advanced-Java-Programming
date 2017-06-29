
package chainairport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack
 */
public class FlightsTest {

    /**
     * Test of chainNumber method, of class Flights.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 3;
        Flights instance = new Flights();
        instance.chainNumber(level);
        
    }

    /**
     * Test of setNextElement method, of class Flights.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        Flights instance = new Flights();
        instance.setNextElement(next);
    }
    
}
