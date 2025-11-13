class Parent {
    void ParentProperty(){
        System.out.println("Parent's Property");
    }
}

class Child extends Parent {
    void ChildProperty(){
        System.out.println("Child's Property");
    }
}

class GrandChild extends Child{
    void GrandChildProperty(){
        System.out.println("GrandChild's Property");
    }
}
class MultiLevelInheritance{
    public static void main(String[] args) {
        GrandChild G = new GrandChild();
        G.GrandChildProperty();
        G.ChildProperty();
        G.ParentProperty();

        System.out.println();

        Child C = new Child();
        C.ChildProperty();
        C.ParentProperty();
        
        System.out.println();


        Parent P = new Parent();
        P.ParentProperty();





    }
}
