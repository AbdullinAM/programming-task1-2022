package programming.task1.studentGroup;

import lombok.Getter;

@Getter
public class Subject {

    private Grade grade;
    private String subject;

    public Subject(String subject, Grade grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public Subject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Subject{grade=" + grade +
                ", subject='" + subject + '\'' +
                '}';
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
