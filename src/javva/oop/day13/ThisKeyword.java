package javva.oop.day13;

public class ThisKeyword {

    int x, y; // class variables/instance variables

    ThisKeyword(int x, int y) // local variables
    {
        this.x = x;
        this.y = y;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {

        ThisKeyword th = new ThisKeyword(10, 20);
        th.display();
    }
}
