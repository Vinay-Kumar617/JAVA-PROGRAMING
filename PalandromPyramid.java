package javaprogrmas;

public class PalandromPyramid {

	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=num;i++) {
			int temp=1; int pal=i;
			for(int j=1;j<2*num;j++) {
				 if(i+j>num && j-i<num) {
					 
					 if(j<num) {
						 System.out.print( temp++ +" "); 
					 }
					 else {
						 System.out.print(pal-- +" ");
					 }
					 }
						
				 else {
					 System.out.print("  ");
				 }
					
				
			}System.out.println();
		}
	}
}
