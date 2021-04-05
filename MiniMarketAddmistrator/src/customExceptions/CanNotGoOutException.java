package customExceptions;

public class CanNotGoOutException  extends  Exception{

    public CanNotGoOutException() {
        super("La persona no puede salir el dia de hoy debido al digito de su identificacion");
    }
}
