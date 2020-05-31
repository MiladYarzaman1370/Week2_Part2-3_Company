
package week2_part2.pkg3_compani;

import employee.Employee;
import manager.Manager;
import developer.Developer;
import business.Bussiness;
import departman.Departman;

public class Main {

    
    public static void main(String[] args) {
        
        Departman departman=new Departman("Departeman A");
        Employee manager1=new Manager("manager1","30/05/1370",3400000,departman);
        Employee developer1=new Developer("developer1","30/09/1360",5200000);
        Employee bussines=new Bussiness("busines1", "2/4/1345", 1500000);
        ((Developer)developer1).setLanguige("Java");
        ((Bussiness)bussines).setMedia("Instagram");
         
        System.out.println("manager1 departman is:"+manager1.getDepartman().getName());
        System.out.println("developer1 departman is:"+developer1.getDepartman());
        System.out.println("business1 departman is:"+bussines.getDepartman());
              System.out.println("//////////////////////////////////");
              
        System.out.println("developer1 languige is:"+((Developer)developer1).getLanguige());
        System.out.println("business1 Media is:"+((Bussiness)bussines).getMedia());
    }
    
}
