package io.객체읽기쓰기;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class 객체읽기 {

	public static void main(String[] args) {
		 
		
		// 두 번 읽기
		
	 
			try( ObjectInputStream oi = new ObjectInputStream(  new FileInputStream("java/d0324/res/output10.txt") )){
				
				Score  s = (Score)oi.readObject();
				System.out.println( s);
								
				
				s = (Score)oi.readObject();
				System.out.println( s);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		 
		
		

	}

}
