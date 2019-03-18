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

        Person ivanovName = new Person("Иван", null, "Иванович", "Иванов");
        Person ivanovAddress = new Person("РФ", "Москва", "Красная площадь", 1);
        Person smithName = new Person("John", "Edward", null, "Smith");
        Person smithAddress = new Person("USA", "Washington", "NW Pennsylvania Ave", 1600);

        System.out.println(ivanovName.getFullName());
        System.out.println(ivanovAddress.getFullAddress());
        System.out.println(smithName.getFullName());
        System.out.println(smithAddress.getFullAddress());
    }
}
