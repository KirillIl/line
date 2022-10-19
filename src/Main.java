public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        // Напишите четыре строки:
        // первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        // третья с именем lastName — для хранения фамилии;
        // четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        // Выведите в консоль фразу: “ФИО сотрудника — ….” В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        System.out.println("Задание 2");
        // Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        // Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName );
        System.out.println();
        System.out.println("Задание 3");
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);


    }
}