package Challanges.linkedinLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.lang.Math;

public class Data_structures {

    public static Map getOriginalGrades(){
        Map<String,Integer> grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map<String,Integer> grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }

    public static void main(String[] args) {
        Map finalGrade = new HashMap();
        List students = new ArrayList(getOriginalGrades().keySet());
        
        Iterator i = students.iterator();
        int u= 0;
        while (i.hasNext()){
            //az i.next() mindig kell, hogy benne legyen valahol a code-ban, azért hogy az iterator is lépjen, ugy mint az u+1
            i.next();
            int originalScore = (Integer) getOriginalGrades().get(students.get(u));
            //Ha ide is i.next()-t teszek,akkor 2x fog tovább lépni az iterator
            int makeUpScore = (Integer) getMakeUpGrades().get(students.get(u));
            finalGrade.put(students.get(u), Math.max(originalScore,makeUpScore));
            System.out.println(finalGrade);     
            u = u+1; 
        }
        
         
    }

}

