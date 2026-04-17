package Java8.Streams.Objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Employee> addEmployees(){
        Department departmentNetwork = new Department("Network");
        Department departmentSecurity = new Department("Security");
        Department departmentDev = new Department("Dev");
        Department departmentDevOps = new Department("DevOps");
        Department departmentHygiene = new Department("Hygiene");

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Pankaj",70000, departmentDevOps));
        employee.add(new Employee("Naman",110000, departmentDevOps));
        employee.add(new Employee("Nadeem",80000, departmentDevOps));
        employee.add(new Employee("Sarabjit",60000, departmentDevOps));
        employee.add(new Employee("John",60000, departmentDevOps));

        employee.add(new Employee("Naveen", 50000, departmentNetwork));
        employee.add(new Employee("Sachin", 80000, departmentNetwork ));
        employee.add(new Employee("Abhinav", 60000, departmentNetwork ));
        employee.add(new Employee("Arjun", 40000, departmentNetwork ));
        employee.add(new Employee("Kailash", 40000, departmentNetwork ));

        employee.add(new Employee("Shakshi", 80000, departmentDev ));
        employee.add(new Employee("Sunita", 70000, departmentDev ));
        employee.add(new Employee("Sameer", 65000, departmentDev ));
        employee.add(new Employee("Jasmin", 110000, departmentDev ));
        employee.add(new Employee("Amar", 120000, departmentDev ));

        employee.add(new Employee("Amar", 40000, departmentSecurity ));
        employee.add(new Employee("Birju", 45000, departmentSecurity ));
        employee.add(new Employee("Rakesh", 40000, departmentSecurity ));

        employee.add(new Employee("Ajay", 25000, departmentHygiene ));
        employee.add(new Employee("Rakesh", 25000, departmentHygiene ));
        return employee;
    }
    public static void main(String[] args) {
        List<Employee> employeeList = addEmployees();

        List<Employee> list = employeeList.stream().filter(employee -> employee.salary > 50000).toList();
        list.forEach(System.out::println);

        Employee employee1 = employeeList.stream().max(Comparator.comparingInt(employee -> employee.salary)).orElseThrow(()->new RuntimeException("No Such employee."));
        System.out.println("employee1 = " + employee1);
    }
}
