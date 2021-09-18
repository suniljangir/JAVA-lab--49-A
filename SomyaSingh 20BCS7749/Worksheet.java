class Worksheet{
  int a;
  int b;

  Worksheet()
  { 
    a=3;
    b=7;
    System.out.println("Default Constructor"); 
  }
  Worksheet(int x)
  {   
      a = x;
      System.out.println("Parameterized Constructor with one parameter"); 
  }
  Worksheet(int x, int y)
  {
      a = x;
      b = y;
      System.out.println("Parameterized Constructor with two parameter"); 
  }   
 public void display()
 {
     System.out.println("Value of x = "+ a +" Value of y = "+ b); 
 }
public void print()
 {
     System.out.println("Value of x = "+ a);
 }

 public static void main(String args[]) 
 {
   Worksheet w1=new Worksheet(); 
   Worksheet w2=new Worksheet(20); 
   Worksheet w3=new Worksheet(19, 11); 
  
   w1.display();
   w2.print();
   w3.display();
 }
}