package ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer employeeId;
    private String employeeName;

    public Employee(Integer employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
    }
}

public class ArrayListSerialization {
    public static void main(String[] args) {

        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Employee(111, "A"));
        listOfEmployees.add(new Employee(222, "B"));
        listOfEmployees.add(new Employee(333, "C"));
        listOfEmployees.add(new Employee(444, "D"));
        listOfEmployees.add(new Employee(555, "E"));

        String filePath = "D:\\new\\Employee.txt";

        // Serialization
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(listOfEmployees);
            System.out.println("Object data stored successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        // De-Serialization
        try (FileInputStream fin = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fin)) {

            @SuppressWarnings("unchecked")
            ArrayList<Employee> empList = (ArrayList<Employee>) ois.readObject();

            System.out.println("Employee List from File:");
            empList.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}