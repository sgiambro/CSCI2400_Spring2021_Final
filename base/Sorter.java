import java.util.*;

public class Sorter extends Employee implements Person , Sorting{

	boolean working = false;
	int id , sortCount;
	String name;


	public Sorter(String n){
		name = n;

		Random ran = new Random();
		id = ran.nextInt(999999);

		sortCount = 0;
	}

	public String getName(){
		return name;
	}

	public int getID(){
		return id;
	}

	public boolean getWorking(){
		return working;
	}

	public int getCount(){
		return sortCount;
	}

	public void sort(){
		System.out.println("*Moves items around into piles*");
		sortCount++;	
	}

	public double viewPay(){
		return super.getSPay();
	}

	public void editPayS(double np){
		super.editPayS(np);
	}

	public void clockInE(){
		working = super.clockIn();
	}

	public void clockOutE(){
		working = super.clockOut();
	}

	public int menu(){

		
                Scanner scan = new Scanner(System.in);
                int x;

                System.out.println("What would you like to do " + name + "?");
		System.out.println("(1) Clock In");
                System.out.println("(2) Sort Items");
                System.out.println("(3) View Pay");
                System.out.println("(4) Clock Out");
		System.out.println("(5) EXIT");

                x = scan.nextInt();

                return x;
		
	}

}//end sorter	
