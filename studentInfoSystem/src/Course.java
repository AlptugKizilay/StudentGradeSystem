public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int extraNote;

    String teacher;


    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.extraNote = 0;




    }
    void addTeacher(Teacher teacher){
        if(this.name.equals(teacher.branch)){
            this.teacher = teacher.tname;

            System.out.println("Teacher were added successfully");
        }else{
            System.out.println("Failed.");
        }
    }
    void printTeacher(){
        if (teacher != null){
            System.out.println("Teacher of the course: " + this.teacher);
        }else {
            System.out.println("Teacher of the course will be announced.");
        }

    }




}
