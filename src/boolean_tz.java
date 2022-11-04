public class boolean_tz {
    public static void main(String[] args) {
        boolean reining = true; //false
        System.out.println(reining);
        reining = false;
        System.out.println(reining);
        reining = true;
        System.out.println(reining);

        int bowlingStrike = 10;
        int meScore = 10;
        boolean cdnIgetStrake = (meScore == bowlingStrike);
        System.out.println(cdnIgetStrake);

        double meTempersture = 37.5;
        double normalTemperature = 36.5;
        boolean ill = meTempersture > normalTemperature;
        System.out.println(ill);

        System.out.println("________________");

        int firstPersona = 181;
        int secondPersona = 181;
        boolean similar = (firstPersona != secondPersona);

        System.out.println(similar);

        // > - больше
        // < - меньше
        // == - равно
        // != - не равно
        // ! - отрицание
        // <= - меньше равно
        // >= - больше равно

        System.out.println("______________");

        int doPohoda = 1000;
        int poslePjhoda = 1000;
        boolean vasyaBoughtSomething = (poslePjhoda < doPohoda);
        System.out.println(vasyaBoughtSomething);

        double petya = 3.49;
        int chetverti = 5;
        petya++;
        boolean vuslo = (petya >= chetverti);
        System.out.println(vuslo);
    }
}