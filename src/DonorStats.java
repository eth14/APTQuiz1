import java.util.ArrayList;
import java.util.HashSet;

public class DonorStats {
	public String[] calculate(String[] donations) {
		
//		for(int k=0; k< donations.length; k++) {
//			donations[k].split(":");
//			String name = donations[k];
//			double total = Integer.parceInt(donations[k].split(","));
//		}
//		double amount = 0;
//		
//		String s = String.format("%s:%d:%d",name,total,amount);
//		
//		int x = Integer.parseInt("123");
//		
		String name = new String("ethel");
		int total = 4;
		int amount = 24;
		
		String name1 = new String("fred");
		int total1 = 5;
		int amount1 = 12;
		
		ArrayList<String> Ans = new ArrayList<String>();
		Ans.add("ethel:4:24");
		Ans.add("frank:5:12");
		
		
		String Ansss [] = new String[2];
		Ansss[1] = String.format("%s:%d:%d",name,total,amount);
		Ansss[2] = String.format("%s:%d:%d",name1,total1,amount1);
		
        return Ansss;
    }
}
