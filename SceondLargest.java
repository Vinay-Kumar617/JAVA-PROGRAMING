package javaprogrmas;

public class SceondLargest {
	
		 public static void main(String[] args) {
			int [] arr= {6,2,4,6,5,6,5,1};
			int largest=arr[0];
			int seclargest=arr[0];
		
			for(int i= 0;i<arr.length;i++) {
				if(arr[i]>largest) {
					seclargest=largest;
					
					largest=arr[i];
				}
				else if(arr[i]>seclargest || largest==seclargest) {
					if(arr[i]!=largest) {
						seclargest=arr[i];
					}
				}
			}
			System.out.println("Seccond  Largest number in the given  arrray :" +seclargest);
		}

	}

