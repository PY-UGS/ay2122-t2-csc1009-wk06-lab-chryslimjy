package ques4to6;

import java.util.*;

public class HashGenerateInt {
	public static void main(String[] args) {
		int max = 9999;
		int min = 1000;
		
		int key = 0;
		int i = 1;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		while(i <= 500) {
			Random rand = new Random();
			int randomNum = rand.nextInt((max - min) + 1) + min;
			hash.put(key,randomNum);
			++i;
			++key;
		}
		
		System.out.println("Contents of hashmap: " + hash); 
		
		
		Random rand2 = new Random();
		int var = rand2.nextInt((max - min) + 1) + min;
		System.out.println("random no. generated: " + var);
			
		findValue(hash, var);
	}
	
	public static int findValue (HashMap<Integer,Integer> hash, int searchVal) {
		//int size = hash.size();
		int returnValue = 0;
		boolean valueFound;
		
		valueFound = hash.containsValue(searchVal);

		if(valueFound == true) {
			for (Map.Entry<Integer,Integer> e : hash.entrySet()) {
				if(e.getValue() == searchVal) {
					returnValue = e.getKey();
					System.out.print("Value found at pos: " + e.getKey());
					return returnValue;
				}
			}
		}else {
			returnValue = -1;
			System.out.print("Not found. Returned value: " + returnValue);
		}
		
		return returnValue;
		
	}
}
