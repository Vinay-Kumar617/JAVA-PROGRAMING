import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num!=0){
             int rem=num%10;
             int fact=1;
             for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            num=num/10;
            sum=sum+fact;
        }
        if(sum==temp){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }

    }

    
}
