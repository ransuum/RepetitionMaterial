package patterns.memento;

public class Notepad {
    private String text;

    public Notepad(){

    }

    public Notepad(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento m) {
        this.text = m.getState();
    }
}
