package Staticmethod;

public class Studentt {
int id;
String name;
static String college="Gitam";
public Studentt(int i,String n) {
	 id=i;
	 name=n;
}
static void cha() {
	college ="Raghu";
}
public void display() {
	System.out.println(id+" "+name+" "+college);
}
}
