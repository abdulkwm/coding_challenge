package day1.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagement {
//    List<Employee> employees = new ArrayList<>();
    Map<Integer, Employee> employees = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private int countId = 1;
    public void addEmployee(){
        System.out.print("Enter Employee Name: ");
        String name = sc.next();
        System.out.print("Enter Employee Department: ");
        String department = sc.next();
        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Employee Email: ");
        String email = sc.next();
        int id = countId++;
        employees.put(id, new Employee(name, department, age, email));
        System.out.println("Employee Added Successfully!");
    }
    public void deleteEmployee(){
        System.out.println("Enter employee Id to delete");
        int id = sc.nextInt();
        if (employees.containsKey(id)){
            employees.remove(id);
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee not found");
        }
    }
//        Iterator<Employee> iterator = employees.iterator();
//        boolean found = false;
//        while (iterator.hasNext()){
//            Employee employee = iterator.next();
//            if (employee.getId() == id){
//                iterator.remove();
//                found = true;
//            }
//        }
//        if (found){
//            System.out.println("Employee deleted");
//        }else {
//            System.out.println("Employee not found");
//        }
//    }
    public void showEmployees() {
        System.out.println("Employees:");
        System.out.println("ID\tName\tDepartment\tAge\tEmail");

        for (Employee employee : employees.values()) {
            System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getDepartment() + "\t\t" + employee.getAge() + "\t\t\t\t" + employee.getEmail());
        }
    }
}
