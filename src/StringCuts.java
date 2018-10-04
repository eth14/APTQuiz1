
public class StringCuts {
	public String[] filter(String[] list, int minLength) {  
//	    int counts [] = new int[list.length];
	    String winners [] = new String [list.length];
	
	    int num = 0;
		for(int k = 0; k< list.length; k++) {
			int counts = 0;
			counts = list[k].length();
			if(counts >= minLength) {
				winners[k] = list[k];
				num ++;
			}
			k++;
	    }
//		for(int c=0; c<winners.length; c++) {
//			toret[c] = list[winners[c]];
//		}
	    String toret [] = new String [num];
		for (int n = 0; n<num; n++) {
			toret[n] = winners[n];
		}
		return toret;
	}
	 

}
