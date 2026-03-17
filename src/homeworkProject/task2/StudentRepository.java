package homeworkProject.task2;

import java.util.Arrays;

public class StudentRepository {
    private Student[] students;
    private int counter;


    public StudentRepository(int sizeOfStudents) {
        this.students = new Student[sizeOfStudents];
    }

    public Student[] getAllStudents() {
        return students;
    }

    public boolean add(Student newstudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newstudent;
                return true;
            }
        }
        return false;
    }

    public Student findBySurname(String surname) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getSurname().equals(surname)) {
                    return students[i];
                }
            }
        }
        return null;
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getName());
                System.out.println(students[i].getSurname());
                System.out.println(students[i].getYearOfBirthOfBirth());
                System.out.println();
            }
        }

    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student != null) {
                if (student.getId() == id) {
                    return student;
                }
            }
        }
        return null;
    }

    public Student[] getByGroup(String group) {
        //определить кол-во подходящих студентов
        int studentCount = 0;
        for (Student student : students) {
            if (student != null && student.getGroup().equals(group)) {
                studentCount++;
            }
        }
        //нужно создать новый массив соответствующего размера
        Student[] studentGroup = new Student[studentCount];
        int i = 0;

        // заполнить этот массив и вернуть его
        for (Student student : students) {
            if (student != null && student.getGroup().equals(group)) {
                studentGroup[i] = student;
                i++;
            }
        }
        return studentGroup;
    }

    public int getFreeSlotsNumber() {
        return students.length - counter;
    }

    public Student[] sortedBySurname() {
        //TODO: сортируем по фамилии массив и возвращаем егo
        Arrays.sort(students);
                return students;
            }
        }

