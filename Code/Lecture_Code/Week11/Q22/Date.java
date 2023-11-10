class ErrorCode extends Exception {
    private int code;
    
    public ErrorCode(int i1) {
        code = i1;
    }
    
    public int getCode() {
        return code;
    }
}

class Zero extends ErrorCode {
    public Zero() {
        super(1);
    }
}

class Negative extends ErrorCode {
    private int i;
    
    public Negative(int i1) {
        super(2);
        i = i1;
    }
    
    public int getI() {
        return i;
    }
}

class Above extends ErrorCode{
    private int i;
    
    public Above(int i1){
        super(3);
        i = i1;
    }
    
    public int getI(){
        return i;
    }
}

class PosInt {
    private int i;
    
    public PosInt(int i1) throws Negative, Zero, Above {
        if (i1 < 0)
            throw new Negative(i1);
        else if (i1 > 9)
            throw new Above(i1);
        else if (i1 == 0 || i1 == 1 || i1 ==2)
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
}

public class Demo {
    public static void main(String argv[]) {
        try {
            PosInt p = new PosInt(2);
            p.setI(3);
            p.setI(-2); // This line will cause an exception
            p.setI(0);  // This line will not be executed.
        } catch (Negative n) {
            System.out.println("Error " +
                    n.getCode() + ": " +
                    "Error in setting " + n.getI());
        } catch (Zero n) {
            System.out.println("Error " +
                    n.getCode() + ": " +
                    "Error in setting 0");
        }catch (Above n){
            System.out.println("Error " +
                    n.getCode() + ": " +
                    "Error in setting above" + n.getI());
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }
    }
}
