package teacherstudent;

public class Student {

    public void learn(){
        System.out.println("Student learning...");
    }

    public void question(Teacher teacher){
        System.out.println("Asking question...");
        teacher.answer();
    }
}
