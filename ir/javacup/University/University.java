package ir.javacup.University;

import java.util.Scanner;
import java.util.regex.*;
public class University {
    public enum Education {
        Bachelor(1),
        MasterDegree(2),
        Phd(3);

        private final int EducationNumber;

        Education(int EducationNumber) {
            this.EducationNumber = EducationNumber;
        }

        public int getEducationNumber() {
            return this.EducationNumber;
        }
    }

    private Education education;
    private String name;
    private String lastname;
    private String phonenumber;
    private String password;
    private String birthday;

    private static final String PHONE_REGEX = "^09[0-9]{9}$";
    private static final String PASS_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private static final String teachername = "ali alavie , hadi yousefi";

    public University(String name, String lastname, String phonenumber, String password, String birthday, Education Education) {
        this.name = name;
        this.lastname = lastname;
        setPhoneNumber(phonenumber);
        setPassword(password);
        this.birthday = birthday;
        this.education = Education;
    }

    public String getName() { return name; }
    public String getLastName() { return lastname; }
    public String getPhoneNumber() { return phonenumber; }
    public String getPassword() { return password; }
    public String getBirthday() { return birthday; }
    public Education getEducation() { return education; }
    public String getteachername(){return  teachername;}

    public void setPhoneNumber(String phonenumbr) {
        if (phonenumbr.matches(PHONE_REGEX)) {
            System.out.println("Phone number saved successfully.");
            this.phonenumber = phonenumbr;
        } else {
            System.out.println("Invalid phone number! Must be 11 digits starting with 09.");
        }
    }

    public void setPassword(String password) {
        if (password.matches(PASS_REGEX)) {
            System.out.println("Password saved successfully.");
            this.password = password;
        } else {
            System.out.println("Invalid password! Must be at least 8 characters with uppercase, lowercase, number, and special character.");
        }
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "University{name='" + name + "', lastname='" + lastname + "', phonenumber='" + phonenumber + "', password='" + password + "', birthday='" + birthday + "', education=" + education + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("____information of user____");

        System.out.print("Enter your education (Bachelor, MasterDegree, Phd): ");
        String eduInput = scanner.nextLine();
        Education education = Education.valueOf(eduInput);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        System.out.print("Enter your birthday (as a number, 2000/5/12): ");
        String birthday = scanner.nextLine();

        University user = new University(name, lastName, phone, password, birthday, education);
        System.out.println("Teacher Name: " + user.getteachername());
        System.out.println("\n Registration successful!");
        System.out.println("User Information:");
        System.out.println(user);

        scanner.close();
    }
}