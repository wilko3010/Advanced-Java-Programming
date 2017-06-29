
package chainairport;

/**
 *
 * @author Jack
 */
public class staffTimetables extends Staff implements helpDesk {
    helpDesk next;
    final int level = 1;
    /**
     * This method will override the method that is in the class staff.
     * This method will determine if the object will be handled by this method, 
     * if the object is handled in this method, it will print the line 
     * "staff timetables screen"
     * @param level 
     */
    @Override
    public void chainNumber(int level) {
        if (this.level == level)
        {
            System.out.println("Staff Timetables Screen");
        }
        else 
        {
          next.chainNumber(level);
          System.out.println("staffTimetable does not handle this request");
        }
    }
    /**
     * This method overrides the setNextElement method in the class Staff 
     * The method will add a new link onto the chain, setting the next element.
     * @param next 
     */
    @Override
    public void setNextElement(helpDesk next) {
        this.next = next;
    }
    
}
