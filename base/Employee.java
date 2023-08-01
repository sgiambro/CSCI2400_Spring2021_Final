public abstract class Employee{
	
	double cPay = 12.50;
	double sPay = 10.75;
	double mPay = 20;
	
	public abstract double viewPay();
	
	public abstract boolean getWorking();

	public double getCPay(){
		return cPay;
	}

	public double getSPay(){
		return sPay;
	}

	public double getMPay(){
		return mPay;
	}

	public void editPayC(double p){
		cPay = p;
	}

	public void editPayS(double p){
                sPay = p;
        }
	
	public boolean clockIn(){
		System.out.println("You are now clocked in.");
		return true;
	}
	
	public boolean clockOut(){
		System.out.println("You are now clocked out.");
                return false;
	}

}
