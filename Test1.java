package Staticmethod;

import java.util.Random;

public class Test1 {
static int number;
 	public static void main(String[] args) {
  
   Test1.number=new Random().nextInt();
   
   Test1.number=new Random().nextInt();
   
   Test1.number=new Random().nextInt();
 
   Test1.number=new Random().nextInt();

   System.out.println(Test1.number);
   System.out.println(Test1.number);
   System.out.println(Test1.number);
   System.out.println(Test1.number);
 	}
 	public static void print() {
 		System.out.println("static print");
 	}
 	
}