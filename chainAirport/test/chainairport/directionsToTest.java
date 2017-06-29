
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
public class directionsToTest {
    

    /**
     * Test of chainNumber method, of class directionsTo.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        directionsTo instance = new directionsTo();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class directionsTo.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        directionsTo instance = new directionsTo();
        instance.setNextElement(next);
    }
    
}
