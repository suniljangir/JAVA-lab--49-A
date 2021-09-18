public class Worksheet1 {

    public static void main(String[] args)
    {
        construct obj1 = new construct();
        construct obj2 = new construct(25);
        construct obj3 = new construct(40,60);

    }
    
}

class construct
{
    int x = 10;
    int y = 20;

    // Default Constructor
    construct()
    {
        System.out.println("This is the default constructor");
        display();
    }

    // Constructor with a single parameter
    construct(int a)
    {
        x = a;
        System.out.println("This is a constructor with single parameter");
        display();
    }

    // Constructor with two parameters
    construct(int a, int b)
    {
        x = a; y = b;
        System.out.println("This is a constructor with two parameters");
        display();
    }

void display()
{
    System.out.println(" X = "+ x);
    System.out.println(" Y = "+ y);
}

}