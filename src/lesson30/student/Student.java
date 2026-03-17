package lesson30.student;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private Map<String, Integer> subjects;


    public Student(String name) {
        this.name = name;
        this.subjects = new HashMap<>();

    }

    public String getName() {
        return name;
    }

    public void addSubject(String subject, Integer grade) {
         if (subjects.containsKey(subject)) {
           System.out.println("Student has jet this subject");
        }else {
        subjects.put(subject, grade);
    }
}

    public void printStudent() {
        System.out.println("Student: " + name);
        for (Map.Entry<String,Integer> entry : subjects.entrySet()) {
            System.out.println("subject: " +entry.getKey() + ", value: " +entry.getValue() );
        }
    }
}


