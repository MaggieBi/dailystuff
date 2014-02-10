import java.util.ArrayList;
import java.util.Arrays;


public class votingAlgo {

	/**
	 * @param args
	 */
	
	//As we sweep we maintain a pair consisting of a current candidate and a counter. Initially, the current candidate is unknown and the counter is 0.

	//When we move the pointer forward over an element e:

	//If the counter is 0, we set the current candidate to e and we set the counter to 1.
	//If the counter is not 0, we increment or decrement the counter according to whether e is the current candidate.
	//When we are done, the current candidate is the majority element, if there is a majority.
	
	public static Integer getMajority(ArrayList<Integer> array){
		Integer counter = 0;
		Integer cur = null;
		
		for (Integer i:array){
			
			System.out.println("current: "+cur);
			System.out.println("counter: "+counter);
			
			if (cur==null){
				cur = i;
				counter ++;
			}
			else if (cur.equals(i)&&!counter.equals(0)){
				counter++;
			}
			else if (!cur.equals(i)&&!counter.equals(0)){
				counter--;
				if (counter.equals(0)){
					cur = null;
				}
				}
			
				
			}

		
		if (cur!=null){
		
		return cur;}
		else return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,1,1,1,1,1,1,1,2,3,3,5,3,3,21));
		System.out.println(getMajority(a));
	}

}
