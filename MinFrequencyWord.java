package strings;

public class MinFrequencyWord {
 public static void main(String[] args) {
	String str=" banana  mango banana";
	str=str.toLowerCase();
	String [] arr=str.split(" ");
	int minfreq=arr.length;
	String minWord="";
	 for(int i=0;i<arr.length;i++) {
		 int freq=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i].equals(arr[j])){
			   freq++;	
			}
		}
		if(freq<minfreq) {
			minfreq=freq;
			minWord=arr[i];
		}
	 }
	 System.out.println("Minimum Frequency :"+minfreq);
	 System.out.println("Minimum Frequency Word :"+minWord);
}
}
