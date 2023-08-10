import java.io.*;

public class EmployeeInfoReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("employeeinfo.txt");

            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
