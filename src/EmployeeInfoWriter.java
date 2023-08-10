import java.io.*;

public class EmployeeInfoWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("employeeinfo.txt");
            Writer writer = new PrintWriter(fileWriter);

            String employeeName = "Peter Sam Joes";
            String department = "Sales";
            String designation = "Manager";
            int salary = 35000;

            writer.write("Employee Name: " + employeeName + "\n");
            writer.write("Department: " + department + "\n");
            writer.write("Designation: " + designation + "\n");
            writer.write("Salary: " + salary + "\n");

            writer.flush();
            writer.close();

            System.out.println("Employee information saved to employeeinfo.txt");
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
