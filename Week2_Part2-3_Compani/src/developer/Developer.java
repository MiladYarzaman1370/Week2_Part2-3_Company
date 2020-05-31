
package developer;

import employee.Employee;

public class Developer extends Employee{
    private String languige;
    private int type;

    public Developer(String name, String hireDate, float salary) {
        super(name, hireDate, salary);
    }

    public String getLanguige() {
        return languige;
    }

    public void setLanguige(String languige) {
        this.languige = languige;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
    
}
