package org.evilprojects.user.interfaces;

import static org.evilprojects.util.StringUtil.splitWithCommas;

public interface IBirthPlace {
    void setCity(String city);
    void setCounty(String county);
    void setCountry(String country);

    String getCity();
    String getCounty();
    String getCountry();

    default String getFullBirthPlace(){
        return splitWithCommas(getCity(), getCounty(), getCountry());
    }
}
