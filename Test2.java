package Staticmethod;

public class Test2 {
static int number;
	static {
	 System.out.println("static method1");
	 int number=20;
 }
 {
	System.out.println("not static method"); 
 }
 public Test2 () {
	 System.out.println("constructor");
 }
public static void main(String[] args) {
	System.out.println("main method");
     Test2 x1=new Test2();
     Test2 y1=new Test2();
    		 Test2 z1=new Test2();
    				 Test2 a1=new Test2();
	
}
}