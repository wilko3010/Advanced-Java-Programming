
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
public class flightNumberTest {
    

    /**
     * Test of chainNumber method, of class flightNumber.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        flightNumber instance = new flightNumber();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class flightNumber.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        flightNumber instance = new flightNumber();
        instance.setNextElement(next);
    }
    
}
