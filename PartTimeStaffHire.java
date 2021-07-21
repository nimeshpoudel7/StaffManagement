import javax.swing.*;

/**
 * 
 *
 * @Nimesh Poudel
 * @version v0.1
 */
public class PartTimeStaffHire extends StaffHire
{
    private int workHour;
    private int wagePerHour;
    private String staffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    INGNepal back = new INGNepal();
    //creating a constructor for PartTimeStaffHire
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType,int workHour, int wagePerHour, String shifts)
    {
        super(vacancyNo, designation, jobType);
        this.workHour=workHour;
        this.wagePerHour=wagePerHour;
        this.shifts=shifts;
        staffName="";
        joinDate="";
        qualification="";
        appointedBy="";
        joined= false;
        terminated=false;
    }
    //creating accessor methods for each attribute
    public int getworkHour(){
        return workHour;
    }
    public int getwagePerHour(){
        return wagePerHour;
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
    public String getshifts(){
        return shifts;
    }
    public Boolean getjoined(){
        return joined;
    }
    public Boolean getterminated(){
        return terminated;
    }

    /*creating a method to hire a staff
     * if a staff has not been hired the input values will be inserted
     * otherwise a message will be displayed.
     */
    public void partTimehire( String staffName, String joinDate, String qualification, String appointedBy){
        if(joined==false){
            this.staffName=staffName;
            this.joinDate=joinDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
        else{
            System.out.println( getstaffName() + " has already been hired on "+ getjoinDate());
        }
    }

    //creating a method to terminate a hired staff
    public void terminate(){
    	ImageIcon img1= new ImageIcon("image/suc.png");
        if( terminated==true){
            JOptionPane.showMessageDialog(back.frame,"The Staff's record has already been terminated","Success",JOptionPane.ERROR_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog( back.frame,getstaffName() + " has been terminated","Success",JOptionPane.PLAIN_MESSAGE,img1);
            staffName="";
            joinDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
           
        }
    }
}