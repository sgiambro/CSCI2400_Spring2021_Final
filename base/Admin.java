import java.util.*;

public class Admin implements Person{


	public Admin(){
		System.out.println("ADMIN ONLINE");
	}

	public String addCustomer(){
			String name = " ";

        	        Scanner scan = new Scanner(System.in);
	
        	        System.out.println("Enter the name of the new customer  ");
	
        	        name = scan.nextLine();
	
        	        System.out.println("Enter the items of the new customer (comma seperated no space)  ");

                        return name;

       	}

	public String addCleaner(){
                        String name = " ";

                        Scanner scan = new Scanner(System.in);

                        System.out.println("Enter the name of the new cleaner  ");

                        name = scan.nextLine();

                        return name;

        }

	public String addSorter(){
                        String name = " ";

                        Scanner scan = new Scanner(System.in);

                        System.out.println("Enter the name of the new sorter  ");

                        name = scan.nextLine();

                        return name;

        }

	public int menu(){

		
                Scanner scan = new Scanner(System.in);
                int x;

                System.out.println("What would you like to do ADMIN?");
		System.out.println("(1) Add Customer");
                System.out.println("(2) Add Sorter");
                System.out.println("(3) Add Cleaner");
		System.out.println("(4) EXIT");

                x = scan.nextInt();

                return x;
		
	}





}//end admin
