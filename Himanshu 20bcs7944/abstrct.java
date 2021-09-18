abstract class abstrct{		//abstract class
	abstract void show();		//abstract method declared
     }
     
class class_1 extends abstrct{
	void show(){
	     System.out.println("This is an example of Abstract method");
	}
	public static void main(String args[]){
	     abstrct obj1 = new class_1();    //object of abstract class
	     obj1.show();                     //calling abstract method
	}
}
