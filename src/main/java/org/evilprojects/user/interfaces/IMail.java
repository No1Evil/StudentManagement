package org.evilprojects.user.interfaces;

public interface IMail {
    void setMail(String mail);

    String getMail();

    default String[] getMailExtension(){
        return getMail().split("@");
    }
}
