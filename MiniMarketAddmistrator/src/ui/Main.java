package ui;
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
        }while (election!=0);

    }

    public int menu(){
        return mainMinimarket.getAttempts();
    }

}
