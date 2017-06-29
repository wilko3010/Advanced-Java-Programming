
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
public class flightCompanyTest {
    

    /**
     * Test of chainNumber method, of class flightCompany.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 3;
        flightCompany instance = new flightCompany();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class flightCompany.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        flightCompany instance = new flightCompany();
        instance.setNextElement(next);

    }
    
}
