package models;

/*Inherited by Employee */
public class Person {
    private String name;
    private String surname;
    private String personalNumber;

    //get
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    //set
    public void setName(String name) {
        if(name!=null && name.matches("[A-ZĀĒŪĪĶĻČŽŠĢŅ]{1}[a-zāēūīķļčžšģņ]+\s?([A-ZĀĒŪĪĶĻČŽŠĢŅ]{1}[a-zāēūīķļčžšģņ]+)?"))
            this.name = name;
        else
            this.name = "noname";
    }
    
    public void setPersonalNumber(String personalNumber) {
        if(personalNumber!=null && personalNumber.matches("[0-9]{6}[-]{1}[0-9]{5}"))
            this.personalNumber = personalNumber;
        else
            this.personalNumber = "000000-00000";
    }

    public void setSurname(String surname) {
        if(surname!=null && surname.matches("[A-ZĀĒŪĪĶĻČŽŠĢŅ]{1}[a-zāēūīķļčžšģņ]+\s?([A-ZĀĒŪĪĶĻČŽŠĢŅ]{1}[a-zāēūīķļčžšģņ]+)?"))
            this.surname = surname;
        else
            this.surname = "noname";
    }

    //Constructor
    public Person(){
        setName("noname");
        setSurname("noname");
        setPersonalNumber("000000-00000");
    }

    public Person(String name, String surname, String personalNumber){
        setName(name);
        setSurname(surname);
        setPersonalNumber(personalNumber);
    }

    //toString
    public String toString() {
        return "Person [Name: " + name + " Surname: " + surname + " Personal_Number: " + personalNumber + " ]";
    }
    
}
