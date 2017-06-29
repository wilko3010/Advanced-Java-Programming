
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
public class ticketDetailsTest {
    

    /**
     * Test of chainNumber method, of class ticketDetails.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        ticketDetails instance = new ticketDetails();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class ticketDetails.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        ticketDetails instance = new ticketDetails();
        instance.setNextElement(next);
    }
    
}
