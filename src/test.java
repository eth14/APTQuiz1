
public class test {
	public int howMany(String[] headlines, String[] messages) {
	int headcounts [] = new int[256];
    for(String s: headlines) {
    	for(char ch : s.toLowerCase().toCharArray()) {
    		if (ch == ' ') continue;
    		headcounts[ch] = headcounts[ch]+1;
    	}
    }
    return 0;
}
}
