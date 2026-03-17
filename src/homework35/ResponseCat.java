package homework35;

public class ResponseCat<T> {

    private int codeResult;
    private String message;
    private T cat;

    public ResponseCat(int codeResult, String message, T cat) {
        this.codeResult = codeResult;
        this.message = message;
        this.cat = cat;
    }

    public int getCodeResult() {
        return codeResult;
    }

    public String getMessage() {
        return message;
    }

    public T getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "ResponseCat{" +
                "codeResult=" + codeResult +
                ", message='" + message + '\'' +
                ", cat=" + cat +
                '}';
    }
}
