package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность, наделённая:
 * <ol>
 * <li>именем;
 * <li>паспортными данными;
 * <li>пропиской по месту жительства.
 * </ol>
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
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то возвращет Имя, Фимилию и
     * Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то возвращает Имя,
     * Первую букву второго имени, и Фамилию, разделённые пробелом. После
     * Инициала второго имени должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а есть только Имя и
     * Фамилия, то возвращает их, разделённые пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {

        String objName = objPassport.getName();
        String objMiddleName = objPassport.getMiddleName();
        String objPatronymic = objPassport.getPatronymic();
        String objSurname = objPassport.getSurname();

//      char initial = objMiddleName.charAt(0);
//      String temp = Character.toString(initial) + ".";
//      this.objMiddleName = String temp;
//      String temp = objMiddleName.substring(0,1) + ".";
//      this.middleName = temp;
        if (objMiddleName == null && objPatronymic == null) {
            String fullName = objName + " " + objSurname;
            return fullName;
        } else if (objPatronymic == null) {

//          char initial = objMiddleName.charAt(0);
//          String temp = Character.toString(initial) + ".";
//          this.objMiddleName = String temp;
//          String temp = obj.MiddleName.substring(0,1) + ".";
//          this.objMiddleName = temp;
            String fullName = objName + " " + objMiddleName + " " + objSurname;
            return fullName;
        } else if (objMiddleName == null) {
            String fullName = objName + " " + objPatronymic + " " + objSurname;
            return fullName;
        } else {
            String fullName = objName + " " + objMiddleName + " " + objPatronymic + " " + objSurname;
            return fullName;
        }
    }

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
