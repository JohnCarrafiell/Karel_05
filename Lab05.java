/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab05 {

     public static void main(String[] args) {
          
          Display.openWorld("maps/shuttle.map");
          Display.setSize(8, 8);
          Display.setSpeed(8);
          
       Racer pete = new Racer(7);
       Racer john = new Racer(4);
       Racer sam = new Racer(1);
       pete.runTheRace();
       john.runTheRace();
       sam.runTheRace();
       
            }
}
