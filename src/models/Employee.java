package models;

public class Employee extends Person {
    private int employeeId;
    private int contractDate;
    private String contractNumber;

    private static int idCounter = 1000;

    //get
    public int getEmployeeId(){
        return employeeId;
    };

    public int getContractDate(){
        return contractDate;
    };

    public String getContractNumber(){
        return contractNumber;
    };

    //set
    public void setContractDate(){

    };

    public void setContractNumber(){

    };
    //constructors

    //toString

}
