/**
 * 
 *
 * @author Nimesh poudel
 * @version 0.1
 */
public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workHour;
    private String staffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    //creating a constructor for FullTimeStaffHire
    public FullTimeStaffHire ( int vacancyNo, String designation, String jobType, int salary, int workHour){
        super(vacancyNo, designation, jobType);
        this.salary=salary;
        this.workHour=workHour;
        staffName="";
        joinDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    //creating accessor methods for each attribute
    public int getsalary(){
        return salary;
    }
    public int getworkHour(){
        return workHour;
    }
    public String getstaffName(){
        return staffName;
    }
    public String getjoinDate(){
        return joinDate;
    }
    public String getqualification(){
        return qualification;
    }
    public String getappointedBy(){
        return appointedBy;
    }
    public Boolean getjoined(){
        return joined;
    }
    /*creating a method to set salary
     * if the staff is not hired the inserted value will be inserted
     * into salary otherwise a messeage will be shown
     */
    public void setsalary(int salary){
        if(joined==false){
            this.salary=salary;
        }
        else{
            System.out.println("It is not possible to change the salary of hired staff");
        }
    }
    //creating a method to set work hours
    public void setworkhour (int workHour){
        this.workHour=workHour;
    }
    /*creating a method to hire a staff
     * if a staff has not been hired the input values will be inserted
     * otherwise a message will be displayed.
     */
    public void fullhire ( String staffName, String joinDate, String qualification, String appointedBy){
        if(joined==false){
            this.staffName=staffName;
            this.joinDate=joinDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
        }
        else{
            System.out.println( getstaffName() + " has already been hired on "+ getjoinDate());
        }
    }
    /*creating a method to display info about the staff
     * if a staff has not been hired the input values will be inserted
     * otherwise a message will be displayed.
     */
    public void DisplayInfo(){
        if(joined==true){
            System.out.println("----------------------------------------");
            System.out.println("Staff Name = " + getstaffName());
            System.out.println("Salary = " + getsalary());
            System.out.println("Work Hours = " + getworkHour());
            System.out.println("Joined Date = " + getjoinDate());
            System.out.println("Qualification = " + getqualification() );
            System.out.println("Appointed By = " + getappointedBy());
            System.out.println("----------------------------------------");
        }
        else{
            System.out.println("Staff has not been hired");
        }
    }
}