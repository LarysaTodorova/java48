package myselfWork39.back.dto;

public class Response <T>{

    private T body;
    private String message;

    public Response(T body, String message) {
        this.body = body;
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public String getMessage() {
        return message;
    }
}
