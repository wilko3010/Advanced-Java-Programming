
package chainairport;

/**
 *
 * @author Jack
 */
public class Staff implements helpDesk {
    helpDesk next; //This link of the chain holds a reference to the next link 
    final int level = 2;//This is the second link of the chain
/**
 * This method overrides the chainNumber method in the helpDesk interface. The 
 * method will open up a screen with the heading Staff, which will have more 
 * details about members of staff.
 * @param level 
 */
    @Override
    public void chainNumber(int level) {
        if (this.level == level)
        {
            System.out.println("Staff Screen");//If this link handles the object, this line will be displayed
        }
        else 
        {
          next.chainNumber(level);//If this link does not handle the object, it passes the object to the next link
          System.out.println("Staff does not handle this request");
        }
    }
    /**
     * This method overrides the setNextElement method in the helpDesk interface
     * The method will add a new link onto the chain, setting the next element.
     * @param next 
     */
    @Override
    public void setNextElement(helpDesk next) {
        this.next = next;
    }
    
}
