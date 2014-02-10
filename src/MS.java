public class MS {

	/**
	 * @param args
	 */
	//find the largest palindromic in a long string
	
	private static String findPalin(String input){
		String largest = "";
		String temp ="";
		int max =0;
		if (input.length()<3){
			return null;
		}
		for(int i=2; i<input.length();i++){
			temp = findPalinForOne(input,i);
			
			if(temp.length()>max){
				largest = temp;
			}
			
		}
		return largest;
	}
	
	private static String findPalinForOne(String input, int i){
		String result="";
		for (int a=1;a+i<input.length()&&i-a>0;a++){
			if(input.charAt(i+a)==input.charAt(i-a)){
				result=input.substring(i-a, i+a+1);
				
			}
			else{
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPalin("ABCBAHELLOHOWRACECARAREYOUIAMAIDOINGGOODyunjieijnuyabcdefedcba"));
	}

}
