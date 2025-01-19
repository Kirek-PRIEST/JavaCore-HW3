package task2;

public class Employee {
    String name;
    int salary;
    String position;
    String date;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public Employee(String position, String name, String date, int salary) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Должность = %s\n" +
                "Имя = %s\n" +
                "Дата рождения = %s\n" +
                "ЗП = %d руб\n", position, name, date, salary);
    }
    public boolean compareDate(Employee second){
        return this.date.equals(second.date);
    }
}
