package BMI;
import java.util.ArrayList;
import java.util.Scanner;

class Student1 {
    String name;
    int rollNumber;
    double feesPaid;
    double totalFees;

    Student1(String name, int rollNumber, double totalFees) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    void payFees(double amount) {
        feesPaid += amount;
    }

    double getRemainingFees() {
        return totalFees - feesPaid;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Fees: $" + totalFees);
        System.out.println("Fees Paid: $" + feesPaid);
        System.out.println("Remaining Fees: $" + getRemainingFees());
    }
}

public class FeesManagementSystem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student1> students = new ArrayList<>();

        while (true) {
            System.out.println("\nFees Management System");
            System.out.println("1. Add Student");
            System.out.println("2. show Student Information");
            System.out.println("3. Exit");
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();

                    System.out.print("Enter the roll number: ");
                    int rollNumber = scanner.nextInt();

                    System.out.print("Enter total fees: ");
                    double totalFees = scanner.nextDouble();

                    Student1 student = new Student1(name, rollNumber, totalFees);
                    students.add(student);
                    System.out.println("Student added successfully!!!");
                    break;

                case 2:
                    System.out.print("Enter roll number to display student information: ");
                    int searchRollNumber = scanner.nextInt();

                    boolean found = false;
                    for (Student1 s : students) {
                        if (s.rollNumber == searchRollNumber) {
                            s.displayInfo();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting.........!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid!!! Please enter a valid infomartion.");
            }
        }
    }
}


