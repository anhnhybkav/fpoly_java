package java2.lab6;

import java.util.ArrayList;

public class personModel<T> {
    public ArrayList<T> li = new ArrayList<T>();

    public void addObject(T object) {
        li.add(object);
    }

    public void display() {
        for (T e : li) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        personModel<Student> students = new personModel<>();
        students.addObject(new Student("1", "jae", 1000));
        students.addObject(new Student("2", "anh", 1000));
        students.display();

        personModel<Employee> employees = new personModel<>();
        employees.addObject(new Employee("1", "jae", 1000));
        employees.addObject(new Employee("2", "anh", 1000));
        employees.display();

        personModel<String> names = new personModel<>();
        names.addObject("jae");
        names.addObject("anh");
        names.display();
    }
}