
package employee;

import departman.Departman;

public abstract class Employee  {
    
   private String name,hireDate;
    private float salary;
    private Departman departman;

    public Employee(String name, String hireDate, float salary, Departman departman) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.departman = departman;
    }
    

    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public float getSalary() {
        return salary;
    }

    public Departman getDepartman() {
        return departman;
    }
    

    public Employee(String name, String hireDate, float salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.departman=null;
    }
    
    
}
