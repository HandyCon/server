package ChariO.GiBoo.dto;

public class ErrorResponseDto {
    private String message;

    public ErrorResponseDto(){
    }

    public ErrorResponseDto(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(){
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorResponseDto{" +
                "message='" + message + '\'' +
                '}';
    }
}
