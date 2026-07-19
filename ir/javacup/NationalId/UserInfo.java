package ir.javacup.NationalId;

import java.util.Scanner;

class InvalidNationalIdException extends Exception {
    public InvalidNationalIdException(String message) {
        super(message);
    }
}

class InvalidPhonenumberException extends Exception {
    public InvalidPhonenumberException(String message) {
        super(message);
    }
}

public class UserInfo {
    private String name;
    private String lastname;
    private String nationalId;
    private String phonenumber;
    private String password;

    public UserInfo(String name, String lastname, String nationalId, String phonenumber, String password) 
            throws InvalidNationalIdException, InvalidPhonenumberException {
        this.name = name;
        this.lastname = lastname;
        setNationalId(nationalId);
        setPhonenumber(phonenumber);
        this.password = password;
    }

    public String getName() { return name; }
    public String getLastname() { return lastname; }
    public String getNationalId() { return nationalId; }
    public String getPhonenumber() { return phonenumber; }
    public String getPassword() { return password; }

    public void setNationalId(String nationalId) throws InvalidNationalIdException {
        if (nationalId == null || !nationalId.matches("^[0-9]{10}$")) {
            throw new InvalidNationalIdException("National ID must be exactly 10 digits.");
        }
        this.nationalId = nationalId;
    }

    public void setPhonenumber(String phonenumber) throws InvalidPhonenumberException {
        if (phonenumber == null || !phonenumber.matches("^09[0-9]{9}$")) {
            throw new InvalidPhonenumberException("Phone number must be 11 digits and start with 09.");
        }
        this.phonenumber = phonenumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("____ User Registration ____");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your last name: ");
            String lastname = scanner.nextLine();

            System.out.print("Enter your national ID: ");
            String nationalId = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            String phonenumber = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            UserInfo user = new UserInfo(name, lastname, nationalId, phonenumber, password);

            System.out.println("\n User registered successfully!");
            System.out.println("Name: " + user.getName());
            System.out.println("Last Name: " + user.getLastname());
            System.out.println("National ID: " + user.getNationalId());
            System.out.println("Phone: " + user.getPhonenumber());

        } catch (InvalidNationalIdException | InvalidPhonenumberException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}