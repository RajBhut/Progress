
public class Mathodoverriding_prac
{
    public static void main(String[] args) {
        figur f1 = new figur(20.0,20.0);
        ractangle r1 = new ractangle(20.0,20.0);
        triangle t1 = new triangle(20.0,20.0);

        System.out.println(r1.area());
        System.out.println(t1.area());




    }
    static class figur
    {
        double d1, d2;
        figur()
        {
            d1 = 0 ;
            d2 = 0;

        }
        figur(double a , double b )
        {
            d1 = a;
            d2 = b;
        }
         void are()
        {
            System.out.println("Area is undefine!");
        }


    }
    static class ractangle extends figur
    {
        ractangle(double d1, double d2)
        {super(d1,d2);}

        double area ()
        {
            System.out.println("THe area is :"+(d1*d2));
            return d1*d2;
        }


    }

    static class triangle extends figur
    { triangle(double d1 , double d2)
        {
            super(d1,d2);
        }
        double area()
        {
            System.out.println("The area of triangle is:" );
            return (d1*d2)*(0.5);
        }
    }
}
