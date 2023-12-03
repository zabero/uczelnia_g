package Administration;
import uczelnia.Lecturer;
import uczelnia.Student;
public class HumanResources {
    //Stałe
    public static final int maxPeople = 10;

    //pols statyczne

    public static int numberOfStudents;
    public static int numberOfLecturers;
    private static Student[] students;
    private static Lecturer[] lecturers;

    private static double[] grades;

    public static int getnumberOfStudents() {
        return numberOfStudents;
    }

    public static void setnumberOfStudents(int numberOfStudents) {
        HumanResources.numberOfStudents = numberOfStudents;
    }

    public static int getnumerOfLecturers() {
        return numberOfLecturers;
    }

    public static void setnumerOfLecturers(int numerOfLecturers) {
        HumanResources.numberOfLecturers = numerOfLecturers;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static void setStudents(Student[] students) {
        HumanResources.students = students;
    }

    public static Lecturer[] getLecturers() {
        return lecturers;
    }

    public static void setLecturers(Lecturer[] lecturers) {
        HumanResources.lecturers = lecturers;
    }

    public static double[] getGrades() {
        return grades;
    }

    public static void setGrades(double[] grades) {
        HumanResources.grades = grades;
    }

    static {
        numberOfLecturers = 0;
        numberOfStudents = 0;
        lecturers = new Lecturer[maxPeople];
        students = new Student[maxPeople];
        grades = new double[]{2, 3, 3.5, 4, 4.5, 5, 5.5};
    }

    public static void addPerson(String firstName, String lastName, String number, boolean isLecturer) {
        if (isLecturer) {
            if (numberOfLecturers < maxPeople) {
                lecturers[numberOfLecturers++] = new Lecturer(firstName, lastName, Integer.parseInt(number));
            }
        } else {
            if (numberOfStudents < maxPeople) {
                students[numberOfStudents++] = new Student(firstName, lastName, number);
            }
        }
    }

    public static String getLecturersData() {
        String result = "";
        for (Lecturer item : HumanResources.getLecturers()) {
            if (item == null) {
                break;
            }
            result += item;
        }
        return result;
    }
}