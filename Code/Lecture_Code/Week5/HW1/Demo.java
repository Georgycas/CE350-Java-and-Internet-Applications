import java.util.Vector;

public class Demo {
   public static void main (String argv[])
   {
      System.out.println("\nExperiment clone ...");
      Palm palm= new Palm(15);
      System.out.println(palm); // print "Size of palm is 15"
      Palm palm1= palm;
      palm1.setSize(20);
      System.out.println(palm); // print "Size of palm is 20"
      Palm palm2= (Palm)palm.clone();
      palm2.setSize(30);
      System.out.println(palm); // print "Size of palm is 20"

      
      Vector fingers = new Vector();
      fingers.addElement(new Finger(3));
      fingers.addElement(new Finger(4));
      fingers.addElement(new Finger(5));

      System.out.println("\nDisplay information about Hand ...");
      Hand p = new Hand(palm, fingers);
      System.out.println(p);
   }
}