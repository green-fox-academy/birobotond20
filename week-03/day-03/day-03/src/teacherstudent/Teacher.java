package teacherstudent;

public class Teacher {

    public void teach(Student student){
        System.out.println("teaching...");
        student.learn();
    }

    public void answer(){
        System.out.println("This is my answer.");
    }
}
