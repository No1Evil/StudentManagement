package org.evilprojects.user;

import org.evilprojects.user.interfaces.IUser;

import java.util.UUID;

public abstract class AUser implements IUser{
    private final UUID uuid = UUID.randomUUID();
    private final PersonalCode personalCode;
    private String address;
    private String firstName, lastName;
    private String city, county, country, citizenShip;
    private int phoneNumber;
    private int countryCode;


    public AUser(String fullname, String personalCode){
        setFullName(fullname);
        this.personalCode = new PersonalCode(personalCode);
    }

    @Override
    public PersonalCode getPersonalCode() {
        return personalCode;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getCounty() {
        return county;
    }

    @Override
    public void setCitizenship(String citizenship) {
        this.citizenShip = citizenship;
    }

    @Override
    public String getCitizenship() {
        return citizenShip;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCity(String city) {
        this.city = city.toUpperCase();
    }

    @Override
    public void setCounty(String county) {
        this.county = county.toUpperCase();
    }

    @Override
    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }

    @Override
    public void setMail(String address) {
        this.address = address;
    }

    @Override
    public String getMail() {
        return address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    @Override
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public int getCountryCode() {
        return countryCode;
    }
}
