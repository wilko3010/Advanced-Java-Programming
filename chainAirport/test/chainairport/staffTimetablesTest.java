
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
public class staffTimetablesTest {
    

    /**
     * Test of chainNumber method, of class staffTimetables.
     */
    @Test
    public void testChainNumber() {
        System.out.println("chainNumber");
        int level = 1;
        staffTimetables instance = new staffTimetables();
        instance.chainNumber(level);
    }

    /**
     * Test of setNextElement method, of class staffTimetables.
     */
    @Test
    public void testSetNextElement() {
        System.out.println("setNextElement");
        helpDesk next = null;
        staffTimetables instance = new staffTimetables();
        instance.setNextElement(next);
    }
    
}
