package s5.cloud.enchere.model.responses;

public class SuccessMessage {
    private String message;

    public SuccessMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
