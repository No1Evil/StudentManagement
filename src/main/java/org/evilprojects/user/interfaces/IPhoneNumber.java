package org.evilprojects.user.interfaces;

public interface IPhoneNumber {
    void setPhoneNumber(int number);

    void setCountryCode(int number);

    int getPhoneNumber();

    int getCountryCode();

    default String getFullNumber(){
        return "+" + getCountryCode() + " " + getPhoneNumber();
    }
}
