package Employee;
public abstract class Employee{
    protected String name;
    protected int id;
    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public void showDetails(){
        System.out.println("ID:"+id+"name:"+name);
    }
}