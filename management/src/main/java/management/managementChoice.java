package management;

import java.util.Scanner;



public class managementChoice {
	

		private static Scanner sc = new Scanner(System.in);
		management man;

		public String getInput() {
			System.out.println("Enter CRUD choice: ");
			return sc.nextLine();
		} 

		public void options() {
			
			CRUDqueries q = new CRUDqueries();

		
			String crud = getInput();

		
			 try {
				
				do {
					
					switch (crud.toLowerCase()) {
					case "create":
						System.out.println("Enter first name ");
						String firstname = sc.nextLine();
						System.out.println("Enter last name ");
						String name = sc.nextLine();
						
						System.out.println("Enter position ");
						String position = sc.nextLine();
						sc.nextLine();
						
						System.out.println("Enter date of birth ");
						String dob = sc.nextLine();
						System.out.println("Enter annual pay ");
						int pay = sc.nextInt();
						sc.nextLine();
						
						
						
						q.create(new management (firstname,name, dob, position, pay));
						break;
						
				case "read":
						
						
						q.read();
						break;
					case "update":
						System.out.println("Enter staffid of record to update: ");
						int uid = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter the new position ");
						String nposition = sc.nextLine();
						q.update(uid, nposition);					
						break;
					
					default:
						System.out.println("Invalid CRUD choice");
					}
					// check if user wants to continue or break out of the loop
					System.out.println("Would you like to continue? (y/n)");
					String quit = sc.nextLine();
					if (quit.toLowerCase().equals("y")) {
						crud = getInput();
					} else if (quit.toLowerCase().equals("n")) {
						crud = "quit";
					} else {
						System.out.println("Please enter 'y' or 'n'");
					}

				} while (!crud.equals("quit"));
				System.out.println("thankyou for looking at the code bye");
			} finally {
				q.closeConn();
			}
		}

		

}


