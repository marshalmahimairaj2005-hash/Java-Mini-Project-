import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        String name, dept;
        double salary;

        System.out.println("EMPLOYEE MANAGEMENT SYSTEM");

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.println("\n-------EMPLOYEE DEETAILS----");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Department    : " + dept);
        System.out.println("Salary        : " + salary);

        sc.close();
    }
}

