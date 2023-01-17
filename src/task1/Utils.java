package task1;

public class Utils {

    private final static double[] defaultParams1 = {1.5, 4, 2000, 150};
    private final static String[] defaultParams2 = {"default", "белый", "Россия"};

    private Utils() {
    }

    public static String checkData(String string, int typeParam) {
        if (string == null || string.equals("") || string.trim().equals("")) {
            return defaultParams2[typeParam];
        } else {
            return string;
        }
    }

    public static double checkData(double param, int typeParam) {
        if (param <= 0) {
            return (int) defaultParams1[typeParam];
        } else {
            return param;
        }
    }

}
