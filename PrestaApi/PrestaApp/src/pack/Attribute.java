package pack;

import java.util.List;

public class Attribute {

    public Row row = null;
    public List<Object[]> state = null;

    public Attribute() {
    }

    public Attribute(Row row, List<Object[]> state) {
        this.row = row;
        this.state = state;
    }
}
