package edu.pasadena.cs.cs03b;
import java.util.Scanner;

public class CorporateAmerica {
   private String companyName;

   // setter and getter methods for companyName
   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }
   public String getCompanyName() {
      return this.companyName;
   }

    public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);
 
       // Create the manager, staff, contractor objects and manage the association of employer and employees
       CorporateAmerica company = new CorporateAmerica();
       Employer employer = new Employer();
       Manager manager1 = new Manager();
       Manager manager2 = new Manager();
       Staff staff1 = new Staff();
       Staff staff2 = new Staff();
       Contractor contractor1 = new Contractor();

       // Load data into the objects 
       company.setCompanyName("Dylan Company"); //Set company name
       //set manager info
       manager1.setName("Jeff Bozes");
       manager1.setPosition("Manager");
       manager1.setAge(38);
       manager1.setID(0);
       manager1.setLocation("Los Angeles, California");

       manager2.setName("Mark Buckerzerg");
       manager2.setPosition("Manager");
       manager2.setAge(51);
       manager2.setID(1);
       manager2.setLocation("Houston, Texas");
       //set staff info
       staff1.setName("Melon Usk");
       staff1.setPosition("Staff");
       staff1.setAge(45);
       staff1.setID(2);
       staff1.setLocation("Alhambra, California");

       staff2.setName("Tonald Drump");
       staff2.setPosition("Staff");
       staff2.setAge(47);
       staff2.setID(3);
       staff2.setLocation("Chicago, Illinois");
       //set contractor info
       contractor1.setName("Bob Da Builder");
       contractor1.setPosition("Contractor");
       contractor1.setAge(28);
       contractor1.setID(4);
       contractor1.setLocation("Los Angeles, California");
       //use Employer to add employees
       employer.addEmployee(manager1);
       employer.addEmployee(manager2);
       employer.addEmployee(staff1);
       employer.addEmployee(staff2);
       employer.addEmployee(contractor1);
       //assign certain staff members to managers
       manager1.addStaff(staff1);
       manager1.addStaff(staff2);

       // Print the objects info
       boolean running = true;
       while (running) { //prompt user on actions until exit
         System.out.println("----------------------------------------------------------------------------------------");
         System.out.println("This is the database of " + company.getCompanyName() + ". Select an action:");
         System.out.println("(1)Employee List | (2)Add Employees | (3)Remove Employees | (4)Stop Program");
         
         int select = scanner.nextInt();

         if (select == 1) {
            employer.printEmployees(); //print employee list, Employer function
         }
         else if (select == 2) {
            employer.addNewEmployee(scanner); //add employee with user inputs, Employer function
         } 
         else if (select == 3) {
            System.out.print("Enter the ID of the employee you wish to remove: "); //matches ID and removes respective employee
            int removing = scanner.nextInt();
            if (employer.removeEmployee(removing)) {
               System.out.println("Employee with the ID [" + removing + "] removed successfully.");
            } 
            else {
               System.out.println("No employee found with ID [" + removing + "].");
            }
         } 
         else if (select == 4) { //Exit program
            running = false;
            System.out.println("Program stopped.");
         } 
         else {
            System.out.println("Invalid selection. Please choose a valid option.");
         }
       }
    } 
 } 