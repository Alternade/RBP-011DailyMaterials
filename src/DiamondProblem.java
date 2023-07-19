public class DiamondProblem {
    public static void main(String[] args) {
       

    }
}
class A{
    public void print(){
        System.out.println("This is class A");
    }
}

interface B{
    public void print();
}

interface C{
    public void print();
}

class D implements B,C{

    @Override
    public void print() {
        System.out.println("This is class D");
    }
}
