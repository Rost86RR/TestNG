package javva.oop.day14.inheritance.types;
// multi level
class C
{
    int c = 100;
    void displayC()
    {
        System.out.println(c);
    }
}

class D extends C
{
    int d = 200;
    void showD()
    {
        System.out.println(d);
    }
}

class E extends D
{
    int e = 300;
    void printE()
    {
        System.out.println(e);
    }
}
public class InheritanceMulti {

    public static void main(String[] args) {

        E eobj = new E();

        System.out.println(eobj.c);
        System.out.println(eobj.d);
        System.out.println(eobj.e);

        eobj.displayC();
        eobj.showD();
        eobj.printE();
    }
}
