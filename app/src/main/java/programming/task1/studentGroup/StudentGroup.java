package programming.task1.studentGroup;

public interface StudentGroup {

    boolean addPerson(Person person);
    boolean removePerson(Person person);

    void addSubject(Subject subject);
    void removeSubject(Subject subject);

    boolean addGradeByPersonAndSubject(Person person, Subject subject, Grade grade);
    boolean removeGradeByPersonAndSubject(Person person, Subject subject);
    boolean changeGradeByPersonAndSubject(Person person, Subject subject, Grade grade);

}
