package strings;

public class MinFrequencyAphabet {
   public static void main(String[] args) {
	String str= "Java";
	int min_freq=str.length();
	char min_char=str.charAt(0);
    for( int i=0;i<str.length();i++) {
    
    	int freq=0;
    	for( int j=0;j<str.length();j++) {
    		 if(str.charAt(i)==str.charAt(j))
    		 {
    			 freq++;
    		 }
    	}
    	if(freq<min_freq) {
    		 min_freq=freq;
    		 min_char=str.charAt(i);
    		 
    	}
    }
    System.out.println("Minimum Frequency: "+min_freq);
    System.out.println("Minimum_char:" +min_char);
}
}
