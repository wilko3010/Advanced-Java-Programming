
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
public class carRentalTest {

    /**
     * Test of chainNumber method, of class carRental.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 5;
        carRental instance = new carRental();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class carRental.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        carRental instance = new carRental();
        instance.setNextElement(next);
    }
    
}
