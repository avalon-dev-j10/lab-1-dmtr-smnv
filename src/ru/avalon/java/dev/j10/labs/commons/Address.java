/*
 * TODO(Студент): Создайте класс Address.
 *
  *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {

    private String country;
    private String city;
    private String street;
    private int building;

    public Address(
            String country,
            String city,
            String street,
            int building) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getBuilding() {
        return building;
    }

}
