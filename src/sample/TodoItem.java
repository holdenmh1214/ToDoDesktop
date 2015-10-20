package sample;

/**
 * Created by holdenhughes on 10/20/15.
 */
public class TodoItem {
    String text;
    Boolean isDone;

    public TodoItem(String text, Boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }
    @Override
    public String toString() {
        String done = "";
        if (isDone) {
            done = "(done)";
        }
        return String.format("%s %s", text, done);
    }
}
