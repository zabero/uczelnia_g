package uczelnia;

public class Student {
    private String firstName;
    private String lastName;
    private String indexNumber;
    //Getery
    public String getlastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }public String getindexNumber(){
        return indexNumber;
    }
    //Setery
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String LastName){
        this.lastName = LastName;
    }
    public void setindexNumber(String indexNumber){
        this.indexNumber = indexNumber;
    }
    public Student (String firstName, String lastName, String indexNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
    }

    //override! -do sprawdzenia

    /*public String getDane(){
        return "[" + getindexNumber() +  "]" +getFirstName() + " " + getlastName();
    }
    */
    @Override
    public String toString(){
        return "[" + getindexNumber() +  "]" +getFirstName() + " " + getlastName();
    }

}
