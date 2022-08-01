public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101", "Math");
        Course physics = new Course("Physics", "PHYS101", "Phys");
        Course chemistry = new Course("Chemistry", "CHEM101", "Chem");


        Teacher t1 = new Teacher("Alp", 104, "Mathematics");
        Teacher t2 = new Teacher("Ozge", 105, "Physics");
        Teacher t3 = new Teacher("Enes", 106, "Mathematics");
        Teacher t4 = new Teacher("Bal",107,"Chemisty");

        math.addTeacher(t1);
        math.addTeacher(t3);
        math.addTeacher(t4);

        math.printTeacher();
        physics.printTeacher();


        Student s1 = new Student("Ruzgar", 301, math, physics, chemistry);
        s1.addBulkExamNote(60, 70, 50);
        s1.addBulkExtraNote(100, 100, 90);
        s1.isPass();

        Student s2 = new Student("Murat", 302, math, physics, chemistry);
        s2.addBulkExamNote(100, 100, 100);
        s2.addBulkExtraNote(100, 100, 100);
        s2.isPass();


        Student s3 = new Student("Ege", 303, math, physics, chemistry);
        s3.addBulkExamNote(90, 80, 10);
        s3.addBulkExtraNote(90, 90, 90);
        s3.isPass();





    }
}
