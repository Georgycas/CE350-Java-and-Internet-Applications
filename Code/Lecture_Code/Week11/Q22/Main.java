public class Main {
    public static void main(String[] args) {
        try {
            Date d1 = new Date(1993, 3, 34);
            System.out.println("Error " + d1.getCode() + ": Illegal day " + d1.getDay() + " for " + d1.getMonth());
        } catch (ErrorDay e) {
            System.out.println("Error " + e.getCode() + ": Illegal day " + e.getDay() + " for " + e.getMonth());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        try {
            Date d110 = new Date(1993, -1, 34);
            System.out.println("Error " + d110.getCode() + ": " + d110.getMonth());
        } catch (ErrorMonth e) {
            System.out.println("Error " + e.getCode() + ": " + e.getMonth());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        try {
            Date d2 = new Date(1993, 2, 29);
            System.out.println(
                    "Error " + d2.getCode() + ": Illegal day " + d2.getDay() + " for February in " + d2.getYear());
        } catch (Error28Day e) {
            System.out.println(
                    "Error " + e.getCode() + ": Illegal day " + e.getDay() + " for February in " + e.getYear());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        try {
            Date d3 = new Date(1993, 13, 25);
            System.out.println("Error " + d3.getCode() + ": " + d3.getMonth());
        } catch (ErrorMonth e) {
            System.out.println("Error " + e.getCode() + ": " + e.getMonth());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        try {
            Date d6 = new Date(1988, 12, 32);
            System.out.println("Error " + d6.getCode() + ": Illegal day " + d6.getDay() + " for " + d6.getMonth());
        } catch (ErrorDay e) {
            System.out.println("Error " + e.getCode() + ": Illegal day " + e.getDay() + " for " + e.getMonth());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }

        try {
            Date d7 = new Date(1993, 4, 31);
            System.out.println("Error " + d7.getCode() + ": Illegal day " + d7.getDay() + " for " + d7.getMonth());
        } catch (ErrorDay e) {
            System.out.println("Error " + e.getCode() + ": Illegal day " + e.getDay() + " for " + e.getMonth());
        } catch (Exception e) {
            System.out.println("Unknown error");
        }
    }
}
