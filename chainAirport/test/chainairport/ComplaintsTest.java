
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
public class ComplaintsTest {
    

    /**
     * Test of chainNumber method, of class Complaints.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        Complaints instance = new Complaints();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class Complaints.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        Complaints instance = new Complaints();
        instance.setNextElement(next);
        
    }
    
}
