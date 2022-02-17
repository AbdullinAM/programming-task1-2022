package programming.task1.studentGroup;

import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
public class StudentGroupImpl implements StudentGroup {

    private Long groupId;
    private List<Person> students;
    private Map<Person, List<Subject>> studentSubjects;

    public StudentGroupImpl(Long groupId, List<Person> students, Map<Person, List<Subject>> studentSubjects) {
        this.groupId = groupId;
        this.students = students;
        this.studentSubjects = studentSubjects;
    }

    public StudentGroupImpl(Long groupId, List<Person> students) {
        this(groupId, students, new HashMap());
    }

    public StudentGroupImpl(Long groupId) {
        this(groupId, new ArrayList(), new HashMap());
    }

    public boolean addPerson(Person person) {
        if (students.contains(person)) return false;
        studentSubjects.put(person, new ArrayList());
        students.add(person);
        return true;
    }

    public boolean removePerson(Person person) {
        if (!students.contains(person)) return false;
        studentSubjects.remove(person);
        students.remove(person);
        return true;
    }

    public void addSubject(Subject subject) {
        studentSubjects.forEach((student, students) -> students.add(subject));
    }

    public void removeSubject(Subject subject) {
        studentSubjects.forEach((student, students) -> students.remove(subject));
    }

    public boolean addGradeByPersonAndSubject(Person person, Subject subject, Grade grade) {
        try {
            students
                    .stream()
                    .filter(student -> student.equals(person))
                    .map(student -> studentSubjects.get(student))
                    .findFirst()
                    .orElseThrow(() -> {
                        throw new IllegalArgumentException("Student does not exist");
                    })
                    .stream()
                    .filter(currentSubject -> currentSubject.equals(subject))
                    .findFirst()
                    .ifPresentOrElse(subjectGrade -> subjectGrade.setGrade(grade), () -> {
                        throw new IllegalArgumentException("Subject does not exist");
                    });
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    public boolean removeGradeByPersonAndSubject(Person person, Subject subject) {
        try {
            students
                    .stream()
                    .filter(student -> student.equals(person))
                    .map(student -> studentSubjects.get(student))
                    .findFirst()
                    .orElseThrow(() -> {throw new IllegalArgumentException("Student does not exist");})
                    .stream()
                    .filter(currentSubject -> currentSubject.equals(subject))
                    .findFirst()
                    .ifPresentOrElse(subjectGrade -> subjectGrade.setGrade(null), () -> {
                        throw new IllegalArgumentException("Subject does not exist");
                    });
            return true;
        } catch (IllegalArgumentException exception) {
            return false;
        }
    }

    public boolean changeGradeByPersonAndSubject(Person person, Subject subject, Grade grade) {
        return addGradeByPersonAndSubject(person, subject, grade);
    }

    public Map<Person, List<Subject>> getStudentSubjects() {
        return studentSubjects;
    }
}
