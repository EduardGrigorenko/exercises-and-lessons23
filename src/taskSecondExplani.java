import java.util.Scanner;

public class taskSecondExplani {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        x -= 4;
        int lastnamber = x % 10;
        boolean answer = (lastnamber == 0);
        System.out.println(answer);

    }
}