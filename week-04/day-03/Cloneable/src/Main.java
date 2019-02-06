public class Main {

    public static void main(String[] args) {

        Student student = new Student("John", 20, "male", "BME");
        Student johnTheClone = (Student) student.clone();

        System.out.println(student.hashCode());
        System.out.println(johnTheClone.hashCode());
        student.name = "Valaki";

        student.introduce();
        johnTheClone.introduce();
    }
}
