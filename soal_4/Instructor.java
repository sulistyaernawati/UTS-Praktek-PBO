/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_4;

/**
 *
 * @author Sulistya Ernawati
 */
public class Instructor {
     private String lastName;
    private String firstName;
    private String officeNumber;
    
    public Instructor(String lname, String fname, String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    
    public Instructor(Instructor object2) {
        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }
    
    public void set(String lname, String fname, String office) {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    
    public String toString() {
        String str = "Last Name: " + lastName + 
                "\nFirst Name: " + firstName + 
                "\nOffice Number: " + officeNumber;
        return str;
    }
}
