package Employee;
public class FullTimeEmployee extends Employee {

    private double basicSalary;

    public FullTimeEmployee(int id, String name,double basicSalary){
        super(id, name);
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(){
        double hra = basicSalary*0.20;
         double da = basicSalary*0.10;
          double pf = basicSalary*0.05;

          return basicSalary + hra + da - pf;
        
    }
    
}
