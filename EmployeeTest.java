/**
 *
 * @author Aaron Kurth
 */
public class EmployeeTest 
{
    public static void main(String[] args) 
    {
       Employee e1 = new Employee( "Aaron", "Kurth", 10000.00); //set first name, last name, and monthly
       Employee e2 = new Employee("Brandy", "Turner", 9000.00); //set first name, last name, and monthly
       
       System.out.printf("The yearly salary of %s %s is %.2f%n", e1.getFirstName(), e1.getLastName(), e1.getYearlySalary()); //get employee info
       System.out.printf("The yearly salary of %s %s is %.2f%n%n", e2.getFirstName(), e2.getLastName(), e2.getYearlySalary()); //get employee info
       
       System.out.println("Giving everyone a RAISE!!!");
       System.out.printf("The yearly salary of %s %s is %.2f%n", e1.getFirstName(), e1.getLastName(), e1.getRaisedSalary()); //get employee info with raise
       System.out.printf("The yearly salary of %s %s is %.2f%n", e2.getFirstName(), e2.getLastName(), e2.getRaisedSalary()); //get employee info with raise
    }
    
}
