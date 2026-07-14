import java.util.ArrayList;

enum EducationLevel {
    BACHELOR, MASTER, PHD
}

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

interface Enrollable {
    void enroll(Course course);
}

class Student extends Person implements Enrollable {
    private String studentId;
    private EducationLevel educationLevel;
    private ArrayList<Course> courses;

    public Student(String name, int age, String studentId, EducationLevel educationLevel) {
        super(name, age);
        this.studentId = studentId;
        this.educationLevel = educationLevel;
        this.courses = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    @Override
    public void enroll(Course course) {
        courses.add(course);
        System.out.println(name + " enrolled in " + course.getName());
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", studentId='" + studentId + "', educationLevel=" + educationLevel + "}";
    }
}

class Course {
    private String name;
    private String code;
    private int credits;

    public Course(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course{name='" + name + "', code='" + code + "', credits=" + credits + "}";
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "S001", EducationLevel.BACHELOR);
        Student student2 = new Student("Bob", 22, "S002", EducationLevel.MASTER);

        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Physics", "PHY101", 4);

        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        System.out.println(student1);
        student1.displayCourses();

        System.out.println(student2);
        student2.displayCourses();
    }
}