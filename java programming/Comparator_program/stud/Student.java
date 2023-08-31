package stud;
public class Student  {
    private String name;
    private int marks;
    public Student (String name,int marks) {  //create parameterize constructor
        this.name=name;
        this.marks=marks;
    }
    public String getName() {    //getName method use
        return name;
    }
    public int getMarks() {      //getMarks method use
        return marks;
    }
}

