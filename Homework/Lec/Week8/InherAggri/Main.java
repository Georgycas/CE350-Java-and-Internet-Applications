public class Main {
    public static void main(String[] args) {
        try {
            // Creating B, F, D, A, and E objects
            B b = new B(1);
            F f = new F(2);
            D d = new D(4);
            A a = new A("jack", b, f);
            E eObj = new E(3, d, a);

            // Displaying the values of all the attributes of eObj
            System.out.println("Original eObj: " + eObj);

            // Changing the values of eObj
            eObj.getA().getB().setB(4);
            eObj.getA().getF().setF(5);
            eObj.setE(6);
            eObj.getD().setD(7);

            // Displaying the values of all the attributes of eObj after changes
            System.out.println("Updated eObj: " + eObj);

            // Cloning eObj to create eObj1
            E eObj1 = eObj.clone();

            // Displaying the values of all the attributes of eObj1
            System.out.println("Cloned eObj1: " + eObj1);

            // Checking whether eObj is equal to eObj1
            System.out.println("Is eObj equal to eObj1? " + eObj.equals(eObj1));

        } catch (CloneNotSupportedException e) {
            System.err.println("Clone not supported: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
