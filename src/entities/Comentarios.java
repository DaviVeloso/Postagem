package entities;

public class Comentarios {
    private String text;

    Comentarios () {

    }

    public Comentarios(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
