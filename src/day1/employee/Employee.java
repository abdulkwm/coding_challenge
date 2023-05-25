package day1.employee;

public class Employee {
    private static int count = 1;
    private int id;
    private String name;
    private String department;
    private int age;
    private String email;

    public Employee() {
    }

    public Employee(String name, String department, int age, String email) {
        this.id = count;
        count++;
        this.name = name;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
