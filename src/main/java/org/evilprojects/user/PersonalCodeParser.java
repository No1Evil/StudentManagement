package org.evilprojects.user;

import org.evilprojects.util.EGender;

import java.time.LocalDate;

import static org.evilprojects.util.StringUtil.combineChars;

public class PersonalCodeParser {

    private final String personalCode;

    protected PersonalCodeParser(String personalCode){
        this.personalCode = personalCode;
    }

    private char[] getCodeChars(){
        return personalCode.toCharArray();
    }

    private int getGenderValue(){
        return Character.getNumericValue(getCodeChars()[0]);
    }

    protected EGender getGender(){
        return switch (getGenderValue()) {
            case 1, 3, 5 -> EGender.MALE;
            case 2, 4, 6 -> EGender.FEMALE;
            default -> EGender.NONE;
        };
    }

    protected LocalDate getDate(){
        return LocalDate.of(getYear(), getMonth(), getDay());
    }

    private int getYear(){
        int year = switch (getGenderValue()) {
            case 1, 2 -> 1800;
            case 3, 4 -> 1900;
            case 5, 6 -> 2000;
            default -> 0;
        };
        return year + combineCharsHelper(1, 2);
    }

    private int getMonth(){
        return combineCharsHelper(3, 4);
    }

    private int getDay(){
        return combineCharsHelper(5, 6);
    }

    private int combineCharsHelper(int i, int j){
        char[] chars = getCodeChars();
        return Integer.parseInt(combineChars(chars[i], chars[j]));
    }
}
