package Staticmethod;

public class Tes {

	public static void main(String[] args) {
		Student s1 = new Student(101,"orange");
		Student s2=new Student(102,"orangearmy");
		Student s3=new Student(102,"orangearmy");
		s1.disply();
		s2.disply();
		Student.cha();
		s3.disply();


	}

}
