import java.util.Scanner;

public class ConditionFouth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 16 && age < 65) {
            System.out.println(" Idi rabotau");
        } else if (age < 16) {
            System.out.println(" poka rano ratati");
        } else {
            System.out.println(" pozno");
        }
    }
}