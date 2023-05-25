package day1.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;
        do {
            while (!validInput) {
                System.out.println("********Menu********");
                System.out.println("1.Add Student");
                System.out.println("2.Update Student");
                System.out.println("3.Show StudentByID");
                System.out.println("4.Show Student");
                System.out.println("5.Delete Student");
                System.out.println("6.Exit");
                System.out.println("Enter Choice: ");
                try {
                    choice = sc.nextInt();
                    validInput = true;
                    switch (choice) {
                        case 1:
                            studentDAO.addStudent();
                            break;
                        case 2:
                            studentDAO.updateStudentByID();
                            break;
                        case 3:
                            studentDAO.showStudentByID();
                            break;
                        case 4:
                            studentDAO.showStudents();
                            break;
                        case 5:
                            studentDAO.deleteStudent();
                            break;
                        case 6:
                            System.out.println("Exiting......");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid input");
                            break;

                    }
                }catch (InputMismatchException e){
                    System.out.println("Invalid input . please enter valid integer");
                    sc.nextLine();
                }
            }
            validInput = false;
        } while (choice != 6);
    }
}
