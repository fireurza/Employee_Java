/**
 *
 * @author Aaron Kurth
 */
public class Employee
{
    private String firstName; //variable that stores first name
    private String lastName; //variable that stores last name
    private double monthlySalary; //variable that stores monthly salary
    
    
    public Employee (String fname, String lname, double msalary)
    {
        firstName = fname; //init
        lastName = lname; //init
        monthlySalary = msalary; //init
        
        if  (msalary < 0.0) 
        {
            monthlySalary = 0.0; //if monthly salary is negative then it sets it to 0
        }
    }
    
    public void setFirstName (String fname)
    {
        firstName = fname; //sets first name
    }
    
    public void setLastName (String lname)
    {
        lastName = lname; //sets last name
    }
    
    public void setMonthlySalary (double msalary)
    {
        monthlySalary = msalary; //sets monthly salary
    }
    
    public String getFirstName ()
    {
        return firstName; //gets first name
    }
    
    public String getLastName ()
    {
        return lastName; //gets last name
    }
    
    public double getMonthlySalary ()
    {
        return monthlySalary; //gets monthly salary
    }
    
    public double getYearlySalary ()
    {
        double yearlySalary = monthlySalary * 12; //calculates the yearly salary
        return yearlySalary; //gets the yearly salary
    }
    
    public double getRaisedSalary ()
    {
        double raise = monthlySalary * 0.1; //calculates the raise of 10%
        double raiseSalary = (monthlySalary + raise) * 12; //calculates the new yearly salary
        return raiseSalary; //returns the new yearly salary
    }
}
