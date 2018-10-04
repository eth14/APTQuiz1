import java.util.Arrays;
import java.util.HashSet;

public class SetAside {
	public String common(String[] list) {
		
		HashSet<String> keepers = new HashSet<>();
		HashSet<String> setlist = new HashSet<>(Arrays.asList(list));
		for(String s: list) {
			if(covered(s, setlist)) {
				keepers.add(s);
			}
		}
		String toret = new String(); 
		for(String k: keepers) {
			toret = toret + k + " ";
		}
		
        return toret;
    }
	private boolean covered(String s, HashSet<String> set) {
		for(String k : s.split(" ")) {
			if(set.contains(k)) return true;
		}
		return false;
	}
}
