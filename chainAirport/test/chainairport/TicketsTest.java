
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
public class TicketsTest {
    

    /**
     * Test of chainNumber method, of class Tickets.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 4;
        Tickets instance = new Tickets();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class Tickets.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        Tickets instance = new Tickets();
        instance.setNextElement(next);
    }
    
}
