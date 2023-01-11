package Staticmethod;

public class Test4 {

	int rollno;
	String name;
	 String college="DIET";
	 static void change(){
		    // college = "BBDIT";
		     }
	 Test4(int r,String n){
		 rollno =r;
		 name=n;
		 }
	 void display() {
		 System.out.println(rollno+" "+college);
	 }
	 public class Teststaticmethod{
	public static void main(String[] args) {
		Test4.change();
Test4 x =new Test4(111,"teja");
Test4 x1 =new Test4(222,"teja");
Test4 x2 =new Test4(333,"teja");

	x.display();
	x1.display();
	x2.display();
	}
	 }
}