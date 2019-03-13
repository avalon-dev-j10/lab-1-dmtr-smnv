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

import java.util.Scanner;

public class Address {

    private String country;
    private String city;
    private String street;
    private int building;

    public void setCountry(String country) {
        System.out.println("Enter the country");
        Scanner scanCountry = new Scanner(System.in);
        this.country = scanCountry.next();
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        System.out.println("Enter the city");
        Scanner scanCity = new Scanner(System.in);
        this.city = scanCity.next();
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        System.out.println("Enter the street");
        Scanner scanStreet = new Scanner(System.in);
        this.street = scanStreet.next();
    }

    public String getStreet() {
        return street;
    }

    public void setBuilding(int building) {
        System.out.println("Enter the building");
        Scanner scanBuilding = new Scanner(System.in);
        this.building = scanBuilding.nextByte();
    }

    public int getBuilding() {
        return building;
    }

}
