import java.util.*;

public class Customer implements Person{

	boolean clean , sorted;
	int id;
	double total , cost , payment , tip;
	String name;
	String items; 
	String[] itemsList;
	
	public Customer(String n , String i){
		clean = false;
		sorted = false;
		
		Random ran = new Random();
		id = ran.nextInt(999999);

		items = i;
		itemsList = i.split("\\s*,\\s*");

		cost = 5*(itemsList.length);
		total = cost;
		payment = 0;
		tip = 0;
	
		name = n;
		
		System.out.println("Hello "+ name + ", your order ID is " + id);

	}

	public double getCost(){
		return cost;
	}

	public double getMoney(){
		return (total - cost);
	}

	public String getName(){
		return name;
	}
	
	public String getItems(){
		return items;
	}

	public String getItemsList(){
		String i = " ";

		for(int j=0; j<(itemsList.length);j++){
			if(j != (itemsList.length)-1){
				i = i + itemsList[j] + ", ";
			}

			else{
				i = i + itemsList[j];		
			}
		}

		return i;
	}

	public int getID(){
		return id;
	}

	public double getTip(){
		return tip;
	}

	public double getPayment(){
		return payment;
	}

	public boolean getClean(){
		return clean;
	}

	public boolean getSorted(){
		return sorted;
	}

	public void changeStatus(int x){

		if(x == 1){
                        clean = true;
                }

                else if(x == 2){
                        sorted = true;
                }

                else if(x == 3){
                        clean = true;
			sorted = true;
                }

	}

	public void pay(){
		
		Scanner scan = new Scanner(System.in);

		System.out.println("How much do you want to pay? ");
                payment = scan.nextDouble();

		if(payment <= 0){
			System.out.println("Invalid Payment Amount");
			payment = 0;
		}
		
		else if(payment == cost){
			System.out.println("Thank You! Your order has been paid for.");
			cost -= payment;
		}
		
		else if(payment > cost){

			System.out.println("Thank You! Your order has been paid for and the change is $" + (payment-cost) + ".");
                        payment = payment - (payment-cost);
			cost = 0;

		}

		else if(cost > payment){
			System.out.println("Thank You! You still owe $" + (cost-payment) +".");
                        cost -= payment;

		}
	}

	public void check(){
		
		if(clean){
                        System.out.println("Your items are cleaned.");
                }

                else{
                        System.out.println("Your items are still being cleaned.");
                }


                if(sorted){

                        System.out.println("Your items are sorted.");
                }

                else{
                        System.out.println("Your items are still being sorted.");
                }


	}

	public void tip(){
		
		Scanner scan = new Scanner(System.in);
                System.out.println("How much do you want to tip? ");
                tip = scan.nextDouble();
	}

	public int menu(){

		
                Scanner scan = new Scanner(System.in);
                int x;

                System.out.println("What would you like to do " + name + "?");
                System.out.println("(1) See The Bill");
                System.out.println("(2) Check Status");
                System.out.println("(3) Pay The Bill");
                System.out.println("(4) Leave A Tip ");
                System.out.println("(5) EXIT");

                x = scan.nextInt();

                return x;
		
	}

}//end customer
