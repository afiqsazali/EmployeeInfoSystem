import java.util.Scanner;

public class EmployeeList {

    final int MAX = 400;
    EmployeeData[] employeelist = new EmployeeData[MAX];
    int employeeCount = 0;

    public void addEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name of the Employee ");
        String firstname = sc.nextLine();

        System.out.print("Enter the last name of the Employee ");
        String lastname = sc.nextLine();

        System.out.print("Enter the street name ");
        String street = sc.nextLine();

        System.out.print("Enter apartment unit (if applicable) ");
        String aptUnit = sc.nextLine();

        System.out.print("Enter the city ");
        String city = sc.nextLine();

        System.out.print("Enter the state ");
        String state = sc.nextLine();

        System.out.print("Enter the zipcode ");
        String zipCode = sc.nextLine();

        System.out.print("Enter the email the Employee ");
        String email = sc.nextLine();

        System.out.print("Enter the government ID of Employee ");
        String govID = sc.nextLine();

        System.out.print("Enter the date of birth of Employee ");
        String bDay = sc.nextLine();

        System.out.print("Enter marital status of Employee ");
        String martialSts = sc.nextLine();

        System.out.print("Enter the spouse name ");
        String spouseName = sc.nextLine();

        System.out.print("Enter the spouse employer's name ");
        String spouseEmployer = sc.nextLine();

        System.out.print("Enter the spouse number ");
        int spouseNumber = sc.nextInt();

        EmployeeData employee = new EmployeeData(firstname,lastname,street,aptUnit,city,state,zipCode,email,govID,bDay,martialSts,spouseName,spouseEmployer,spouseNumber);

        employeelist[employeeCount++] = employee;

    }

    public void printEmployee() {

        System.out.println("hello " + employeelist[0].name.getFullname());

    }



}