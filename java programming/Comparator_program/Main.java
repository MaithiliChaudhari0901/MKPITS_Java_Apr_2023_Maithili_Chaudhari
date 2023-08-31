import stud.MarksComp;
import stud.NameComp;
import stud.Student;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Student>linkedList = new LinkedList<Student>(); //object create
        Student student1=new Student("Maithili", 78);
        Student student2=new Student("Manali",95);
        Student student3=new Student("sanu",89);
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        Collections.sort(linkedList,new NameComp());
        for(Student stud:linkedList) {
            System.out.println(stud.getName()+" "+stud.getMarks());
        }
    }
}