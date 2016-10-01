
public class UtilityOperations {

    public static int overflow(int t) {

        int oDigit = 0;
        String format_str = String.format("%08d", t);

        String subStr;
        int length = 8;
        subStr = format_str.substring(4, length);
        oDigit = Integer.parseInt(subStr);

        return oDigit;

    }

    public static int underflow(int t) {
        int oDigit = 0;
        String format_str = String.format("%08d", t);

        String subStr;
        subStr = format_str.substring(0, 4);
        oDigit = Integer.parseInt(subStr);

        return oDigit;
    }

    public static int digits(int t) {
        String s = new Integer(t).toString();
        int digit = s.length();
        return digit;
    }

}
