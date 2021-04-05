package model;

import java.util.ArrayList;

public class Minimarket {

    private int attepmts;
    private ArrayList<Person> personsIn;

    public Minimarket() {
        attepmts = 0;
        personsIn = new ArrayList<>();
    }

    public int getAttempts() {
        return attepmts;
    }

    public boolean registerPerson(String idNumber , String typeOfIdentificatio){
        return true;
    }
}
