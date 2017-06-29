
package chainairport;

/**
 *
 * @author Jack
 */
/**
 * This interface will create the methods that will be used in the chain design 
 * pattern. The chainNumber method will be used when an object is passed into the chain
 * and it will determine which class will handle the object message. The setNextElement 
 * method will add a new link onto the end of the chain and it will determine which class will
 * be used next in the chain
 * 
 */
public interface helpDesk {
    
    public void chainNumber(int level); //This method is used to determin which class handles the object
    public void setNextElement(helpDesk next); //This method is used to set the next link of the chain 
    
}
