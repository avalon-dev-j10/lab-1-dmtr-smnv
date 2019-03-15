package ru.avalon.java.dev.j10.labs.models;

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
    private String middleName;
    private String patronymic;
    private String surname;
    private String birthDate;
    private String dateOfIssue;
    private String issuedBy;

    public Passport(
            String name,
            String middleName,
            String patronymic,
            String surname) {
        this.name = name;
        this.middleName = middleName;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {

//      char initial = middleName.charAt(0);
//      String temp = Character.toString(initial) + ".";
//      this.middleName = String temp;
//      String temp = middleName.substring(0,1) + ".";
//      this.middleName = temp;
        return middleName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

}
