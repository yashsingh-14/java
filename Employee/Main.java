package Employee;
public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(1, "Aman", 30000);
        Employee e2 = new PartTimeEmployee(2, "Rohit", 800, 40);

        e1.showDetails();
        System.out.println("Full-time salary: " + e1.calculateSalary());

        System.out.println();

        e2.showDetails();
        System.out.println("Part-time salary: " + e2.calculateSalary());
    }
}
