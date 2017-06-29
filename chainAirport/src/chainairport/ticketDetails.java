
package chainairport;

/**
 *
 * @author Jack
 */
public class ticketDetails extends Tickets implements helpDesk {
    helpDesk next;
    final int level = 2;
    /**
     * This method will override the method that is in the class tickets.
     * This method will determine if the object will be handled by this method, 
     * if the object is handled in this method, it will print the line 
     * "ticket details screen"
     * @param level 
     */
    @Override
    public void chainNumber(int level) {
        if (this.level == level)
        {
            System.out.println("Ticket Details Screen");
        }
        else 
        {
          next.chainNumber(level);
          System.out.println("ticketDetails does not handle this request");
        }
    }
    /**
     * This method overrides the setNextElement method in the class tickets 
     * The method will add a new link onto the chain, setting the next element.
     * @param next 
     */
    @Override
    public void setNextElement(helpDesk next) {
        this.next = next;
    }
    
}
