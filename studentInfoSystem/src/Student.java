public class Student {
    String studentName;
    int studentNo;
    String classes;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;

    Student(String studentName, int studentNo, Course math, Course physics, Course chemistry) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.avarage = 0;
        this.isPass = false;

    }

    void addBulkExamNote(int math, int physics, int chemisty) {
        if (math <= 100 && math >= 0) {
            this.math.note = math;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemisty >= 0 && chemisty <= 100) {
            this.chemistry.note = chemisty;
        }
    }

    void addBulkExtraNote(int mathExt, int physicsExt, int chemistyExt) {
        if (mathExt <= 100 && mathExt >= 0) {
            this.math.extraNote = mathExt;
        }
        if (physicsExt >= 0 && physicsExt <= 100) {
            this.physics.extraNote = physicsExt;
        }

        if (chemistyExt >= 0 && chemistyExt <= 100) {
            this.chemistry.extraNote = chemistyExt;
        }
    }

    void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 || this.math.extraNote == 0 || this.physics.extraNote == 0 || this.chemistry.extraNote == 0) {
            System.out.println("Notes of courses are not entered");
        } else {
            isCheckPass();
            printNote();
            if (isCheckPass() == true) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

        }

    }

    void calcAverage() {
        this.avarage = ((this.math.note + this.physics.note + this.chemistry.note) * 0.8 + (this.math.extraNote + this.physics.extraNote + this.chemistry.extraNote) * 0.2) / 3;

    }

    boolean isCheckPass() {
        calcAverage();
        if (avarage >= 70) {
            return true;
        } else {
            return false;
        }

    }

    void printNote() {
        System.out.println("Student: " + studentName);
        System.out.println("Math Result(Exam grade , Extra Note)     \t: " + math.note + " , " + math.extraNote);
        System.out.println("Physics Result(Exam grade , Extra Note) \t: " + physics.note + " , " + physics.extraNote);
        System.out.println("Chemistry Result(Exam grade , Extra Note)\t: " + chemistry.note + " , " + chemistry.extraNote);
        System.out.println("Average: " + avarage);

    }


}

