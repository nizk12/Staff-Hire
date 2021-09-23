/**This is the main or parent class of FullTimeStaffHire and PartTimeStaffHire.
 * This class gives its signature to each StaffHire class.
 * @author(Nirmal Khand Khawas)
 * Date: 01/15/2020
 */
public class StaffHire{//creating parent class.
    //declaring instance variables 
    private int vacancyNumber;
    private String designation;
    private String jobType;//Either Full or PartTime
    
    public StaffHire(int vacancyNumber, String designation, String jobType){
        this.vacancyNumber=vacancyNumber;//initialising variables by assigning the value of constructor's parameters.
        this.designation=designation;
        this.designation=designation;
        this.jobType=jobType;
    }
    // use of  getter method for each attribute inorder to return the needed value.
    //method to return the int value of vacancyNumber
    public int getVacancyNumber(){
        return vacancyNumber;
    }
    
    //use of  setter method for each attribute inorder to retrive and update for variables.
    public void setVacancyNumber(int vacancyNumber){
        this.vacancyNumber=vacancyNumber;
    }
    
    //method to return the String value of designation
    public String getDesignation(){
        return designation;
    }
    //use of  setter method for each attribute inorder to retrive and update for variables.
    public void setDesignation(String designation){
        this.designation=designation;
    }
    
    //method to return the String value of jobType
    public String getJobType(){
        return jobType;
    }
    //use of  setter method for each attribute inorder to retrive and update for variables.
    public void setJobType(String jobType){
        this.vacancyNumber=vacancyNumber;
    }
    
    public void display(){//creating display method
        System.out.println("Vacancy Number For Staff = " +getVacancyNumber());
        System.out.println("Designation For Staff = " +getDesignation());
        System.out.println("Job Type For Staff = " +getJobType());
        //displaying vacancyNumber, designation & jobType //
    }
    
}