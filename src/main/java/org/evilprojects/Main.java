package org.evilprojects;

import org.evilprojects.user.UserImpl;

public class Main {
    public static void main(String[] args) {
        String personalCode = "60301047621";
        UserImpl user = new UserImpl("Akvarel IDK", personalCode);
        user.setCity("tartu");
        user.setCounty("tartu maakond");
        user.setCountry("estonia");
        System.out.println(user.getBirthdate());
        System.out.println(user.getGender());
        System.out.println(user.getFullBirthPlace());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
    }
}