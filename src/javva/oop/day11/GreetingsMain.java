package javva.oop.day11;

public class GreetingsMain {

    public static void main(String[] args){

        Greetings gr = new Greetings();

        gr.m1(); //1

        String s = gr.m2(); //2
        System.out.println(s);

        gr.m3("John"); //3

        String var = gr.m4("David"); //4
        System.out.println(var);
    }
}
