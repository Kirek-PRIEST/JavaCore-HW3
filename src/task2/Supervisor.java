package task2;

public class Supervisor extends Employee {
    public Supervisor(String position, String name, String date, int salary) {
        super(position, name, date, salary);
    }

    public static void salaryUp(Employee[] emp, int up) {
        for (Employee e : emp) {
            if (!e.getClass().equals(Supervisor.class)) {
                e.setSalary(e.getSalary() + up);
            }
        }
    }


}
