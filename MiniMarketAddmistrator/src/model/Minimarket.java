package model;
import customExceptions.CanNotGoOutException;
import customExceptions.IsMinorException;

import java.time.LocalDate;
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

    public void registerPerson(String idNumber , String typeOfIdentification) throws CanNotGoOutException , IsMinorException {
        attepmts+=1;
        int day;
        int penultimateNumber;
        day = LocalDate.now().getDayOfMonth();
        penultimateNumber = idNumber.charAt(idNumber.length()-2);
        if(Type.valueOf(typeOfIdentification).equals(Type.TI)){
             throw new IsMinorException();
        }else{
            if(day%2==0 && penultimateNumber%2==0){
                personsIn.add(new Person(idNumber,typeOfIdentification));
            }else if(!(day%2==0) && !(penultimateNumber%2==0)){
                personsIn.add(new Person(idNumber,typeOfIdentification));
            }else {
               throw new CanNotGoOutException();
            }
        }


    }


}
