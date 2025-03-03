public class Main {
    public static void main(String[] args) {
        //Задача №1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);

        //Задача №2
        String newFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + newFullName);

        //Задача №3
        String fullNameTwo = "Иванов Семён Семёнович";
        String correctedFullNameTwo = fullNameTwo.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + correctedFullNameTwo);
    }
}