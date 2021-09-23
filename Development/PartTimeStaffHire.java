        /**This is the sub-class of StaffHire class.
         * This class gives its signature to each StaffHire class.
         * @author(Nirmal Khand Khawas)
         * Date: 01/15/2020
         */
        public class PartTimeStaffHire extends StaffHire{//creating subclass as PartTimeStaffHire of class StaffHire.
            private int workingHour; //declaring instance variables.
            private int wagePerHour;
            private String staffName;
            private String joiningDate;
            private String qualification;
            private String appointedBy;
            private String shifts;
            private boolean joined;
            private boolean terminated;
            //creating constructor.
        public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagePerHour, String shifts){
            super(vacancyNumber, designation, jobType);//calling the constructor of parent class.
            this.workingHour=workingHour;    //initialising variables by assigning the value of constructor's parameters.
            this.wagePerHour=wagePerHour;
            this.shifts=shifts;
            this.staffName="";      //initialising variables as empty string.
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            this.joined=false;      //initialising variable as false.
            this.terminated=false;
       }
        //method to return int value of Working hour of Staffs
     public int getWorkingHour(){
        return workingHour;
     }
    //method to return int value of Wage Per Hour of Staffs
    public int getWagePerHour(){
        return wagePerHour;
    }  
    //method to return String value of Shifts of Staffs
    public String getShifts(){
        return shifts;
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
    //method to return Boolean value of joined Staffs
    public boolean isTerminated(){
        return terminated;
    }
    
    public void setShifts(String shifts){
        if(!joined){
            this.shifts=shifts;
        }else{
            System.out.println("Staff is already hired");
        }
    }
    //defining hirePartTimeStaff method
    public void hirePArtTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy){
        if(!joined){
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            this.terminated=false;
            /*if joined is false, then updating the values of staffName, joiningDate,
            qualification & appointedBy to the one given in the parameter &
            changing the value of joined to true & terminated to false*/
        }else{
            System.out.println("Staff is already hired");
            System.out.println("Staff Name: "+getStaffName());
            System.out.println("Joined Date: "+getJoiningDate());
            //if joined is true then, printing of the staff is already appointed.
        }
    } 
    
    public void terminate(){//defining terminate method
        if(!terminated){
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            this.joined=false;
            this.terminated=true;
            /*if joined is false, then updating the values of staffName, joiningDate,
            qualification & appointedBy to empty strings &
            changing the value of joined to false & terminated to true*/
        }else{
            System.out.println("Staff is already Terminated");
             //if terminated is true then, printing of the staff is already terminated.
        }
    }
   
   
    public void show(){ //creating display method.
        super.display();//calling display method from parent class.
        if(joined){
            System.out.println("Name of Staff: "+getStaffName());
            System.out.println("Wages Per Hour of Staff: "+getWagePerHour());
            System.out.println("Working Hour of Staff: "+getWorkingHour());
            System.out.println("Staff Joined: "+getJoiningDate());
            System.out.println("Qualification of Staff: "+getQualification());
            System.out.println("Staff Appointed By: "+getAppointedBy());
            System.out.println("Income Per Day: "+(wagePerHour*workingHour));
            /*if joined is true then, displaying staffName, wagesPerHour,
            workingHour, joiningDate,qualification, appointedBy &
            income per day(obtained by multiplying wagesPerHour & workingHour)with suitable annotations*/
        }        
    }    
}