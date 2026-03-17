package lesson28LinkedList;

import java.util.ArrayList;
import java.util.List;

public class CoursRepository {
    private List<Cours> coursList = new ArrayList<>();

   public void addCourse(Cours cours) {
       coursList.add(cours);
   }

   public void PrintAllCourses(List<Cours> courses) {
       System.out.println(courses);
   }

}
