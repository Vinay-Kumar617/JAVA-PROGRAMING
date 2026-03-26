package strings;

public class PalindromsInTheSentence {
  public static void main(String[] args) {
	String str="I Love my Mom and Dad";
	str=str.toLowerCase();
	System.out.println(wordPalindrom(str));
}
  public static String wordPalindrom(String str) {
	   String []words=str.split(" ");
	   String result="";
	    for(int i=0;i<words.length;i++) {
	    	    if(palindrom(words[i])) {
	    	    	  result+=words[i]+" ";
	    	    }
	    }
	   return result;
  }
  public static boolean  palindrom(String str) {
	    int i=0; int j=str.length()-1;
	    while(i<j) {
	    	 if(str.charAt(i)!=str.charAt(j)) {
	    		 return false;
	    	 }
	    	 i++;j--;
	    }
	    return true;
  }
}
