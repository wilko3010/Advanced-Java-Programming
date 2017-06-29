
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
public class flightComplaintsTest {
    

    /**
     * Test of chainNumber method, of class flightComplaints.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        flightComplaints instance = new flightComplaints();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class flightComplaints.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        flightComplaints instance = new flightComplaints();
        instance.setNextElement(next);

    }
    
}
