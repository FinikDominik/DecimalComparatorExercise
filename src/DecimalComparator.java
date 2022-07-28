public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        float checkNumber1 = (float) (a * 100);
        float checkNumber2 = (float) (b * 100);
        if (checkNumber1 - checkNumber2 == 0) {
            System.out.println("thrue, " + a + ", " + b);
            return true;
        } else
            System.out.println("false, " + a + ", " + b);
            return false;
    }

}
