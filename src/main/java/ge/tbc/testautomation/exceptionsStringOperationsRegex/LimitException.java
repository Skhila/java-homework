package ge.tbc.testautomation.exceptionsStringOperationsRegex;

public class LimitException extends RuntimeException{
    public LimitException(){
        super();
    }

    public LimitException(String message){
        super(message);
    }
}
