
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
public class directionsFromTest {
    

    /**
     * Test of chainNumber method, of class directionsFrom.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 2;
        directionsFrom instance = new directionsFrom();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class directionsFrom.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        directionsFrom instance = new directionsFrom();
        instance.setNextElement(next);
    }
    
}
