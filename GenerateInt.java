package ques1to3;

import java.util.*;

public class GenerateInt {

	public static void main(String[] args) {
		int max = 9999;
		int min = 1000;
		LinkedList<Integer> intList = new LinkedList<>();
		for (int i = 1; i <= 500; ++i) {
			Random rand = new Random();
			int randomNum = rand.nextInt((max - min) + 1) + min;
			intList.add(randomNum);
		}
		
		System.out.println("Contents before input: " + intList);
		
		Random rand2 = new Random();
		int var = rand2.nextInt((max - min) + 1) + min;
		System.out.println("random no. generated: " + var);
			
		findValue(intList, var);
	}
	
	public static int findValue (LinkedList<Integer> list, int searchVal) {
		int size = list.size();
		int returnValue = 0;
		int i;
		//System.out.println("Did it reach here");
		for(i = 0; i<size; i++) {
			if(list.get(i) == searchVal) {
				System.out.println("Value found at position: " + i);
				returnValue = i;
				break;
			}else if (i == size - 1 && returnValue == 0){
				returnValue = -1;
				System.out.println("Number not found. Returned Value: " + returnValue);
			}
		}
		
		return returnValue;
		
	}

}
