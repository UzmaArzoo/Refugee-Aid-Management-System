/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author hp
 */
public class refugeedetails implements java.io.Serializable {
      
    private String refugeeid;
    private String name;
    private int age;
    private String gender;
    private String country;
    private String fathername;
    private String Mothername;
    private int childno;

    public String getRefugeeid() {
        return refugeeid;
    }

    public void setRefugeeid(String refugeeid) {
        this.refugeeid = refugeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return Mothername;
    }

    public void setMothername(String Mothername) {
        this.Mothername = Mothername;
    }

    public int getChildno() {
        return childno;
    }

    public void setChildno(int childno) {
        this.childno = childno;
    }
   
    
}
