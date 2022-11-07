import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи сколько у тебя было денег вчера");
        long maneyYesterday  = s.nextLong();
        int billmultipliesTheBudget = 5;
        int loses = 100_000_000;
        int  multiplies = 2;


        System.out.println(((maneyYesterday * billmultipliesTheBudget) - loses) * multiplies + " Столько денег у тебя сегодня Билл");
        System.out.println();
    }
}
