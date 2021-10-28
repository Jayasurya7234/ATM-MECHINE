import java.util.Scanner;
class ATM1{
	public static void main(String[] java){
		double balence = 27000.00,Withdraw,Deposit;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welocome to SBI");
		System.out.println("1.WithDraw");
		System.out.println("2.Deposit");
		System.out.println("3.Balence");
		System.out.println("4.Exit");
		num = sc.nextInt();
		switch(num){
			case 1:
			    System.out.println("Enter the WithDraw amount :");
			    Withdraw = sc.nextDouble();
			    if(balence>=Withdraw){
			    balence = balence - Withdraw;
			    System.out.println("balence :"+balence);
			    break;
			}else{
                System.out.println("your Balence is insaficent!!!");
                break;
			}
            case 2:
                System.out.println("Enter the Deposit amount :");
                Deposit = sc.nextDouble();
                balence = balence+Deposit;
                System.out.println("balence :"+balence);
                break;
            case 3:
                System.out.println("Total Balence : "+balence);
                break;
            case 4:
                 System.exit(0);
		}
	}
}