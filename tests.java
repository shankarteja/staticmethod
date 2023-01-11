package Staticmethod;

public class tests {

	public static void main(String[] args) {
	Studentt s =new Studentt(321, "Rocky");
	Studentt s1=new Studentt(322, "tj");
	Studentt s2=new Studentt(323, "teja");
	Studentt s3=new Studentt(324, "tej");
	s.display();
	s1.display();
	Studentt.cha();
	s2.display(); 
	s3.display();

	}

}
