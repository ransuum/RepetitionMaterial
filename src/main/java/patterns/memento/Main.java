package patterns.memento;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        Taker taker = new Taker();

        notepad.setText("memento pattern 1");
        taker.save(notepad);
        System.out.println(notepad.getText());

        notepad.setText("memento pattern 2");
        taker.save(notepad);
        System.out.println(notepad.getText());

        notepad.setText("memento pattern 3");
        taker.save(notepad);
        System.out.println(notepad.getText());

        notepad.setText("memento pattern 4");
//        taker.save(notepad); without save
        System.out.println(notepad.getText());

        taker.restore(notepad);
        System.out.println(new Notepad("MEMENTO PATTERN 3 RESTORE").getText());

        taker.restore(notepad);
        System.out.println(notepad.getText());

        taker.restore(notepad);
        System.out.println(notepad.getText());

        taker.restore(notepad);
        System.out.println(notepad.getText());
    }
}
