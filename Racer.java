/**
*  <Describe that the Racer class does>
*
*  @author <your name here, no brackets>
*  @version <version or date, no brackets>
*/
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete {
 
 public Racer(int y)
   {
   super(1, y, Display.EAST, Display.INFINITY);
   }
   public void jumpRight()
   {
   turnLeft();
   move();
   turnRight();
   move();
   turnRight();
   move();
   turnLeft();
   }
   public void jumpLeft()
   {
   turnRight();
   move();
   turnLeft();
   move();
   turnLeft();
   move();
   turnRight();
   }
   public void sprint (int n)
   {
      for(int k=1; k<= n; k++)
      move();
   }
   public void putBeeper (int n)
   {
   for(int k=1; k<= n; k++)
      putBeeper();
   }
   public void pickBeeper (int n)
   {
   for(int k=1; k<= n; k++)
      pickBeeper();
   }   
   public void shuttle6()
   {
      move();
      jumpRight();
      sprint(6);
      pickBeeper(3);
      turnAround();
      sprint(6);
      jumpLeft();
      move();
      putBeeper(3);
      turnAround(); 
   } 
   public void shuttle4()
   {
      move();
      jumpRight();
      sprint(4);
      pickBeeper(5);
      turnAround();
      sprint(4);
      jumpLeft();
      move();
      putBeeper(5);
      turnAround();
   }
   public void shuttle2()
   {
      move();
      jumpRight();
      sprint(2);
      pickBeeper(7);
      turnAround();
      sprint(2);
      jumpLeft();
      move();
      putBeeper(7);
      turnAround();
      move();
   }
   public void runTheRace()
   {
      shuttle6();
      shuttle4();
      shuttle2();
   
   }
    
}
