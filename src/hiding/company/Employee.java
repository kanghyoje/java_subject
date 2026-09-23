package hiding.company;

public class Employee {
    public String name;
    protected String department;
    String email;
    private int salary;

    public void printinfor() {
        System.out.println(name);
        System.out.println(department);
        System.out.println(email);
        System.out.println(salary);
    }
}
