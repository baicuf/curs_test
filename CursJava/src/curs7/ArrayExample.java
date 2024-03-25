package curs7;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		String[] textArray = new String[5];
	//	String[] textArray = {null,null,null,null,null};
	//	index ---------------> 0  ,  1 , 2 ,  3  ,  4  
		System.out.println(textArray[0]);
		textArray[0] = "This ";
	//	String[] textArray = {"This ",null,null,null,null};
	//	index ---------------> 0  ,  1 , 2 ,  3  ,  4  
		System.out.println(textArray[0]);
		System.out.println(textArray[1]);
		textArray[1] = "is ";
	//	String[] textArray = {"This ","is ",null,null,null};
	//	index ---------------> 0  ,  1 , 2 ,  3  ,  4  
		textArray[2] = "an ";
		textArray[3] = "array ";
		textArray[4] = "!";
		//	String[] textArray = {"This ","is ","an","array","!"};
		//	index ---------------> 0  ,  1 , 2 ,  3  ,  4  
		System.out.println(Arrays.toString(textArray));
		System.out.println(textArray.length);
		
		for(int i = 0; i<textArray.length; i++) {
			System.out.println(textArray[i]);
		}
	}

}
