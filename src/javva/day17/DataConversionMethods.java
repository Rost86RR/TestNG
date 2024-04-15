package javva.day17;

public class DataConversionMethods {

    public static void main(String[] args) {

        // String --> int --------------------------------------------------------------------

        //String s = "welcome"; - cannot convert to int

        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        // String --> double ------------------------------------------------------------------

        String s3 = "10.5";
        String s4 = "20.0";
        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

        // String --> Boolean -----------------------------------------------------------------

        String s5 = "true";
        String s6 = "false";
        String s7 = "anything";
        System.out.println(Boolean.parseBoolean(s5));
        System.out.println(Boolean.parseBoolean(s6));
        System.out.println(Boolean.parseBoolean(s7));

        // int, bool, double, char ---> String ------------------------------------------------

        int a = 10;
        boolean b = true;
        char c = 'A';
        double d = 10.5;

        String s8 = String.valueOf(a);
        System.out.println(s8);

        String s9 = String.valueOf(b);
        System.out.println(s9);

        String s10 = String.valueOf(c);
        System.out.println(s10);

        String s11 = String.valueOf(d);
        System.out.println(s11);
    }
}
