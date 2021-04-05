package model;
import customExceptions.CanNotGoOutException;
import customExceptions.IsMinorException;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

 public class MinimarketTest {

     private Minimarket minimarket;

     private void setUpScenary1(){
        minimarket = new Minimarket();
     }

     @Test
     public void registerPersonTest1() {
         setUpScenary1();
         String id = "100045632";
         String type = "CC";
         int day = 8;

         try {
             boolean result = minimarket.registerPerson(id,type,day);
             assertTrue(result);
         } catch (CanNotGoOutException | IsMinorException ex) {
             ex.printStackTrace();
             fail("Se genera excepcion");

         }


     }

     @Test
     public void registerPersonTest2() {
         setUpScenary1();

         String id = "112993802";
         String type = "TI";
         int day = 21;

         try {
             boolean result = minimarket.registerPerson(id,type,day);
             assertFalse(result);
         } catch (CanNotGoOutException | IsMinorException ex) {
             ex.printStackTrace();


         }


     }

     @Test
     public void registerPersonTest3() {
         setUpScenary1();
         String id = "112993802";
         String type = "PP";
         int day = 6;

         try {
             boolean result = minimarket.registerPerson(id,type,day);
             assertFalse(result);
         } catch (CanNotGoOutException | IsMinorException ex) {
             ex.printStackTrace();


         }


     }


}