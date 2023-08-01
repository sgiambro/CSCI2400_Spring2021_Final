import java.util.*;

public class Manager extends Employee implements Person{

	boolean working = false;
	int id;
	String name;

	public Manager(String n){
		name = n;

		Random ran = new Random();
		id = ran.nextInt(999999);

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

	public String hire(){
		Scanner scan = new Scanner(System.in);
                String x;

                System.out.println("Enter the name of the new employee  ");

                x = scan.nextLine();
		
		System.out.println(x + " Is Hired!");
                return x;
	}

	public int fire(){
                Scanner scan = new Scanner(System.in);
                int x;

                System.out.println("Enter the employee id of the worker you want to fire  ");

                x = scan.nextInt();

                return x;
        }

	public double editCPay(){
		Scanner scan = new Scanner(System.in);
                double x;

                System.out.println("Enter the new hourly pay of the cleaners  ");

                x = scan.nextDouble();
		
		System.out.println("Cleaner Pay Changed To $" + x);

		return x;

	}

	public double editSPay(){
                Scanner scan = new Scanner(System.in);
                double x;

                System.out.println("Enter the new hourly pay of the sorters  ");

                x = scan.nextDouble();

		System.out.println("Cleaner Pay Changed To $" + x);

		return x;

        }

	public double viewPay(){
		return super.getMPay();
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
                System.out.println("(2) Hire A New Worker");
                System.out.println("(3) Fire A Worker");
		System.out.println("(4) Change Employee Pay");
		System.out.println("(5) List All Employees");
		System.out.println("(6) See Total Revenue");
		System.out.println("(7) View Pay");
                System.out.println("(8) Clock Out");
		System.out.println("(9) EXIT");

                x = scan.nextInt();

                return x;
		
	}



}//end manager
