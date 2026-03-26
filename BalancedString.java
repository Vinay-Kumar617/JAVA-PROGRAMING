package strings;

public class BalancedString {
   public static void main(String[] args) {
	String  str="{{}}[](){()}";
	if(balance(str)) {
		System.out.println("Balanced String");
	}
	else {
		System.out.println("Unbalanced String ");
	}
}
   public static boolean balance(String str) {
	    while(true) {
	    	 int old_length=str.length();
	    	  str=str.replace("{}", "");
	    	  str=str.replace("[]", "");
	    	  str=str.replace("()", "");
	    	 int new_length=str.length();
	    	 if(old_length ==new_length)break;
	    }
	    return str.length()==0;
   }
}
