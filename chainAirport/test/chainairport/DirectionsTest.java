
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
public class DirectionsTest {

    /**
     * Test of chainNumber method, of class Directions.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 6;
        Directions instance = new Directions();
        instance.chainNumber(level);

    }

    /**
     * Test of setNextElement method, of class Directions.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        Directions instance = new Directions();
        instance.setNextElement(next);
    }
    
}
