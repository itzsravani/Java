import java.util.HashMap;
import java.util.Scanner;

public class FindMaxCountChar {
	
 public static void main(String args[]) {
	 Scanner sc =new Scanner(System.in);
	 HashMap<Character, Integer> charCountMap = new HashMap<>();
	 HashMap<Character, Integer> secondcharCountMap = new HashMap<>();
	 boolean secondcharCount=false;
	 char[] charArray = sc.next().toCharArray();
	
	 for(int i=0; i<charArray.length;i++) {
		
		 if(charCountMap.containsKey(charArray[i])) {
			
				if (!secondcharCount && i > 0 && charArray[i] == charArray[i - 1]) {
					charCountMap.put(charArray[i], charCountMap.get(charArray[i]) + 1);
				}else if( i > 0 && charArray[i] != charArray[i - 1]) {
					// charCountMap.get(charArray[i]);
					secondcharCount =true;
					secondcharCountMap.put(charArray[i], 1);
				}else if(secondcharCount && i > 0 && charArray[i] == charArray[i - 1]) {
					secondcharCountMap.put(charArray[i], secondcharCountMap.get(charArray[i]) + 1);
					}
		 }else {
			 charCountMap.put(charArray[i], 1);
		 }
		// System.out.println(charCountMap);
		// System.out.println(secondcharCountMap);
	 }
	for(char c:charCountMap.keySet()) {
		if(secondcharCountMap.containsKey(c) && secondcharCountMap.get(c) > charCountMap.get(c)) {
			System.out.println(c+":"+secondcharCountMap.get(c));
		}else {
			System.out.println(c+":"+charCountMap.get(c));
		}
	}
}
}