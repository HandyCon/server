package ChariO.GiBoo.exception;

public class ObjectNotExistException extends BaseException{
    public ObjectNotExistException(){
        super("target post does not exist");
    }
}
