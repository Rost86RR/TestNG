package javva.day17;

public class DataConversionMethods {

    public static void main(String[] args) {

        // String --> int --------------------------------------------------------------------

        //String s = "welcome"; - cannot convert to int

        String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
    }
}
