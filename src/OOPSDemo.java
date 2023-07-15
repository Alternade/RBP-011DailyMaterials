public class OOPSDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Akarsh","Karn", 7);
        Student s2 = new Student("Sonal", "ade",10);
        System.out.println(s1);
        System.out.println(s2);
    }
}
class Student{
    String firstName ;
    String lastName ;
    int rollNo ;

    Student(String f, String l,int r ){
        firstName = f;
        lastName = l;
        rollNo = r;
    }

    @Override
    public String toString() {
        return "First Name : "+firstName + "\nLastName : "+ lastName+ "\nRoll No : " + rollNo;
    }
}
//null is the default value of string
//default value of integer is 0\
//modeling