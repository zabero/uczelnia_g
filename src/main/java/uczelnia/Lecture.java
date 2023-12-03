package uczelnia;

public class Lecture {
    private Course course;
    private int numberOfHours;
    private Student[] participants;
    public Course getCourse() {
        return course;
    }

    public Lecture(Course course, int numberOfHours, Student[] participants) {
        this.course = course;
        this.numberOfHours = numberOfHours;
        this.participants = participants;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public Student[] getParticipants() {
        return participants;
    }

    public void setParticipants(Student[] participants) {
        this.participants = participants;
    }
}
