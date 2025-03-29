package bridgelabz.mapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class EmployeeGrouper {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
        System.out.println(groupedEmployees); // Output: {HR=[Alice, Carol], IT=[Bob]}
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            if (!departmentMap.containsKey(emp.department)) {
                departmentMap.put(emp.department, new ArrayList<>());
            }
            departmentMap.get(emp.department).add(emp);
        }

        return departmentMap;
    }
}
//{HR=[Alice, Carol], IT=[Bob]}