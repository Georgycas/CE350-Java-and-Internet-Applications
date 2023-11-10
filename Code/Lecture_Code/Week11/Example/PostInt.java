class Zero extends Exception {
    public Zero() {
    }
}

class Negative extends Exception {
    private int i;

    public Negative(int i1) {
        i = i1;
    }

    public int getI() {
        return i;
    }
}

class PosInt {
    private int i;

    public PosInt(int i1) throws Negative, Zero {
        if (i1 < 0)
            throw new Negative(i1);
        else if (i1 == 0)
            throw new Zero();
        else
            i = i1;
    }

    public void setI(int i1) throws Negative, Zero {
        if (i1 < 0)
            throw new Negative(i1);
        else if (i1 == 0)
            throw new Zero();
        else
            i = i1;
    }

public class Demo {
    public static void main(String argv[]) {
        try {
            PosInt p = new PosInt(2);
            p.setI(3);
            p.setI(-2); // This line will cause an exception
            p.setI(0); // This line will not be executed.
        } catch (Negative n) {
            System.out.println("Error in setting " + n.getI());
        } catch (Zero n) {
            System.out.println("Error in setting 0");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }
    }
}



}

