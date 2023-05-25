package day1.sample;

import java.util.*;

public class StudentDAO {
    //    List<Student> studentList = new ArrayList<>();
    Map<Integer, Student> studentMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private static int count = 1;

    public void addStudent() {
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        int id = count;
        count++;
//        studentList.add(new Student(name, address, email));
        studentMap.put(id, new Student(name, address, email));
        System.out.println("Student Added Successfully");
    }

    public void deleteStudent() {
        System.out.println("Enter the id of student you want to delete");
        int id = sc.nextInt();
//        Iterator<Student> iterator = studentList.iterator();
//        boolean found = false;
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getId() == id) {
//                iterator.remove();
//                found = true;
//            }
//        }
//        if (found) {
//            System.out.println("Student is deleted");
//        } else {
//            System.out.println("Student isn't found");
//        }
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("Student is deleted");
        } else {
            System.out.println("student isn't found");
        }
    }

    public void showStudents() {
        System.out.println("Students List");
//        for (Student student : studentList) {
        for (Student student : studentMap.values()) {
            System.out.println("ID :" + student.getId());
            System.out.println("Name :" + student.getName());
            System.out.println("Address :" + student.getAddress());
            System.out.println("Email :" + student.getEmail());
        }
    }

    public void showStudentByID() {
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
//        Iterator<Student> iterator = studentList.iterator();
//        boolean found = false;
//        while (iterator.hasNext()) {
//            Student studentTemp = iterator.next();
//            if (studentTemp.getId() == id) {
//                for (Student student : studentList) {
//                    System.out.println("ID :" + student.getId());
//                    System.out.println("Name :" + student.getName());
//                    System.out.println("Address :" + student.getAddress());
//                    System.out.println("Email :" + student.getEmail());
//                }
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Student with the id " + id + " is not found");
//        }
        if (studentMap.containsKey(id)) {
            Student student = studentMap.get(id);
                System.out.println("ID :" + student.getId());
                System.out.println("Name :" + student.getName());
                System.out.println("Address :" + student.getAddress());
                System.out.println("Email :" + student.getEmail());
        } else {
            System.out.println("Student with the id " + id + " is not found");
        }
    }

    public void updateStudentByID() {
        System.out.println("Enter Student ID you want to Update");
        int id = sc.nextInt();
//        Iterator<Student> iterator = studentList.iterator();
//        boolean found = false;
//        while (iterator.hasNext()) {
//            Student student = iterator.next();
//            if (student.getId() == id) {
//                found = true;
//            }
//        }
//        if (found) {
//            Student temp = studentList.get(id - 1);
//            System.out.println("Enter Name");
//            String name = sc.next();
//            temp.setName(name);
//            System.out.println("Enter Address");
//            String address = sc.next();
//            temp.setAddress(address);
//            System.out.println("Enter Email");
//            String email = sc.next();
//            temp.setEmail(email);
//            System.out.println("Student updated successfully");
//        } else {
//            System.out.println("student is not found");
//        }
        if (studentMap.containsKey(id)){
           Student studentToUpdate = studentMap.get(id);
            System.out.println("Enter Name");
            String name = sc.next();
            studentToUpdate.setName(name);
            System.out.println("Enter Address");
            String address = sc.next();
            studentToUpdate.setAddress(address);
            System.out.println("Enter Email");
            String email = sc.next();
            studentToUpdate.setEmail(email);
            System.out.println("Student updated successfully");
        }else {
            System.out.println("Student is not found");
        }
    }
}
