package javaprogrmas;

public class SecondSmallest {
	 public static void main(String[] args) {
		int [] arr= {1,1,1,2,4,5,6,1};
		int smallest=arr[0];
		int secsmallest=arr[0];
	
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secsmallest=smallest;
				
				smallest=arr[i];
			}
			else if(arr[i]<secsmallest || smallest==secsmallest) {
				if(arr[i]!=smallest) {
					secsmallest=arr[i];
				}
			}
		}
		System.out.println("Seccond  Smallest number in the given  arrray :" +secsmallest);
	}

}
