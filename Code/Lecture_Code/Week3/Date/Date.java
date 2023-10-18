package Date;
public class Date{
    private int day;
    private int month;
    private int year;

    // Constructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // Getters
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    // Setters
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    // Predicate function to check if it's New Year's Eve
    public boolean isEve(){
        return (day == 31 && month == 12);
    }
    // Predicate function to check if it's Christmas
    public boolean isChristmas(){
        return (day == 25 && month == 12);
    }
    // Predicate function to check if it's Halloween
    public boolean isHalloween(){
        return (day == 31 && month == 10);
    }
    // Predicate function to check if it's Valentine's Day
    public boolean isValentine(){
        return (day == 14 && month == 2);
    }
    // Predicate function to check if it's April Fool's Day
    public boolean isAprilFools(){
        return (day == 1 && month == 4);
    }
    // Predicate function to check if it's my birthday
    public boolean isBirthday(){
        return (day == 12 && month == 3);
    }
    // Predicate function to check if it's a holiday
    public boolean isHoliday(){
        return (isEve() || isChristmas() || isHalloween() || isValentine() || isAprilFools() || isBirthday());
    }
    // Predicate function to check if it's a leap year
    public boolean isLeapYear(){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    // Implementor function to calculate the N-th day of the year
    public int calculateAccumulatedDate(){ 
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int accumulatedDate = day;
        for(int i = 1; i < month; i++){
            accumulatedDate += daysInMonth[i];
        }
        return accumulatedDate;
    }


public static void main (String[] args){
    Date today = new Date(17,10,2023);
    Date tommorow = new Date(18,10,2023);

    //Disp;ay the content of these two objects
    System.out.println("Today is " + today.getDay() + "/" + today.getMonth() + "/" + today.getYear());
    System.out.println("Tommorow is " + tommorow.getDay() + "/" + tommorow.getMonth() + "/" + tommorow.getYear());

    if (today.isHoliday()){
        System.out.println("Today is a holiday");
    }
    else{
        System.out.println("Today is not a holiday");
    }

    if(tommorow.isHoliday()){
        System.out.println("Tommorow is a holiday");
    }
    else{
        System.out.println("Tommorow is not a holiday");
    }

    int nDay = today.calculateAccumulatedDate();
    System.out.println("Today is the " + nDay + "th day of the year");

}}