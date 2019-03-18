package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Класс Person имеет два перегружаемых конструктора: 1) при вводе имени объекта
 * подставляется конструктор, инициализирующий объект класса Passport; 2) при
 * вводе адреса — объект класса Address. Выбор конструктора осуществляется по
 * составу параметров: 4 стринга = объект класса Passport, 3 стринга + инт =
 * объект класса Address.
 */
public class Person {

    Passport objPassport;
    Address objAddress;

    public Person(
            String name,
            String middleName,
            String patronymic,
            String surname) {
        objPassport = new Passport(name, middleName, patronymic, surname);
    }

    public Person(
            String country,
            String city,
            String street,
            int building) {
        objAddress = new Address(country, city, street, building);
    }

    /**
     * Метод getFullName использует оператор if для выбора вариантов выдачи
     * полного имени; при наличии middle name у объекта, метод обрезает middle
     * name до первой буквы с точкой с помощью метода charAt(0).
     */
    public String getFullName() {

        String objName = objPassport.getName();
        String objMiddleName = objPassport.getMiddleName();
        String objPatronymic = objPassport.getPatronymic();
        String objSurname = objPassport.getSurname();

        if (objMiddleName == null && objPatronymic == null) {
            String fullName = objName + " " + objSurname;
            return fullName;
        } else if (objPatronymic == null) {

            String fullName = objName + " " + objMiddleName.charAt(0) + "." + " " + objSurname;
            return fullName;
        } else if (objMiddleName == null) {
            String fullName = objName + " " + objPatronymic + " " + objSurname;
            return fullName;
        } else {
            String fullName = objName + " " + objMiddleName.charAt(0) + "." + " " + objPatronymic + " " + objSurname;
            return fullName;
        }
    }

    /**
     * Метод getFullAddress выдает полный адрес объекта, конвертируя инт номера
     * дома в строку с помощью метода toString.
     */
    public String getFullAddress() {

        String objCountry = objAddress.getCountry();
        String objCity = objAddress.getCity();
        String objStreet = objAddress.getStreet();
        int objBuilding = objAddress.getBuilding();
        String objBuilding2 = Integer.toString(objBuilding);

        String fullAddress = objCountry + ", " + objCity + ", " + objStreet + ", " + objBuilding2;

        return fullAddress;
    }
}
