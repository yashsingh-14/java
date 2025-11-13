class Parant {
    void ParantProperty(){
        System.out.println("Parant's Property");
    }

    
}
class Child extends Parant {
    void ChildProperty(){
        System.out.println("Child's Property");
    }

    
}

class SingleInheritance{
    public static void main(String[] args) {
        Child c = new Child();
        c.ParantProperty();
        c.ChildProperty();

        System.out.println();

        Parant P = new Parant();
        P.ParantProperty();
    }
}