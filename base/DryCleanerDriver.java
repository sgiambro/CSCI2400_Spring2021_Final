import java.util.*;

public class DryCleanerDriver{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		ArrayList<Customer> cus = new ArrayList<Customer>();
		ArrayList<Cleaner> cle = new ArrayList<Cleaner>();
		ArrayList<Sorter> sor = new ArrayList<Sorter>();
		Manager man = new Manager("Chad");
		Admin adm = new Admin();

		cus.add(new Customer("Bob" , "Shirt,Pants,Socks,Mask,Jacket"));
		cle.add(new Cleaner("Ron"));
		sor.add(new Sorter("James"));
		
		String name , items;
		double total , tips , pay;
		int opt = 0;
		int cusPos = 0;
		int clePos = 0;
		int sorPos = 0;
		int temp;
		
		
		while(opt != 999){

			System.out.println("What role do you want to be?  ");
			System.out.println("(1) ADMIN");
                	System.out.println("(2) Customer");
               		System.out.println("(3) Manager");
			System.out.println("(4) Cleaner");
                        System.out.println("(5) Sorter");
                        System.out.println("(6) EXIT");

                        opt = scan.nextInt();

			if(opt == 1){
				
				while(opt != 888){
					
					opt = adm.menu();

					if(opt == 1){
						
						name = adm.addCustomer();
						items = scan.next();

						cus.add(new Customer(name , items));
					}
		
					else if(opt == 2){
						name = adm.addSorter();

						sor.add(new Sorter(name));	
					}

					else if(opt == 3){
						name = adm.addCleaner();

                                                cle.add(new Cleaner(name));

					}

					else if(opt == 4){
						opt = 888;	
					}

					else{
						 System.out.println("ERROR OPTION NOT FOUND");
					}//end adm if

				}//end adm while
							

                     	}// end admin if

	 	        else if(opt == 2){
                        
				System.out.println("Are You a(n): ");
				System.out.println("(1) New Client");
				System.out.println("(2) Existing Client");
				opt = scan.nextInt();

				if(opt == 1){
				
					
					System.out.println("Enter the name of the new customer  ");
		        	        name = scan.next();
	
        	        		System.out.println("Enter the items of the new customer (comma seperated no space)  ");
					items = scan.next();

					cus.add(new Customer(name , items));

					for(int k=0;k< cus.size();k++){
                                        	if (cus.get(k).getName() == name && cus.get(k).getItems() == items){
							cusPos = k;
						}
					}

					while(opt != 888){
						
						opt = cus.get(cusPos).menu();

						if(opt == 1){
                        		        	System.out.println("Your bill is $" + cus.get(cusPos).getCost());
                     				}

            			 	        else if(opt == 2){
                         	       			cus.get(cusPos).check();
                        			}

                        			else if(opt == 3){
                                			cus.get(cusPos).pay();

                        			}

                        			else if(opt == 4){
                                			cus.get(cusPos).tip();

                        			}

                        			else if(opt == 5){
                                			opt = 888;
                        			}

                        			else{
                                			System.out.println("ERROR OPTION NOT FOUND");
                        			}//end menu if

					}// end cus while	
				
				}

				else if(opt == 2){
				
					
					for(int j=0 ; j < cus.size() ; j++){
						System.out.println(cus.get(j).getID() + ": " + cus.get(j).getName() + "-  " + cus.get(j).getItemsList());
					}//end for
					
					System.out.println("Enter your id:  ");
					temp = scan.nextInt();
					
					for(int k=0;k< cus.size();k++){
                                                if (cus.get(k).getID() == temp){
                                                        cusPos = k;
							k=cus.size();
                                                	opt = 555;
                                                }

						else{
							opt = 888;
						}
                                        }

					while(opt != 888){

						opt = cus.get(cusPos).menu();

                                                if(opt == 1){
                                                        System.out.println("Your bill is $" + cus.get(cusPos).getCost());
                                                }

                                                else if(opt == 2){
                                                        cus.get(cusPos).check();
                                                }

                                                else if(opt == 3){
                                                        cus.get(cusPos).pay();

                                                }

                                                else if(opt == 4){
                                                        cus.get(cusPos).tip();

                                                }

                                                else if(opt == 5){
                                                        opt = 888;
                                                }

                                                else{
                                                        System.out.println("ERROR OPTION NOT FOUND");
                                                }//end menu if


                                        }//end cus while

				}//end client if

			}// end Customer if

             		else if(opt == 3){
				
				while(opt != 888){

                                	opt = man.menu();

                                        if(opt == 1){
                                                man.clockInE();
                                        }

                                        else if(opt == 2){
                                                
					   if(man.getWorking()){
						System.out.println("Do you want to hire a (1)Cleaner or a (2)Sorter:  ");
                                                opt = scan.nextInt();

						if(opt == 1){
							cle.add(new Cleaner(man.hire()));
						}

						else if(opt == 2){
                                                        sor.add(new Sorter(man.hire()));

						}

						else{
							System.out.println("ERROR! NOT AN OPTION!");
						}//end select if
					    }

					    else{
						System.out.println("NEED TO CLOCK IN");
					    }


                                        }

                                        else if(opt == 3){

					    if(man.getWorking()){
                                        	for(int i=0 ; i < cle.size() ; i++){
                                                	System.out.println(cle.get(i).getID() + ":  " + cle.get(i).getName());
                                       		}//end for

						for(int j=0 ; j < sor.size() ; j++){
                                                        System.out.println(sor.get(j).getID() + ":  " + sor.get(j).getName());
                                                }//end for


                                     	        System.out.println("Enter employee ID whose items you want to fire:  ");
                                        	temp = scan.nextInt();

                                        	for(int k=0;k< cle.size();k++){
                                                	if (cle.get(k).getID() == temp){
                                                        	cle.remove(k);
                                                	}
                                        	}//end for

						for(int l=0;l< sor.size();l++){
                                                        if (sor.get(l).getID() == temp){
                                                                sor.remove(l);
                                                        }
                                                }//end for
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }


                                        }

					else if(opt == 4){
					    if(man.getWorking()){
						System.out.println("Do want to change the (1)Cleaner or (2)Sorter pay:  ");
                                                opt = scan.nextInt();

                                                if(opt == 1){
                                                        pay = man.editCPay();

							for(int i=0 ; i < cle.size() ; i++){
                                                        	cle.get(i).editPayC(pay);
                                                	}//end for
                                                }

                                                else if(opt == 2){
                                                        pay = man.editSPay();
								
							for(int i=0 ; i < sor.size() ; i++){
                                                                sor.get(i).editPayS(pay);
                                                        }//end for

                                                }

                                                else{
                                                        System.out.println("ERROR! NOT AN OPTION!");
                                                }//end select if
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }

	
					}

					else if(opt == 5){
						
					    if(man.getWorking()){
						for(int i=0 ; i < cle.size() ; i++){
                                                        System.out.println(cle.get(i).getID() + ":  " + cle.get(i).getName() + "   Cleaned " + cle.get(i).getCount() + " Loads");
                                                }//end for

                                                for(int j=0 ; j < sor.size() ; j++){
                                                        System.out.println(sor.get(j).getID() + ":  " + sor.get(j).getName() + "   Sorted " + sor.get(j).getCount() + " Loads");
                                                }//end for
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }


					}

					else if(opt == 6){
					    if(man.getWorking()){
						total = 0;
						tips = 0;

						for(int k=0;k< cus.size();k++){
							total = total + cus.get(k).getMoney();
							tips = tips + cus.get(k).getTip();
                                                }

						System.out.println("There is $" + (total+tips) + " in total with $" + tips + " of it being tips");
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }

                                        }


                                        else if(opt == 7){
                                                System.out.println("Your pay is $" + man.viewPay());

                                        }

					else if(opt == 8){
						man.clockOutE();
					}

                                        else if(opt == 9){
					    if(!man.getWorking()){
                                                opt = 888;
					    }

					    else{
                                                System.out.println("NEED TO CLOCK OUT");
                                            }

                                        }

                                        else{
                                                System.out.println("ERROR OPTION NOT FOUND");
                                        }//end menu if


                                }//end cus while	

           		}// end Manager if

                        else if(opt == 4){


                                for(int j=0 ; j < cle.size() ; j++){
                                        System.out.println(cle.get(j).getID() + ": " + cle.get(j).getName());
                                }//end for

                                System.out.println("Enter your id:  ");
                                temp = scan.nextInt();

                                for(int k=0;k< cle.size();k++){
                                        if (cle.get(k).getID() - temp == 0){
                                                clePos = k;
						k=cle.size();
						opt = 555;
                                        }

					else{
						opt = 888;
					}
                                }
				
				while(opt != 888){

                                	opt = cle.get(clePos).menu();

                                        if(opt == 1){
                                                cle.get(clePos).clockInE();
                                        }

                                        else if(opt == 2){
					    if(cle.get(clePos).getWorking()){
                                                cle.get(clePos).addSoap();
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }

                                        }

                                        else if(opt == 3){

					    if(cle.get(clePos).getWorking()){
                                        	for(int j=0 ; j < cus.size() ; j++){
							if(!cus.get(j).getClean()){
                                                		System.out.println(cus.get(j).getID() + ":  " + cus.get(j).getItemsList());
							}
                                       		}//end for

                                     	        System.out.println("Enter customer ID whose items you want to clean:  ");
                                        	temp = scan.nextInt();

                                        	for(int k=0;k< cus.size();k++){
                                                	if (cus.get(k).getID() == temp){
                                                        	cle.get(clePos).clean();
                                                		cus.get(k).changeStatus(1);
                                                	}

                                        	}//end for
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }


                                        }

                                        else if(opt == 4){
                                                System.out.println("Your pay is $" + cle.get(clePos).viewPay());

                                        }

					else if(opt == 5){
						cle.get(clePos).clockOutE();
					}

                                        else if(opt == 6){
					    if(!cle.get(clePos).getWorking()){
                                                opt = 888;
					    }

					    else{
                                                System.out.println("NEED TO CLOCK OUT");
                                            }

                                        }

                                        else{
                                                System.out.println("ERROR OPTION NOT FOUND");
                                        }//end menu if


                                }//end cle while


                        }// end Cleaner if

                        else if(opt == 5){
                   

                                for(int j=0 ; j < sor.size() ; j++){
                                        System.out.println(sor.get(j).getID() + ": " + sor.get(j).getName());
                                }//end for

                                System.out.println("Enter your id:  ");
                                temp = scan.nextInt();

                                for(int k=0;k< sor.size();k++){
                                        if (sor.get(k).getID() == temp){
                                                sorPos = k;
						k=sor.size();
                                                opt = 555;
                                        }

					else{
						opt = 888;
					}
                                }
				
				while(opt != 888){

                                	opt = sor.get(sorPos).menu();

                                        if(opt == 1){
                                                sor.get(sorPos).clockInE();
                                        }

                                        else if(opt == 2){

					    if(sor.get(sorPos).getWorking()){
                                        	for(int j=0 ; j < cus.size() ; j++){
							if(!cus.get(j).getSorted()){
                                                		System.out.println(cus.get(j).getID() + ":  " + cus.get(j).getItemsList());
							}
                                       		}//end for

                                     	        System.out.println("Enter customer ID whose items you want to sort:  ");
                                        	temp = scan.nextInt();

                                        	for(int k=0;k< cus.size();k++){
                                                	if (cus.get(k).getID() == temp){
                                                        	sor.get(sorPos).sort();
                                                		cus.get(k).changeStatus(2);
                                                	}

                                        	}//end for
					    }

					    else{
                                                System.out.println("NEED TO CLOCK IN");
                                            }


                                        }

                                        else if(opt == 3){
                                                System.out.println("Your pay is $" + sor.get(sorPos).viewPay());

                                        }

					else if(opt == 4){
						sor.get(sorPos).clockOutE();
					}

                                        else if(opt == 5){
					    if(!sor.get(sorPos).getWorking()){
                                                opt = 888;
					    }

					    else{
                                                System.out.println("NEED TO CLOCK OUT");
                                            }

                                        }

                                        else{
                                                System.out.println("ERROR OPTION NOT FOUND");
                                        }//end menu if


                                }//end sor while	
       
                        }// end Sorter if

			else if(opt == 6){
				opt = 999;
			}

                        else{
                                System.out.println("ERROR OPTION NOT FOUND");
                        }//end role menu if


		}//end whole while

	}//end main

}//end driver
