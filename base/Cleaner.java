import java.util.*;

public class Cleaner extends Employee implements Person , Cleaning{

        boolean working = false;
	boolean soap;
	int id , cleanCount;
        String name;

        public Cleaner(String n){
                name = n;

                Random ran = new Random();
                id = ran.nextInt(999999);

                cleanCount = 0;

		soap = false;
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
		return cleanCount;
	}

	public void addSoap(){
		if(soap){
			System.out.println("There is already enough soap in the machine.");
		}

		else{
			System.out.println("*adds soap in the machine*");
			soap = true;
		}
	}

        public void clean(){
		if(soap){
                	System.out.println("*loads and starts the cleaning machine*");
                	cleanCount++;
			soap = false;
		}
		
		else{
			System.out.println("There is not enough soap in the machine.");
		}
        }

	public double viewPay(){
		return super.getCPay();
	}

	public void editPayC( double np){
		super.editPayC(np);
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
		System.out.println("(2) Add Soap");
                System.out.println("(3) Clean Items");
                System.out.println("(4) View Pay");
                System.out.println("(5) Clock Out");
                System.out.println("(6) EXIT");

                x = scan.nextInt();

                return x;

        }

}//end sorter

