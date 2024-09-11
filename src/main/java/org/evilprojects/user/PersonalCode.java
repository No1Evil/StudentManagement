package org.evilprojects.user;

import org.evilprojects.util.EGender;

import java.time.LocalDate;

public class PersonalCode extends PersonalCodeParser {

    private final LocalDate date;
    private final EGender gender;

    public PersonalCode(String personalCode) {
        super(personalCode);
        this.date = super.getDate();
        this.gender = super.getGender();
    }

    @Override
    public LocalDate getDate(){
        return date;
    }

    @Override
    public EGender getGender(){
        return gender;
    }
}
