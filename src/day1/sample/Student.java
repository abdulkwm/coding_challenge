package day1.sample;

public class Student {
    private static int count = 1;
    private int id;
    private String name;
    private String address;
    private String email;
//    default constructor
    public Student() {
    }
//    parametrize constructor
    public Student(String nameOfStudent, String addressOfStudent, String emailOfStudent){
        this.id = count;
        this.name = nameOfStudent;
        this.address = addressOfStudent;
        this.email = emailOfStudent;
        count++;
    }
//    getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
//    setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
