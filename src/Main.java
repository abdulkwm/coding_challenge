public class Main {
    private static int count = 1;
    private int id;
    private String name;
    private String address;

    public Main() {
    }
    public Main(String nameOfStudent, String addressOfStudent){
    this.id = count;
    count++;
    this.name = nameOfStudent;
    this.address = addressOfStudent;
    }
//    getter methods
   public int getId(){
        return id;
   }
   public String getName(){
        return name;
   }
   public String getAddress(){
        return address;
   }
//   setter methods
   public void setId(int id){
        this.id = id;
   }
   public void setName(String name){
        this.name = name;
   }
   public void setAddress(String address){
        this.address = address;
   }
//   tostring method
    public void showDetailsOfStudent(){
        System.out.println("Id :" + id);
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
    }

    @Override
    public String toString() {
        return "Main{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Main main = new Main("Abdu","Columbus");
        Main main1 = new Main("zakir","New York");
        Main main2 = new Main("sekina","DC");
        Main main3 = new Main("john","texas");
        Main main4 = new Main("obama","Ohio");
        System.out.println("Details Of Student");
        main.showDetailsOfStudent();
        System.out.println("*************************");
        main1.showDetailsOfStudent();
        System.out.println("*************************");
        main2.showDetailsOfStudent();
        System.out.println("*************************");
        main3.showDetailsOfStudent();
        System.out.println("*************************");
        main4.showDetailsOfStudent();
    }
}