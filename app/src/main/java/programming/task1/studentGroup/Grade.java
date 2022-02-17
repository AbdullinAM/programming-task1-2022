package programming.task1.studentGroup;

import lombok.Data;

@Data
public class Grade<T> {

    private T value;

    public Grade(T value) {
        this.value = value;
    }

    public String toString() {
        return "'" + value + "'";
    }
}
