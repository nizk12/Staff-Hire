/**This is the sub-class of StaffHire class.
 * This class gives its signature to each StaffHire class.
 * @author(Nirmal Khand Khawas)
 * Date: 01/15/2020
 */
public class FullTimeStaffHire extends StaffHire{//creating sub class as FullTimeStaffHire of class StaffHire.
    private int salary;//declaring instance variables.
    private int workingHour;//per day
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    //Constructor with parameter to initialization attributes
    public FullTimeStaffHire(int vacancyNumber, String designation, String jobType, int salary, int workingHour){
        super(vacancyNumber, designation, jobType);//calling the constructor of parent class.
        this.salary=salary;//initialising variables by assigning the value of constructor's parameters.
        this.workingHour=workingHour;
        this.staffName="";//initialising variables as empty string.
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined= false; //initialising variable as false.
    }
    // creating getter method for each attribute inorder to return the value.
    //method to return int value of Salary of Staffs
    public int getSalary(){
        return salary;
    }
    //method to return int value of Working Hour of Staffs
    public int getWorkingHour(){
        return workingHour;
    }
    //method to return String value of Staff Name of Staffs
    public String getStaffName(){
        return staffName;
    }
    //method to return String value of Joining date of Staffs
    public String getJoiningDate(){
        return joiningDate;
    }
    //method to return String value of Qualification of Staffs
    public String getQualification(){
        return qualification;
    }
    //method to return String value of AppointedBy of Staffs
    public String getAppointedBy(){
        return appointedBy;
    }
    //method to return Boolean value of joined Staffs
    public boolean isJoined(){
        return joined;
    }
    
    public void setSalary(int salary){//creating setter method for salary
        if(!joined){
            this.salary=salary;
            /*if joined is false then,
            the value of the  salary is changing to the one given in the parameter*/
        }else{
            System.out.println("Staff is already appointed so new salary can't be changed");
            //if joined is false then, printing of the salary couldn't be changed. 
        }
    }
    public void setWorkingHour(int workingHour){//creating setter method for workingHour
        this.workingHour= workingHour;
    }
    
    //method with parameter values to appoint/hire Staff
    public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if (!joined){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            /*if joined is false, then updating the values of staffName, joiningDate,
            qualification & appointedBy to the one given in the parameter &
            changing the value of joined to true*/
        }else{
            System.out.println("Staff Name: "+staffName);
            System.out.println("Staff Joined: "+joiningDate);
            System.out.println("Staff is already Appointed");
            //if joined is true then, printing  of the staff is already appointed.
        }
    }
    
    //method displaying the detail of staff 
    public void display(){
       super.display(); //calling display method from parent class
        if(joined){
            System.out.println("Name Of Staff: "+getStaffName());
            System.out.println("Salary of Staff: "+getSalary());
            System.out.println("Working Hour of Staff: "+getWorkingHour());
            System.out.println("Joining Date of Staff: "+getJoiningDate());
            System.out.println("Qualification for Staff: "+getQualification());
            System.out.println("Appointed By: "+getAppointedBy()); 
            /*if joined is true, displaying staffName, salary,
            workingHour, joiningDate,qualification & appointedBy
            with suitable annotations*/
       }    
    }
}