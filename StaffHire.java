/**
 * 
 *
 * @Nimesh Poudel
 * @version v0.1
 */


public class StaffHire {
    //Initializing variables
    private int vacancyNo;
    private String designation;
    private String jobType;
    //creating constructor
    public StaffHire(int vacancyNo, String designation, String jobType ){
        this.vacancyNo=vacancyNo;
        this.designation=designation;
        this.jobType=jobType;
    }
    //creating a get method for vacancyNo
    public int getVacancyNo(){
        return vacancyNo;
    }
    //creating a set method for vacancyNo
    public void setVacancyNo(int vacancyNo){
        this.vacancyNo=vacancyNo;
    }
    //creating a get method for designation
    public String getDesignation(){
        return designation;
    }
    //creating a set method for designation
    public void setDesignation(String designation){
        this.designation=designation;
    }
    //creating a get method for jobType
    public String getJobType(){
        return jobType;
    }
    //creating a set method for jobType
    public void setJobType( String jobType){
        this.jobType=jobType;
    }
}
