DryCleanerDriver.class: DryCleanerDriver.java Admin.class Customer.class Cleaner.class Sorter.class Manager.class Employee.class Sorting.class Cleaning.class Person.class
	javac DryCleanerDriver.java

Admin.class: Admin.java Person.class
	javac Admin.java

Customer.class: Customer.java Person.class
	javac Customer.java

Cleaner.class: Cleaner.java Cleaning.class Employee.class Person.class
	javac Cleaner.java

Sorter.class: Sorter.java Sorting.class Employee.class Person.class
	javac Sorter.java

Manager.class: Manager.java Employee.class Person.class
	javac Manager.java

Cleaning.class: Cleaning.java
	javac Cleaning.java

Sorting.class: Sorting.java
	javac Sorting.java

Employee.class: Employee.java
	javac Employee.java

Person.class: Person.java
	javac Person.java

run: DryCleanerDriver.class
	java DryCleanerDriver

clean:
	rm *.class
