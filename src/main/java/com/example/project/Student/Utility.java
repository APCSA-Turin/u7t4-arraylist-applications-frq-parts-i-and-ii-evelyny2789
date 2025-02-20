package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++){
            Collections.sort(list, new Comparator<Student>(){
            public int compare(Student student1, Student student2) {
                int lastNameCompare = student1.getLastName().compareTo(student2.getLastName());
                if (lastNameCompare != 0) {
                    return lastNameCompare;
                }

                int firstNameCompare = student1.getFirstName().compareTo(student2.getFirstName());
                if (firstNameCompare != 0) {
                    return firstNameCompare;
                }

                return Double.compare(student2.getGpa(), student1.getGpa());
            }
        });
    
    }
    return list;
}
}
