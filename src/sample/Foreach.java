package sample;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
		
		//String[] str = {"sree","gopi","dhoni"};
		ArrayList<String> array = new ArrayList<String>();
		array.add("sree");
		array.add("gopi");
		
		
		for (String s : array) {
			System.out.println(s);
		}
		

	}

}
