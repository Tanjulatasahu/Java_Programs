package java_oops_program;

public class Data_Encapsulation {
    // private data variables
    private int ssn;
    private String empName;
    private int empAge;


    //getter and setter methods


    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args){

        Data_Encapsulation emp=new Data_Encapsulation();
        emp.setSsn(123456);
        emp.setEmpName("Tanju");
        emp.setEmpAge(28);

        System.out.println("Employee name is :" + emp.getEmpName());
        System.out.println("Employee age is :" + emp.getEmpAge());
        System.out.println("Employee ssn is :" + emp.getSsn());

    }
}
