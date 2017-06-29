
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
public class lostLuggageTest {

    /**
     * Test of chainNumber method, of class lostLuggage.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 7;
        lostLuggage instance = new lostLuggage();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class lostLuggage.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        lostLuggage instance = new lostLuggage();
        instance.setNextElement(next);
    }
    
}
