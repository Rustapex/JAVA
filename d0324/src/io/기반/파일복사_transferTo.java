package io.기반;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사_transferTo {

	public static void main(String[] args) throws IOException {
		 
		
			FileInputStream fis =null;
			FileOutputStream fos = null; 
		
	 
			fis = new FileInputStream("java/d0324/res/cute.jpg");
			fos  = new FileOutputStream("java/d0324/res/cuteCopy3.jpg");
		 
			fis.transferTo(fos);
			
		 
		  
		
		  
		  
		
	}

}
