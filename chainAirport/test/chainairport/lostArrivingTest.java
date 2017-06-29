
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
public class lostArrivingTest {
    

    /**
     * Test of chainNumber method, of class lostArriving.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        lostArriving instance = new lostArriving();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class lostArriving.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        lostArriving instance = new lostArriving();
        instance.setNextElement(next);
    }
    
}
