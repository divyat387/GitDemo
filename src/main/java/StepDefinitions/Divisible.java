package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

public class Divisible {
	
	public static void main(String[] args) {
		List<String> numberList = new ArrayList<String>(100);
		
		for(int i=1;i<=100;i++) {
			numberList.add(Integer.valueOf(i).toString());
		}
		
		List<String> convertedList = new ArrayList<String>(100);
		for(String numArg : numberList) {
			boolean convFlag = false;
			int  num = Integer.parseInt(numArg);
			
			if(num%3==0 && num%5==0) {
				convertedList.add("FOCUS");
				convFlag = true;
			} 
			
			if(!convFlag && num%3==0) {
				convertedList.add("FOC");
				convFlag = true;
			}
			
			if(!convFlag && num%5==0) {
				convertedList.add("US");
				convFlag = true;
			}
			
			
			if(!convFlag) {
				convertedList.add(numArg);
			}
			
		}
		
		System.out.println(" Converted List : "+convertedList);

		
	
	}
}
