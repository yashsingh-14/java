class Parant {

    void parantproperty(){
        System.out.println("Parant Property");
    }
}

class Child extends Parant{

    void Childproperty(){
        System.out.println("Child Property");
    }
}

class GrandChild extends Child{

    void Childproperty(){
        System.out.println( " Grand Child Property");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c. Childproperty();
        
    }
}