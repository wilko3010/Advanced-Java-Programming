
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
public class staffLocationTest {
    

    /**
     * Test of chainNumber method, of class staffLocation.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        staffLocation instance = new staffLocation();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class staffLocation.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        staffLocation instance = new staffLocation();
        instance.setNextElement(next);

    }
    
}
