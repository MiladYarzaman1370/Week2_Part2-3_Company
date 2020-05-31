package business;

import employee.Employee;

public class Bussiness extends Employee{
   private String media;

    public Bussiness(String name, String hireDate, float salary) {
        super(name, hireDate, salary);
        
    }
     
    public void setMedia(String media) {
        this.media = media;
    }
 

    public String getMedia() {
        return media;
    }
}
