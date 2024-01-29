package bai5;

public class Student {
    private String name;
    private String classes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }
    public Student(){
        name = "huy";
        classes = "C08";
    }
    public static void main(String[] args) {
        Student newStudent = new Student();
        System.out.println("name: "+newStudent.getName());
        System.out.println("class: "+newStudent.getClasses());
    }
}
