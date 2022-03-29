package ques1to3;

import java.util.*;
import java.util.Scanner;

public class SortLinkedList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		LinkedList<Integer> intList = new LinkedList<>();
		

		intList.add(1);
		intList.add(3);
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11);
		System.out.println("Select (1) to carry out value input. Select (2) to swap values: ");
		choice = input.nextInt();

		if (choice == 1) {
			int value;
			System.out.println("Contents before input: " + intList);
			System.out.println("Input a number to add to the list:");
			value = input.nextInt();
			addAndSort(intList, value);
			System.out.println("Contents after inputs: " + intList);
		} else {
			int index1, index2;
			System.out.println("Contents before input: " + intList);
			System.out.println("Input the 2 index you want to swap: ");
			index1 = input.nextInt();
			index2 = input.nextInt();
			swapValues(intList, index1,index2);
			System.out.println("Contents after inputs: " + intList);
		}

	}

	public static void addAndSort(LinkedList<Integer> list, int value) {
		int size = list.size();
		int i = 0;

		while (i < size) {
			if (list.get(i) < value) {
				i++;
			} else {
				list.add(i, value);
				break;
			}
		}

	}

	public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {
		int temp;
		temp = list.get(indexOne);
		list.set(indexOne,list.get(indexTwo));
		list.set(indexTwo,temp);
	}

}
