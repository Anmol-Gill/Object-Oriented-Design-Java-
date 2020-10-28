import java.util.*;
public class ListManipulator {
	
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending){
		if (ascending == true) {
			myLst.sort(new Comparator<Integer>() 
			{
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2);
				}
			});
		}
		else {
			myLst.sort(new Comparator<Integer>() 
			{
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);
				}
			});
		}
		return myLst;
	}

	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int x = scan.nextInt();
			myLst.add(x);
		}
		
		myLst.remove(0);
		myLst.add(0, myLst.lastIndexOf(myLst));
	    return myLst;
	}
	
	void table(ArrayList<Integer> myLst) {
		System.out.println("Number\tTrequency");
		for(int i = 0; i<myLst.size();i++) {
			System.out.println(myLst.get(i)+"\t"+Collections.frequency(myLst, myLst.get(i)));
		}
	}
}
