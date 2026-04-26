package Java8.Streams.Objects;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static List<Employee> addEmployees() {
        Department departmentNetwork = new Department("Network");
        Department departmentSecurity = new Department("Security");
        Department departmentDev = new Department("Dev");
        Department departmentDevOps = new Department("DevOps");
        Department departmentHygiene = new Department("Hygiene");

        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Pankaj", 70000, departmentDevOps));
        employee.add(new Employee("Naman", 110000, departmentDevOps));
        employee.add(new Employee("Nadeem", 80000, departmentDevOps));
        employee.add(new Employee("Sarabjit", 60000, departmentDevOps));
        employee.add(new Employee("John", 60000, departmentDevOps));

        employee.add(new Employee("Naveen", 50000, departmentNetwork));
        employee.add(new Employee("Sachin", 80000, departmentNetwork));
        employee.add(new Employee("Abhinav", 60000, departmentNetwork));
        employee.add(new Employee("Arjun", 40000, departmentNetwork));
        employee.add(new Employee("Kailash", 40000, departmentNetwork));

        employee.add(new Employee("Shakshi", 80000, departmentDev));
        employee.add(new Employee("Sunita", 70000, departmentDev));
        employee.add(new Employee("Sameer", 65000, departmentDev));
        employee.add(new Employee("Jasmin", 110000, departmentDev));
        employee.add(new Employee("Amar", 120000, departmentDev));

        employee.add(new Employee("Amar", 40000, departmentSecurity));
        employee.add(new Employee("Birju", 45000, departmentSecurity));
        employee.add(new Employee("Rakesh", 40000, departmentSecurity));

        employee.add(new Employee("Ajay", 25000, departmentHygiene));
        employee.add(new Employee("Rakesh", 25000, departmentHygiene));
        return employee;
    }

    public static void main(String[] args) {

        List<Employee> employeeList = addEmployees();

        //FILTER SALARY > 50000
        List<Employee> list = employeeList.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .toList();
        for (Employee employee : list) {
            System.out.println(employee.getName() + " : " + employee.getSalary());
        }

        //MAX SALARY EMPLOYEE
        Employee employee1 = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow(() -> new RuntimeException("No Such employee."));
        System.out.println("employee1 = " + employee1);

        //MAX SALARY EMPLOYEE OF EACH DEPT.
        Map<Department, Optional<Employee>> maxSalariedEmpByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
                ));
        maxSalariedEmpByDept.forEach((dept, emp) -> System.out.println(dept + " -> " + emp.orElse(null)));

        //MAX SALARY WITHOUT OPTIONAL
        Map<Department, Employee> maxSalaryEmpByDept2 = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), opt -> opt.orElse(null))
                ));
        maxSalaryEmpByDept2.forEach(((department, employee) ->
                System.out.println(department.getName() + " ==> Name : " + employee.getName() + " and Salary : " + employee.getSalary())
        ));

        //DEPARTMENT WISE EMPLOYEES
        Map<Department, List<String>> departmentWiseEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
        departmentWiseEmployees.forEach((department, names) ->
                System.out.println(department.getName() + " --> " + names)
        );

        System.out.println();
        //DEPARTMENT WISE EMPLOYEES (Department - list of Employee)
        Map<Department, List<Employee>> employeeDepartmentWise = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        employeeDepartmentWise.forEach((dept, empList) -> {
            System.out.println(dept.getName() + " ==> ");
            empList.forEach(e ->
                    System.out.printf("   Name: %s, Salary: %d%n", e.getName(), e.getSalary())
            );
        });
        System.out.println("From GPT");
        employeeDepartmentWise.forEach((dept, empList) ->
                System.out.println(dept.getName() + " ==> " +
                        empList.stream()
                                .map(Employee::getName)
                                .toList()
                )
        );
        System.out.println("Another Style from GPT");
        employeeDepartmentWise.forEach((dept, empList) -> {
            System.out.println(dept.getName() + " ==> ");
            empList.stream()
                    .map(e -> String.format("   Name: %s, Salary: %d", e.getName(), e.getSalary()))
                    .forEach(System.out::println);
        });

    }
}
