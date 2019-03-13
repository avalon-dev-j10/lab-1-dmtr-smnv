package ru.avalon.java.dev.j10.labs.models;

import java.util.Scanner;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String series;
    private int number;
    private String name;
    private String surname;
    private String patronymic;
    private String middleName;
    private String birthDate;
    private String dateOfIssue;
    private String issuedBy;

    public void setSeries(String series) {
        System.out.println("Enter the series");
        Scanner scanSeries = new Scanner(System.in);
        this.series = scanSeries.next();
    }

    public String getSeries() {
        return series;
    }

    public void setNumber(int number) {
        System.out.println("Enter the number");
        Scanner scanNumber = new Scanner(System.in);
        this.number = scanNumber.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        System.out.println("Enter the name");
        Scanner scanName = new Scanner(System.in);
        this.name = scanName.next();
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        System.out.println("Enter the surname");
        Scanner scanSurname = new Scanner(System.in);
        this.surname = scanSurname.next();
    }

    public String getSurname() {
        return surname;
    }

    public void setPatronymic(String patronymic) {
        System.out.println("Enter the patronymic");
        Scanner scanPatronymic = new Scanner(System.in);
        this.patronymic = scanPatronymic.next();
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setMiddleName(String middleName) {
        System.out.println("Enter the middle name");
        Scanner scanMiddleName = new Scanner(System.in);
        this.middleName = scanMiddleName.next();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setBirthDate(String birthDate) {
        System.out.println("Enter the birth date");
        Scanner scanBirthDate = new Scanner(System.in);
        this.birthDate = scanBirthDate.next();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setDateOfIssue(String dateOfIssue) {
        System.out.println("Enter the date of issue");
        Scanner scanDateOfIssue = new Scanner(System.in);
        this.dateOfIssue = scanDateOfIssue.next();
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setIssuedBy(String issuedBy) {
        System.out.println("Enter who issued");
        Scanner scanIssuedBy = new Scanner(System.in);
        this.issuedBy = scanIssuedBy.next();
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void showSeries() {
        System.out.println("Серия:" + series);
    }

    public void showNumber() {
        System.out.println("Номер:" + number);
    }

    public void showName() {
        System.out.println("Имя:" + name);
    }

    public void showSurname() {
        System.out.println("Фамилия:" + surname);
    }

    public void showPatronymic() {
        System.out.println("Отчество:" + patronymic);
    }

    public void showMiddleName() {
        System.out.println("Второе имя" + middleName.charAt(0) + ".");
    }

    public void showBirthDate() {
        System.out.println("Дата рождения" + birthDate);
    }

    public void showDateOfIssue() {
        System.out.println("Дата выдачи:" + dateOfIssue);
    }

    public void showIssuedBy() {
        System.out.println("Выдан:" + issuedBy);
    }

}

/*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
 */
