import java.util.Vector;
class Palm implements Cloneable {
    private int size;
    public Palm(int size1) {
        this.size = size1;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isLarge() {
        return size > 50;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Palm palm = (Palm) obj;
        return size == palm.size;
    }

    public String toString() {
        return "Size of palm is " + size;
    }

    public void setSize(int i) {
    }
}

class Finger implements Cloneable {
    private int len;

    public Finger(int len1) {
        this.len = len1;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isLong() {
        return len > 30;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Finger finger = (Finger) obj;
        return len == finger.len;
    }

    public String toString() {
        return "Length of finger is " + len;
    }
}


class Hand implements Cloneable {
    private Palm palm;
    private Vector<Finger> fingers;

    public Hand(Palm palm1, Vector<Finger> fingers1) {
        this.palm = (Palm) palm1.clone();
        this.fingers = new Vector<Finger>(fingers1);
    }

    public Object clone() {
        try {
            Hand cloned = (Hand) super.clone();
            cloned.palm = (Palm) this.palm.clone();
            cloned.fingers = new Vector<Finger>(this.fingers);
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public boolean isNormal() {
        return fingers.size() == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hand hand = (Hand) obj;
        return palm.equals(hand.palm) && fingers.equals(hand.fingers);
    }

    public Palm getPalm() {
        return palm;
    }

    public Finger getFinger(int i) {
        return fingers.get(i);
    }

    public Vector<Finger> getFingers() {
        return fingers;
    }

    public int numOfFingers() {
        return fingers.size();
    }

    public void lostOneFinger(int index) {
        fingers.remove(index);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(palm.toString()).append("\n");
        for (int i = 0; i < fingers.size(); i++) {
            sb.append("Finger ").append(i).append(": ").append(fingers.get(i)).append("\n");
        }
        return sb.toString();
    }
}


/* Will display

Experiment clone ...
Size of palm is 15
Size of palm is 20
Size of palm is 20

Display information about Hand ...
Size of palm is 20
Finger 0: Length of finger is 3
Finger 1: Length of finger is 4
Finger 2: Length of finger is 5

*/
public class Demon {
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