public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — "+fullName);

        //Задание 2
        //Условие задачи составлено размыто.
        //Не ясно, что точно нужно сделать: исправить только вывод самой переменной на экран или её саму, и потом вывести изменённый результат.

        //Вариант только с выводом (без изменения переменной):
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
        //Вариант с пересозданием переменной:
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);

        //Задание 3
        fullName = "Иванов Семён Семёнович";
        if(fullName.contains("ё")){
            fullName = fullName.replace('ё','е');
        }
        if(fullName.contains("Ё")){
            fullName = fullName.replace('Ё','Е');
        }
        System.out.println("Данные ФИО сотрудника — "+fullName);

    }
}