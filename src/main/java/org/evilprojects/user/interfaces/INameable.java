package org.evilprojects.user.interfaces;

public interface INameable {

    void setFirstName(String firstName);
    void setLastName(String lastName);

    default void setFullName(String fullName){
        String[] s = fullName.split(" ");
        if (s.length >= 2){
            setFullName(s[0].toUpperCase(), s[1].toUpperCase());
        } else {
            setFullName("Error", "Error");
        }
    }

    private void setFullName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    String getFirstName();

    String getLastName();

    default String getFullName(){
        return getFirstName() + getLastName();
    }
}
