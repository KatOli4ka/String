public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - "+fullName);

        System.out.println("Задача 2");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+upperCaseFullName);

        System.out.println("Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        String fullName1New = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — "+fullName1New);

    }
}