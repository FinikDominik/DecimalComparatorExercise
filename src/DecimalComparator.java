public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int checkNumber1 = (int) (a * 1000);
        int checkNumber2 = (int) (b * 1000);
        if (checkNumber1 - checkNumber2 == 0) {
            System.out.println("thrue, " + a + ", " + b);
            return true;
        } else
            System.out.println("false, " + a + ", " + b);
            return false;
    }

}
