import java.util.Scanner;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setFirstName("Sonal");
        s1.setLastName("Ade");
        s1.setBranch("Java");
        s1.setId(123);
        System.out.println("Student detail : " + s1.getFirstName() +" "+ s1.getLastName()+" "+s1.getBranch()+" "+s1.getId());

    }
}
class Student1{
    private String firstName;
    private String lastName;
    private int id;
    private String branch;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getFirstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter correct password");
        int p =sc.nextInt();
        if(p == 1234) {
            return firstName;
        }
        else return "";
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }
}