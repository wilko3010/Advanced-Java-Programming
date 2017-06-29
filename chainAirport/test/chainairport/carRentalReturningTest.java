
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
public class carRentalReturningTest {
    


    /**
     * Test of chainNumber method, of class carRentalReturning.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        carRentalReturning instance = new carRentalReturning();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class carRentalReturning.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        carRentalReturning instance = new carRentalReturning();
        instance.setNextElement(next);

    }
    
}
