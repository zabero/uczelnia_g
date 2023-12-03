package org.example;

import Administration.Evaluation;
import Administration.HumanResources;
import uczelnia.Course;
import uczelnia.Lecture;
import uczelnia.Lecturer;
import uczelnia.Student;


public class Main {
    public static void main(String[] args) {
        HumanResources.addPerson("Adam", "Kowalski", "1", false);
        HumanResources.addPerson("Jan", "Nowak", "2", false);
        HumanResources.addPerson("Anna", "Konieczna", "1", true);
        HumanResources.addPerson("Krzysztof", "Przypadkowy", "2", true);

        System.out.println("Studenci : ");

        for (Student student : HumanResources.getStudents()) {
            System.out.println(student);
        }
        System.out.println("Wykładowcy : ");

            for (Lecturer item : HumanResources.getLecturers()) {
                System.out.println(item);

        }
  //      System.out.println(HumanResources.getLecturersData());

         //   String [][] array1 =new String [3][2];
         //   array1[2][1] = "test";

        //HumanResources.addPerson("Adam", "Kowalski", 1, false);
        //HumanResources.addPerson("Adam", "Kowalski", 1, false);

        Evaluation.addCourse(new Course("Programowanie w JAVA", 30, HumanResources.getLecturers()[0], new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));
        Evaluation.addCourse(new Course("Programowanie w C#", 35, HumanResources.getLecturers()[1], new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));

        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(0), 10, new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));
        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(0), 5, new Student[] {
                HumanResources.getStudents()[0],
        }));
        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(0), 10, new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));


        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(1), 5, new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));
        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(1), 5, new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));
        Evaluation.addLecture(new Lecture(Evaluation.getCourses().get(1), 5, new Student[] {
                HumanResources.getStudents()[0],
                HumanResources.getStudents()[1],
        }));

        Evaluation.fillResults();
        Evaluation.showresults();
    }
}