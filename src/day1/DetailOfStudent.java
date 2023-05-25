package day1;

public class DetailOfStudent {
    private int rollNumber;
    private String name;
    private String address;
    private String email;

    public DetailOfStudent(int rollNumber, String name, String address, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    @Override
    public String toString() {
        return "DetailOfStudent{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        DetailOfStudent detailOfStudent = new DetailOfStudent(1,"Abdu","New York","abdu@gmail.com");
        DetailOfStudent detailOfStudent1 = new DetailOfStudent(2,"zakir","Columbus","zakir@gmail.com");
        System.out.println(detailOfStudent);
        System.out.println(detailOfStudent1);
    }
}
