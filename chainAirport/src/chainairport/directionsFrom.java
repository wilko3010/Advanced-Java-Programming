
package chainairport;

/**
 *
 * @author Jack
 */
public class directionsFrom extends Directions implements helpDesk {
    helpDesk next;
    final int level = 2;
    /**
     * This method will override the method that is in the class directions.
     * This method will determine if the object will be handled by this method, 
     * if the object is handled in this method, it will print the line 
     * "directions from screen"
     * @param level 
     */
    @Override
    public void chainNumber(int level) {
        if (this.level == level)
        {
            System.out.println("Directions From Screen");
        }
        else 
        {
          next.chainNumber(level);
          System.out.println("directionsFrom does not handle this request");
        }
    }
    /**
     * This method overrides the setNextElement method in the class directions 
     * The method will add a new link onto the chain, setting the next element.
     * @param next 
     */
    @Override
    public void setNextElement(helpDesk next) {
        this.next = next;
    }
    
}
