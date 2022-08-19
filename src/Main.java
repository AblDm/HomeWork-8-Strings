public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задание 1");

       String firstName = "Ivan";
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
        String fullName =  lastName  + ' '+ firstName + ' '+ middleName ;
        System.out.print("ФИО сотрудника — " + fullName + "\n" );

        //task 2
        System.out.println("Задание 2");
        System.out.print("Данные ФИО сотрудника для заполнения отчёта — "
                + fullName.toUpperCase() + "\n" );

        //task 3
        System.out.println("Задание 3");
        firstName = firstName.replace("Ivan", "Семён");
        middleName = middleName.replace("Ivanovich", "Семёнович");
        lastName = lastName.replace("Ivanov", "Иванов");
        fullName = lastName  + ' '+ firstName + ' '+ middleName;
        fullName = fullName.replace("ё", "е");
        System.out.print("ФИО сотрудника — " + fullName + "\n" +
                "*обратите внимание что буква \"Ё\" не  используется в кодировке системы.");

    }


}
