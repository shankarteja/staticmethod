package Staticmethod;

public class Student {
	int number;
	String name;
	static String college="vignan";
	public  Student (int i,String s) {
		number =i;
		name =s;
		
	}
	public static void cha() {
		college ="diet";
	}
	public void disply() {
		System.out.println(number+" "+name+" "+college);

	}
}
