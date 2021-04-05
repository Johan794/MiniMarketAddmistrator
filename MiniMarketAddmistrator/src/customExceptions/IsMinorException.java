package customExceptions;

public class IsMinorException extends  Exception {

    public IsMinorException() {
        super("La persona que trata de ingresar al Minimarket es menor de edad");
    }
}
