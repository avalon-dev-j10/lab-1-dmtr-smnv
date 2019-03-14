package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;

public class Main {

    public static void main(String[] args) {

        String ivanovName2 = "Иванов Иван Иванович";
        String smithName2 = "John Edward Smith";

        String ivanovAddress2 = "Россия, Москва";
        String smithAddress2 = "США, Вашингтон";

        System.out.println(ivanovName2);
        System.out.println(ivanovAddress2);
        System.out.println(smithName2);
        System.out.println(smithAddress2);

        Person ivanovName = new Person("Иван", "", "Иванович", "Иванов");
        Person ivanovAddress = new Person("РФ", "Москва", "Красная площадь", 1);
        Person smithName = new Person("John", "Edward", "", "Smith");
        Person smithAddress = new Person("USA", "Washington", "NW Pennsylvania Ave", 1600);

        System.out.println(ivanovName.getFullName());
        System.out.println(ivanovAddress.getFullAddress());
        System.out.println(smithName.getFullName());
        System.out.println(smithAddress.getFullAddress());

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

 /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом,адресованным
         *    переменной 'smith'.
         */

 /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
