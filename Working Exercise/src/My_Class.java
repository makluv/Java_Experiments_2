
public class My_Class {

	public static void main(String args[]) {
	      // Instantiating the outer class 
	      FirstInnerClass outer = new FirstInnerClass();
	      
	      // Accessing the display_Inner() method.
	      //outer.display_Inner();
	     
	      FirstInnerClass.Inner_Demo inner = outer.new Inner_Demo();
	      inner.print();
	      
	      
	      //tHIS IS A TEST
	   }
	
}
