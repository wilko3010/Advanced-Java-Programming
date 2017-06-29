
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
public class lostDepartingTest {
    

    /**
     * Test of chainNumber method, of class lostDeparting.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        lostDeparting instance = new lostDeparting();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class lostDeparting.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        lostDeparting instance = new lostDeparting();
        instance.setNextElement(next);
    }
    
}
