package strings;

public class MaxFrequencyCountAlphabet {
	public static void main(String[] args) {
		
	
	String str= "Java";
	int max_freq=0;
	char max_char=str.charAt(0);
    for( int i=0;i<str.length();i++) {
    	
    	int freq=0;
    	for( int j=0;j<str.length();j++) {
    		 if(str.charAt(i)==str.charAt(j))
    		 {
    			 freq++;
    		 }
    	}
    	if(freq>max_freq) {
    		 max_freq=freq;
              max_char=str.charAt(i);
    		 
    	}
    }
    System.out.println("Maximum Frequency: "+max_freq);
    System.out.println("Maximum_char:" +max_char);
}
}
