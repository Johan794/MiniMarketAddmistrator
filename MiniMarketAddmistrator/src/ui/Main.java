package ui;
import customExceptions.CanNotGoOutException;
import customExceptions.IsMinorException;
import model.Minimarket;
import  java.util.Scanner;

public class Main {
    private  Scanner sc;

    private Minimarket mainMinimarket;

    public Main(){
        sc = new Scanner(System.in);
        mainMinimarket = new Minimarket();
    }

    public static void main(String [] args){
        Main ppal = new Main();
        int election;
        do{
            election = ppal.menu();
            switch (election){
                case 0:
                    System.out.println("Adios!");
                     break;
                default: ppal.operation(election);
            }
        }while (election!=0);

    }

    public int menu(){
        int election=0;
        System.out.println(
                "*****************Este es el menu principal!**************\n"+
                        "¿Que desea hacer hoy?\n" +
                        "[1] Quiero ingresar a una nueva persona al minimarket\n"+
                        "[2] Quiero ver las personas que han tratado de ingresar al Minimarket\n"+
                        "[0] Nada \n"+
                        "********************************************************************"
        );
        election= sc.nextInt();
        return election;
    }
    public  void operation(int election){
        String id , typeOfId;
        int choise=0;
        switch (election){
            case 1: System.out.print("Ingrese el numero de identificacion: ");
                    id = sc.nextLine();
                System.out.println("Indique el tipo de documento\n"+
                                   "[1] Tarjeta de identidad"+"\n"+
                                   "[2] Cedula de ciudadania"+"\n"+
                                   "[3] Pasaporte"+"\n"+
                                   "[4] Cedula Extranjero"+"\n"
                        );
                choise = sc.nextInt();
                typeOfId = typeOfId(choise);
                try {
                    mainMinimarket.registerPerson(id,typeOfId);
                }catch (IsMinorException | CanNotGoOutException ex){
                    ex.printStackTrace();
                    sc.close();
                }
                break;

            case 2: System.out.println("Cantidad de personas que han intentado entrar:"+mainMinimarket.getAttempts());
                 break;


        }

    }

    public String typeOfId(int choise){
        String type = "";
        switch (choise){
            case 1: type = "TI";
                  break;
            case 2: type = "CC";
                       break;
            case 3: type = "PP";
                       break;
            case 4: type = "CE";
                     break;
        }
        return type;
    }

}
