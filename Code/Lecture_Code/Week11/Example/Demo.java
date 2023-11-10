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
