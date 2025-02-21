//DateOFAssingment : 21-02-2025
enum ManagerType {
    HR,
    SALES
}

class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee() {}

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private ManagerType type;

    public Manager() {
        super();
    }

    public Manager(String name, int employeeId, double salary, ManagerType type) {
        super(name, employeeId, salary);
        this.type = type;
        setSalary(salary);
    }

    public ManagerType getType() {
        return type;
    }

    public void setType(ManagerType type) {
        this.type = type;
    }

    @Override
    public void setSalary(double salary) {
        if (type == ManagerType.HR) {
            super.setSalary(salary + 10000);
        } else if (type == ManagerType.SALES) {
            super.setSalary(salary + 5000);
        } else {
            super.setSalary(salary);
        }
    }
}

class Clerk extends Employee {
    private int speed;
    private int accuracy;
    private boolean bonusGiven = false;

    public Clerk() {
        super();
    }

    public Clerk(String name, int employeeId, double salary, int speed, int accuracy) {
        super(name, employeeId, salary);
        this.speed = speed;
        this.accuracy = accuracy;
        recalculateSalary();
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        recalculateSalary();
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
        recalculateSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
        recalculateSalary();
    }

    private void recalculateSalary() {
        if (!bonusGiven && speed > 70 && accuracy > 80) {
            super.setSalary(getSalary() + 1000);
            bonusGiven = true;
        }
    }
}

public class EmployeeTester {
    public static void main(String[] args) {
        Manager hrManager = new Manager("Alice", 101, 50000, ManagerType.HR);
        System.out.println("HR Manager Salary: " + hrManager.getSalary());

        Manager salesManager = new Manager("Bob", 102, 50000, ManagerType.SALES);
        System.out.println("Sales Manager Salary: " + salesManager.getSalary());

        Clerk clerk = new Clerk("Charlie", 103, 30000, 65, 75);
        System.out.println("Clerk Salary (initial): " + clerk.getSalary());

        clerk.setSpeed(75);
        clerk.setAccuracy(85);
        System.out.println("Clerk Salary (after qualifying): " + clerk.getSalary());

        clerk.setSpeed(90);
        System.out.println("Clerk Salary (after further improvement): " + clerk.getSalary());
    }
}

/*OUTPUT

HR Manager Salary: 60000.0
Sales Manager Salary: 55000.0
Clerk Salary (initial): 30000.0
Clerk Salary (after qualifying): 31000.0
Clerk Salary (after further improvement): 31000.0

*/
