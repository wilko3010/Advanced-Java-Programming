
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
public class StaffTest {
    

    /**
     * Test of chainNumber method, of class Staff.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        Staff instance = new Staff();
        instance.chainNumber(level);
        
    }

    /**
     * Test of setNextElement method, of class Staff.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        Staff instance = new Staff();
        instance.setNextElement(next);
    }
    
}
