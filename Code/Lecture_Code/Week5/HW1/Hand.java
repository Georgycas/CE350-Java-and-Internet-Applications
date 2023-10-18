import java.util.Vector;

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
