
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
public class flightDestinationTest {
    

    /**
     * Test of chainNumber method, of class flightDestination.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        flightDestination instance = new flightDestination();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class flightDestination.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        flightDestination instance = new flightDestination();
        instance.setNextElement(next);

    }
    
}
