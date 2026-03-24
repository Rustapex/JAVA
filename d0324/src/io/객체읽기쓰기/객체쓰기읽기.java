package io.객체읽기쓰기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class 객체쓰기읽기 {

	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();
		list.add(  new Score("lee" ,90));
		list.add(  new Score("kee",80));
		list.add(  new Score("woo" ,90));
		  

		ObjectOutputStream oos=null;		 
		try {
			oos  = new ObjectOutputStream(new FileOutputStream("java/d0324/res/scoreoutput.txt"));
			oos.writeObject(list.get(0));			
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		
		
		//읽기 //res/scoreoutput.txt
		
		
		
		ObjectInputStream ois = null;	 
		try {
			ois = new ObjectInputStream(new FileInputStream("java/d0324/res/scoreoutput.txt"));
			Score score  = (Score)ois.readObject();
			System.out.println( score);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		
		
		
	}

}
