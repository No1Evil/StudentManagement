package org.evilprojects.user.interfaces;

import org.evilprojects.user.PersonalCode;
import org.evilprojects.util.EGender;

import java.time.LocalDate;

public interface IPersonalCode extends IDate, IGender{
    PersonalCode getPersonalCode();

    @Override
    default LocalDate getBirthdate(){
        return getPersonalCode().getDate();
    }

    @Override
    default EGender getGender(){
        return getPersonalCode().getGender();
    }
}
