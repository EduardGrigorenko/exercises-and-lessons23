import java.util.Scanner;

public class grendma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Напиши сколько ты работала");
        int workTame = s.nextInt();
        System.out.println(workTame * 100);
        int pension = workTame * 100;
        System.out.println("Вот сколько ты денег получишь: " + pension +" Евро");





    }
}
