import java.util.Scanner;

public class ConditionThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bob = scanner.nextInt();
        int martin = scanner.nextInt();

       // if (bob > 21){
       //     System.out.println("bob podhodit");
       // } else {
       //     System.out.println(" ne goden");
       // }
       // if (martin > 21){
       //     System.out.println("martin podhodit");
       // } else {
       //     System.out.println("ne goden");
       // }
        // if (bob >= 21 ){
            //     if (martin >= 21){
                //         System.out.println("Оба друга могут идти в клуб");
                //     } else {
                //         System.out.println("Idut domouy");
                //
                //     }
            // }else {
            //     System.out.println(" Идут домой");
            // }

        if (bob >= 21 && martin >= 21){
            System.out.println(" idut v club");
        } else {
            System.out.println(" ne idut v club");
        }

    }
}
