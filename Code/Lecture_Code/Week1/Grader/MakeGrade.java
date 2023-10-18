public class MakeGrade {
    public static void main(String[] args) {

        int score;
        score = Integer.parseInt(args[0]);

        if (score == 97) {
            System.out.println("Fail");
        } else if (score >= 80) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    
}
