package Administration;

import uczelnia.Course;
import uczelnia.Lecture;
import uczelnia.Lecturer;
import uczelnia.Student;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.ArrayList;
import java.util.List;

public class Evaluation {
    private static List<Course> courses;
    private static List<Lecture> lectures;
    private static boolean[][] resoults;

    public static List<Course> getCourses() {
        return courses;
    }

    public static void setCourses(List<Course> courses) {
        Evaluation.courses = courses;
    }

    public static List<Lecture> getLectures() {
        return lectures;
    }

    public static void setLectures(List<Lecture> lectures) {
        Evaluation.lectures = lectures;
    }

    static {
        courses = new ArrayList<>();
        lectures = new ArrayList<>();
    }

    public static void addCourse(Course course) {
        getCourses().add(course);
    }

    public static void addLecture(Lecture lecture) {
        getLectures().add(lecture);
    }

    public static String getCoursesData() {
        String result = "";
        for (Course item : Evaluation.getCourses()) {

            result += item;
        }
        return result;
    }

    public static String getLecturesData() {
        String result = "";
        for (Lecture item : Evaluation.getLectures()) {

            result += item;
        }
        return result;
    }

    public static void fillResults() {
        resoults = new boolean[getCourses().size()][HumanResources.getnumberOfStudents()];
        for (int coursesIndex = 0; coursesIndex < getCourses().size(); coursesIndex++) {
            for (int studentIndex = 0; studentIndex < HumanResources.getnumberOfStudents(); studentIndex++) {
                // resoults[coursesIndex][studentIndex] = true;
                int sumaGodzinWykladow = 0;
                for (Lecture item : getLectures()) {
                    if (item.getCourse() == getCourses().get(coursesIndex)) {
                        for (Student participant : item.getParticipants()) {
                            if (participant == HumanResources.getStudents()[studentIndex]) {
                                sumaGodzinWykladow += item.getNumberOfHours();

                            }
                        }
                    }
                }
                if (sumaGodzinWykladow >= getCourses().get(coursesIndex).getNumberOfhours()) {
                    resoults[coursesIndex][studentIndex] = true;
                } else {
                    resoults[coursesIndex][studentIndex] = false;
                }
                resoults[coursesIndex][studentIndex] = sumaGodzinWykladow >= getCourses().get(coursesIndex).getNumberOfhours();
            }
        }
    }

    public static void showresults() {
        for (int coursesIndex = 0; coursesIndex < getCourses().size(); coursesIndex++) {
            System.out.println( courses.get(coursesIndex));
            for (int studentIndex = 0; studentIndex < HumanResources.getnumberOfStudents(); studentIndex++) {
                System.out.println(HumanResources.getStudents()[studentIndex] + (resoults[coursesIndex][studentIndex] ? " - pass" : " - fail"));
            }

        }
    }
}

