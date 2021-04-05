package model;
import customExceptions.CanNotGoOutException;
import customExceptions.IsMinorException;


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

    public boolean registerPerson(String idNumber , String typeOfIdentification , int day) throws CanNotGoOutException , IsMinorException {
        attepmts+=1;
        boolean succes;
        int penultimateNumber;
        penultimateNumber = idNumber.charAt(idNumber.length()-2);
        if(Type.valueOf(typeOfIdentification).equals(Type.TI)){
             succes = false;
             throw new IsMinorException();

        }else{
            if(!(day%2==0) && penultimateNumber%2==0){
                personsIn.add(new Person(idNumber,typeOfIdentification));
                succes = true;
            }else if((day%2==0) && !(penultimateNumber%2==0)){
                personsIn.add(new Person(idNumber,typeOfIdentification));
                succes=true;

            }else {
                succes = false;
               throw new CanNotGoOutException();

            }
        }


        return succes;


    }


}
