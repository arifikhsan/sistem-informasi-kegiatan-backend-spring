package sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.view;

public class MessageView {
    private String message;

    public MessageView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
