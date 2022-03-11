package models;

//TODO seems like no problems here, needs more testing though

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeId;
    private LocalDate contractDate;
    private String contractNumber;

    private static int idCounter = 1000;

    //get
    public int getEmployeeId(){
        return employeeId;
    };

    public LocalDate getContractDate(){
        return contractDate;
    };

    public String getContractNumber(){
        return contractNumber;
    };

    //set
    /**
     * 
     * @param year
     * @param month //byte value
     * @param day   //byte value
     * 
     *  Also checks if date is not earlier than 2022.03.24, day value is not
     *  higher than 31 (29 if it is February) and not smaller than 1, month
     *  value is not higher than 12 and not smaller than 1.
     * 
     *  TODO maybe change values of month and day to integer, so it would be easier
     *  TODO to type then when creating new instance of a class? If so, then add additional checks.
     */
    public void setContractDate(int year, byte month, byte day){
        if ((year == 2022 && month == 3 && day < 24) || (year == 2022 && month < 3) || month > 12 || day > 31 || (month==2 && day > 29) || month < 1 || day < 1)
            contractDate = LocalDate.of(2022, 3, 24);
        else
            contractDate = LocalDate.of(year, month, day);
    };

    public void setContractNumber(){
        contractNumber = contractDate.getYear() + "_" + getEmployeeId() + "_" + getName().charAt(0) + "_" + getSurname().charAt(0);
    };

    public void setEmployeeId(){
        employeeId = idCounter;
        idCounter++;
    }

    //constructors
    public Employee(){
        setEmployeeId();
        setContractDate(2022, (byte)03, (byte)24);
        setName("noname");
        setSurname("noname");
        setPersonalNumber("000000-00000");
        setContractNumber();
    }

    public Employee(String name, String surname, String personalNumber, int year, byte month, byte day){
        setEmployeeId();
        setContractDate(year, month, day);
        setName(name);
        setSurname(surname);
        setPersonalNumber(personalNumber);
        setContractNumber();
    }


    //toString
    public String toString() {
        return "Employee [contractDate=" + contractDate + ", contractNumber=" + contractNumber + ", employeeId="
                + employeeId + ", name=" + getName() + ", surname=" + getSurname() + ", personalNumber=" + getPersonalNumber() + "]";
    };
}
