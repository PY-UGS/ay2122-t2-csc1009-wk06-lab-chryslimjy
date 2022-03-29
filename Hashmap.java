package ques4to6;

import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(0,1);
		hash.put(1,3);
		hash.put(2,5);
		hash.put(3,7);
		hash.put(4,9);
		hash.put(5,11);
        
        System.out.println("Select (1) to carry out value input. Select (2) to swap values: ");
		choice = input.nextInt();
		
		if (choice == 1) {
			int value;
			System.out.println("Contents before input: " + hash);
			System.out.println("Input a number to add to the list:");
			value = input.nextInt();
			//addAndSort(hash, value);
			HashMap<Integer, Integer> newHM = addAndSort(hash,value);
			System.out.println("Contents after inputs: " + newHM);
		} else {
			int index1, index2;
			System.out.println("Contents before input: " + hash);
			System.out.println("Input the 2 index you want to swap: ");
			index1 = input.nextInt();
			index2 = input.nextInt();
			swapValues(hash, index1,index2);
			System.out.println("Contents after swapping: " + hash);
		}
	}
	
	public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> hashmap, int value) {
		int size = hashmap.size();
		hashmap.put(size, value);
		
		// Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hashmap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
		
		

	}

	public static void swapValues(HashMap<Integer,Integer> hashmap, int indexOne, int indexTwo) {
		int temp;
		temp = hashmap.get(indexOne);
		hashmap.put(indexOne,hashmap.get(indexTwo));
		hashmap.put(indexTwo,temp);
	}
}
