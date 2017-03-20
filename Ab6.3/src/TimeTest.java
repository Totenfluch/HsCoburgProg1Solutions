
public class TimeTest {



   public static void main(String[] args)
   {
      Time time1 = new Time(13,46,56);
      Time time2 = new Time(time1);
      Time time3 = new Time();


      System.out.println("Time1: " + time1.toString());
      System.out.println("Time2: " + time2.toString());
      System.out.println("Time2: " + time2.toString());
   
      while(true){
    	  time1.tick();
    	  time2.tick();
    	  time3.tick();
    	  System.out.println("Time 1:  " + time1.toString());
    	  System.out.println("Time 2:  " + time2.toString());
    	  System.out.println("Time 3:  " + time3.toString());
      }
   }

}  // end class TimeTest

