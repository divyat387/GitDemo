package StepDefinitions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Intersection {

	public static void main(String[] args) {
		String str1 = "I am happy and why not";
		String str2 = "why are you not happy and you should be";
		
		String[] firstString = str1.split(" ");
		String[] secondString = str2.split(" ");
		Map<String,Integer> intersection = new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<firstString.length;i++) {
			int count =1;
			for(int j=0;j<secondString.length;j++) {
				if(firstString[i].equals(secondString[j])) {
					count++;
				}
			}
			if(count>1) {
				intersection.put(firstString[i], count);
			}
		}
		
		for(String str: intersection.keySet()) {
			System.out.println("String : "+str+"  Count : "+intersection.get(str));
		}

	}

}
