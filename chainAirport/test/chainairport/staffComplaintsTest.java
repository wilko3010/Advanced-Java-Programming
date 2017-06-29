
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
public class staffComplaintsTest {
    

    /**
     * Test of chainNumber method, of class staffComplaints.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        staffComplaints instance = new staffComplaints();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class staffComplaints.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        staffComplaints instance = new staffComplaints();
        instance.setNextElement(next);

    }
    
}
