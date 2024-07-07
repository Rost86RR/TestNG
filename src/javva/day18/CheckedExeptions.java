package javva.day18;

public class CheckedExeptions {

    public static void main(String[] args){

        System.out.println("program started...");
        System.out.println("program in progres...");

        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {

        }
        System.out.println("program finished...");
        System.out.println("program exited...");
    }
}
