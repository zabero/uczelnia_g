package uczelnia;

public class Course {
    private String name;
    private int numberOfhours;
    private Student[] participants;
    private Lecturer lecturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfhours() {
        return numberOfhours;
    }

    public void setNumberOfhours(int numberOfhours) {
        this.numberOfhours = numberOfhours;
    }

    public Student[] getParticipants() {
        return participants;
    }

    public void setParticipants(Student[] participants) {
        this.participants = participants;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Course(String name, int numberOfhours, Lecturer lecturer, Student[] participants) {
        this.name = name;
        this.numberOfhours = numberOfhours;
        this.participants = participants;
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfhours=" + numberOfhours +
                ", lecturer=" + lecturer +
                '}';
    }
}
