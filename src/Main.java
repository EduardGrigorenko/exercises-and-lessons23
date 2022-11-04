public class Main {
    public static void main(String[] args) {
        double salaryForhour =5.6;
        int  hoursPerDay =12;
        int days =364;
        System.out.println( salaryForhour * hoursPerDay * days);

        System.out.println("______________");

        double cashFromWork = salaryForhour * hoursPerDay * (days -14);

        System.out.println(cashFromWork);

        double vacationManey = salaryForhour * hoursPerDay * 14 / 2;
        System.out.println( vacationManey);
        System.out.println( cashFromWork + vacationManey);
    }
}