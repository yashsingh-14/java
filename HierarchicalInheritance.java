class Parant{
    void ParentProperty(){
        System.out.println("Parent's Property");
    }
}

class Brother extends Parent{
    void BrotherProperty(){
        System.out.println("Brother's Property");
    }
}

class Sister extends Parant{
    void SisterProperty(){
        System.out.println("Sister's Property");
    }
}

class HierarchicalInheritance{
    public static void main(String[] args) {
        
        Brother B = new Brother();
        B.BrotherProperty();
        B.ParentProperty();

        System.out.println();

        Sister S = new Sister();
        S.SisterProperty();
        S.ParentProperty();

        System.out.println();

        Parent P = new Parent();
        P.ParentProperty();


    }
}