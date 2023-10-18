public class sums {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide numbers to sum as command line arguments.");
            return;
        }

        int total = 0;
        for (String arg : args) {
            try {
                total += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("'" + arg + "' is not a valid integer.");
                return;
            }
            
        }
        
        System.out.println("Sum: " + total);
    }
}
