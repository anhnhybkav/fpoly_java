package java2.lab1.bai3;

public class Student extends Person {
    private int mark;
    private String grade; 

    public Student(String id, String name, int age) {
        super(id, name, age);
    }

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
        setGrade();
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    public void setGrade() {
        if(mark >= 8) {
            grade = "distinction";
        }
        else if(mark >= 7) {
            grade = "credit";
        }
        else if(mark >= 5) {
            grade = "pass";
        }
        else {
            grade = "fail";
        }
    }

    public void output() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("mark: " + mark);
        System.out.println("grade: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student("1", "anh", 18, 10);
        student.output();
    }
}
