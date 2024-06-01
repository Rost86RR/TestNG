package javva.oop.day12.polymorphism;

public class Box {

    double width, leigth, depth;

    Box() //1
    {
        width = 0;
        leigth = 0;
        depth =0;
    }

    Box(double w, double l, double d) //2
    {
        width = w;
        leigth = l;
        depth = d;
    }

    Box(double len) //3
    {
        width = leigth = depth = len;
    }

    double volume()
    {
        return (width * leigth * depth);
    }
}
