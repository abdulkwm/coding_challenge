package day1.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement employeeManagement = new EmployeeManagement();
        while (true){
            System.out.println("Please choose the option");
            System.out.println("1. Add employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. show Employee");
            System.out.println("4. Exit");

            int option = sc.nextInt();
            switch (option){
                case 1:
                   employeeManagement.addEmployee();
                    break;
                case 2:
                   employeeManagement.deleteEmployee();
                    break;
                case 3:
                   employeeManagement.showEmployees();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
