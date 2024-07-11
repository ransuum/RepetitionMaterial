package patterns.memento;

import java.util.Stack;

public class Taker {
    private Stack<Memento> mementos = new Stack<>();

    public void save(Notepad notepad) {
        mementos.push(notepad.save());
    }

    public void restore(Notepad notepad) {
        if (!mementos.isEmpty()) {
            notepad.restore(mementos.pop());
        } else System.out.println("No notepad found");
    }
}
