
package chainairport;
import java.util.Scanner;

/**
 *
 * @author Jack - p4063103
 */
public class ChainAirport {

    /**
     * @param args the command line arguments
     * The main method creates the objects to be passed into the chain and it
     * then sets which element of the chain will be next in the line of the 
     * chain
     *
     */
    
    public static void main(String[] args) {
        //The elements are being instantiated
        helpDesk hD1 = new Complaints();
        helpDesk hD2 = new Staff();
        helpDesk hD3 = new Flights();
        helpDesk hD4 = new Tickets();
        helpDesk hD5 = new carRental();
        helpDesk hD6 = new Directions();
        helpDesk hD7 = new lostLuggage();
        helpDesk hD8 = new staffComplaints();
        helpDesk hD9 = new flightComplaints();
        helpDesk hD10 = new staffTimetables();
        helpDesk hD11 = new staffLocation();
        helpDesk hD12 = new flightNumber();
        helpDesk hD13 = new flightDestination();
        helpDesk hD14 = new flightCompany();
        helpDesk hD15 = new ticketLost();
        helpDesk hD16 = new ticketDetails();
        helpDesk hD17 = new carRentalGive();
        helpDesk hD18 = new carRentalReturning();
        helpDesk hD19 = new directionsTo();
        helpDesk hD20 = new directionsFrom();
        helpDesk hD21 = new lostArriving();
        helpDesk hD22 = new lostDeparting();
        //The classes are being chained together
        hD1.setNextElement(hD2);
        hD2.setNextElement(hD3);
        hD3.setNextElement(hD4);
        hD4.setNextElement(hD5);
        hD5.setNextElement(hD6);
        hD6.setNextElement(hD7);
        hD8.setNextElement(hD9);
        hD10.setNextElement(hD11);
        hD12.setNextElement(hD13);
        hD13.setNextElement(hD14);
        hD15.setNextElement(hD16);
        hD17.setNextElement(hD18);
        hD19.setNextElement(hD20);
        hD21.setNextElement(hD22);
        //The scanner is asking the client which area they need
        Scanner clientInput = new Scanner(System.in);
        System.out.println("1: Complaints"
                + " 2: Staff"
                + " 3: Flights"
                + " 4: Tickets"
                + " 5: Car Rental"
                + " 6: Directions"
                + " 7: Lost Luggage");
        int nextInt = clientInput.nextInt();
        //Passing an element into the first link of the chain
        hD1.chainNumber(nextInt);
        //these if statements will set the chain of chains
        if (nextInt == 1) {
            clientInput = new Scanner(System.in);
            System.out.println("1: Staff Complaints"
                    + " 2: Flight Complaints");
            hD1.setNextElement(hD8);
            nextInt = clientInput.nextInt();
            hD8.chainNumber(nextInt);
        }
        
        if (nextInt == 2) {
            clientInput = new Scanner(System.in);
            System.out.println("1: Staff Timetables"
                    + " 2: Staff Location");
            hD2.setNextElement(hD10);
            nextInt = clientInput.nextInt();
            hD10.chainNumber(nextInt);
        }
        if (nextInt == 3) {
            clientInput = new Scanner(System.in);
            System.out.println("1: Flight Number"
                    + " 2: Flight Destination"
                    + " 3: Flight Company");
            hD3.setNextElement(hD12);
            
            nextInt = clientInput.nextInt();
            hD12.chainNumber(nextInt);  
        }
        if (nextInt == 4) { 
            clientInput = new Scanner(System.in);
            System.out.println("1: Lost Ticket"
                    + " 2: Ticket Details");
            hD4.setNextElement(hD15);
            nextInt = clientInput.nextInt();
            hD15.chainNumber(nextInt);
        }
        if (nextInt == 5) {
            clientInput = new Scanner(System.in);
            System.out.println("1: Giving Car Rental"
                    + " 2: Returning Car Rental");
            hD5.setNextElement(hD17);
            nextInt = clientInput.nextInt();
            hD17.chainNumber(nextInt);
        }
        if (nextInt == 6) { 
            clientInput = new Scanner(System.in);
            System.out.println("1: Directions To"
                    + " 2: Directions From");
            hD6.setNextElement(hD19);
            nextInt = clientInput.nextInt();
            hD19.chainNumber(nextInt);
        }
        if (nextInt == 7) {
            clientInput = new Scanner(System.in);
            System.out.println("1: Lost Luggage Arriving"
                    + " 2: Lost Luggage Departing");
            hD7.setNextElement(hD21);
            nextInt = clientInput.nextInt();
            hD21.chainNumber(nextInt);
        }
        }
        
}
