
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
public class ticketLostTest {
    

    /**
     * Test of chainNumber method, of class ticketLost.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        ticketLost instance = new ticketLost();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class ticketLost.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        ticketLost instance = new ticketLost();
        instance.setNextElement(next);
    }
    
}
