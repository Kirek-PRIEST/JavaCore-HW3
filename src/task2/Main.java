package task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
         создаём массив сотрудников
         */
        Employee[] staff = new Employee[5];
        Random rnd = new Random();
        staff[0] = new Supervisor(
                "Руководитель",
                "Max",
                rnd.nextInt(1950, 2001) + "-" + rnd.nextInt(1, 13) + "-" + rnd.nextInt(1, 28),
                40000);

        for (int i = 1; i < staff.length; i++) {
            staff[i] = new Employee(
                    "Планктон",
                    "Bill " + i,
                    rnd.nextInt(1950, 2001) + "-" + rnd.nextInt(1, 13) + "-" + rnd.nextInt(1, 28),
                    rnd.nextInt(10000, 25000));
        }
        /*
        печатаем сотрудников до повышения ЗП
         */
        System.out.println("ЗП до повышения");
        printStaff(staff);
        Supervisor.salaryUp(staff, 5000); // повышаем ЗП
        /*
        Печатаем сотрудников после повышения ЗП
         */
        System.out.println("==================");
        System.out.println("ЗП после повышения");
        printStaff(staff);
        /*
        меняем дату рождения сотрудника
        */
        staff[1].setDate(staff[2].getDate());
        System.out.println(staff[1].compareDate(staff[2]));
        System.out.println(staff[2].compareDate(staff[3]));
    }
    public static void printStaff(Employee[] staff){
        for (Employee e : staff) {
            System.out.println(e);
        }
    }
}