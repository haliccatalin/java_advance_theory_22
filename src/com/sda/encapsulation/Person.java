package com.sda.encapsulation;

public class Person {
    private String name;
    private String phone;
    private String cnp;

    // overload sau supraincarcare
    // atunci cand avem doi constructori cu parametrii diferiti.
    public Person() {

    }

    public Person(String name, String phone, String cnp) {
//        this.name = name;
//        this.phone = phone;
//        this.cnp = cnp;
        // validam cnp-ul apoi il setam
        this.setCnp(cnp);

        this.setName(name);

        this.setPhone(phone);
    }

    public void setCnp(String cnp) {
        if(cnp.length() == 13) {
            this.cnp = cnp;
        } else {
            System.out.println("CNP Invalid!");
            this.cnp = "";
        }
    }

    public String getCnp() {
        return cnp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return this.getName() + " " + this.getPhone() + " " + this.cnp;
    }
}
