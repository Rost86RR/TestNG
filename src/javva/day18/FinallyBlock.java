package javva.day18;

public class FinallyBlock {

    public static void main(String[] args) {

        System.out.println("Program is started....");

        String s = null;

        try
        {
            System.out.println(s.length());
        }
        catch (Exception e) //Exception is super class
        {
            System.out.println("Catch block handled exeption...");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("You entered into finally block");
        }

        System.out.println("Program finished...");

    }
}
