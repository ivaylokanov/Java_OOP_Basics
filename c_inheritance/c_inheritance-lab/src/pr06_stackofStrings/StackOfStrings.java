package pr06_stackofStrings;

import java.util.ArrayList;

public class StackOfStrings {

    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (!this.data.isEmpty()) {
            this.data.remove(this.data.size() - 1);
            return this.data.toString();
        } else {
            return "List is empty";
        }
    }

    public String peek() {

        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.size() == 0;
    }
}





